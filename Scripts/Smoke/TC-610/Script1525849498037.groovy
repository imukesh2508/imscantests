import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

//verfiy Home Page is displayed or not
WebUI.verifyElementPresent(findTestObject('Object Repository/Create_a_New_Dept/VerfiyHomePageDisplayed'), 3)

WebUI.delay(3)

//click on Import
WebUI.click(findTestObject('Object Repository/Import/ClickOnImport'))

//wait for the page to load
WebUI.delay(15)

//Focus on the PopUp
WebUI.focus(findTestObject('Object Repository/Import/Import_PopUP'))


//upload a file
WebUI.uploadFile(findTestObject('Object Repository/Import/Browse'), findTestData('ImScanDataSource').getValue(4, 1))

//click OK
WebUI.click(findTestObject('Object Repository/Import/ClickOnOK(fileUpload)'))
// load the file
WebUI.delay(10)


//select the document type
WebUI.selectOptionByIndex(findTestObject('Object Repository/Import/SelectDocType'), 4)


//click on complete
WebUI.click(findTestObject('Object Repository/Import/completebutton'))

WebUI.delay(10)
/*WebUI.click(findTestObject('Object Repository/Indexing/Click_On_Indexing'))
WebUI.delay(5)
*/
/*WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Indexing/Click_On_Indexing'))
//WebUI.scrollToElement(findTestObject('Object Repository/Indexing/Click_On_Indexing'), 5)

//Click on Indexing Screen
WebUI.click(findTestObject('Object Repository/Indexing/Click_On_Indexing'))

//Click on Batch No
WebUI.click(findTestObject('Object Repository/Indexing/BatchNO'))

//again click on Batch No
WebUI.click(findTestObject('Object Repository/Indexing/BatchNO'))

//delay
WebUI.delay(2)
//focus on the 1st element (actually last)
WebUI.focus(findTestObject('Object Repository/Indexing/Last_Indexed_Batch'))

//Click on Edit icon of 1st Batch
WebUI.click(findTestObject('Object Repository/Indexing/Edit_1st_Batch'))
*/



