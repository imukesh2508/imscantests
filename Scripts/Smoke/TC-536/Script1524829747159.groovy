import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

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
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.By.ByXPath

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))
//verify that the home page is displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Home/VerifyHomePage'), 5)

//Scroll to Indexing
WebUI.scrollToElement(findTestObject('Object Repository/Indexing/Click_On_Indexing'), 2)
//Click on Indexing
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

//Wait
WebUI.delay(3)
for(int i=0;i<=1;i++) {
//focus on Save and Cont
if(WebUI.verifyElementPresent(findTestObject('Object Repository/Indexing/SaveAndCont'),2)==true){
	WebUI.click(findTestObject('Object Repository/Indexing/SaveAndCont'))
	WebUI.delay(5)
}
}
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Indexing/Complete'))

//PopUp for Indexing Batch
WebUI.focus(findTestObject('Object Repository/Indexing/PopforIndexing'))
WebUI.focus(findTestObject('Object Repository/Indexing/Footer'))
WebUI.click(findTestObject('Object Repository/Indexing/ClickYesOnPopUp'))

