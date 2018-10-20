import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod

import org.apache.ivy.osgi.filter.CompareFilter.Operator
import org.codehaus.groovy.tools.DocGenerator.DocType

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.imageio.plugins.wbmp.WBMPImageReader
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))
WebUI.delay(2)
//verfiy Home Page is displayed or not
WebUI.verifyElementPresent(findTestObject('Object Repository/Create_a_New_Dept/VerfiyHomePageDisplayed'), 3)

WebUI.delay(3)

//Click on Retrieval
WebUI.click(findTestObject('Object Repository/Retreival/ClickOnRetrieval'))
//focus on Slider
WebUI.focus(findTestObject('Object Repository/Retreival/LeftSlider'))
//focus on DOctype
WebUI.focus(findTestObject('Object Repository/Retreival/SelectDocType'))
//select a DocType
WebUI.selectOptionByValue(findTestObject('Object Repository/Retreival/SelectDocType'), findTestData('ImScanDataSource').getValue(1, 23), false)

//select a index fields
WebUI.selectOptionByValue(findTestObject('Object Repository/Retreival/SelectIndexFields'), findTestData('ImScanDataSource').getValue(2, 23), false)

//Select a Operator
WebUI.selectOptionByIndex(findTestObject('Object Repository/Retreival/SelectOperator'),findTestData('ImScanDataSource').getValue(3, 23) )