import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.lang.invoke.LambdaForm.Name
import java.lang.reflect.Field

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
//enter the user name
WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))
//Enter the Password
WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))
//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))
//delay
WebUI.delay(2)
//click on Document Type
WebUI.click(findTestObject('Object Repository/DocumentType/ClickOnDocumentType'))

//click on create Document Type
WebUI.click(findTestObject('Object Repository/DocumentType/ClickOnCreateDocument'))

//enter the document Type Name
WebUI.sendKeys(findTestObject('Object Repository/DocumentType/Enter_DocumentName'), findTestData('ImScanDataSource').getValue(3, 1))

//Enter the folder Name
WebUI.click(findTestObject('Object Repository/DocumentType/Enter-ClickOnFolderName'))
//Click On Continue button
WebUI.click(findTestObject('Object Repository/DocumentType/ContinueButton'))
//Delay
WebUI.delay(2)
//Add Field a Manual Field
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/AddField'), 1)
//focus
WebUI.focus(findTestObject('Object Repository/DocumentType/AddindexFieldPopUp'))
//Verify popup Displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/DocumentType/AddindexFieldPopUp'), 2)

//Enter the field
WebUI.sendKeys(findTestObject('Object Repository/DocumentType/NameOFIndexField'),'cost')

//ADD the type of index field
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/TypeOfIndex'), 1)
//enter the decimal Places
WebUI.sendKeys(findTestObject('Object Repository/DocumentType/DecimalPlaces'), '0')

//enter the Size
WebUI.sendKeys(findTestObject('Object Repository/DocumentType/Size'), '9')

//Add trigger
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/AddTrigger'), 1)

//Click On Next
WebUI.click(findTestObject('Object Repository/DocumentType/Next'))

//delay
WebUI.delay(3)
//dropdown to select database
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/Database'), 2)

//delay
WebUI.delay(2)

//select dropDown Data Table
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/DataTable'), 6)

//delay
WebUI.delay(3)
//select dropDown data coloumn
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/Data Column'), 3)

//check the one backfill
WebUI.check(findTestObject('Object Repository/DocumentType/AddBackFill'))
//delay
WebUI.delay(3)
//Click on change
WebUI.click(findTestObject('Object Repository/DocumentType/ChangeBackFillName'))
//change the name of backfill

WebUI.sendKeys(findTestObject('Object Repository/DocumentType/BackFillRenaming'), 'EmpID')

WebUI.delay(3)
//Click On Save
WebUI.click(findTestObject('Object Repository/DocumentType/Save'))
//scroll to Save and Continue
WebUI.scrollToElement(findTestObject('Object Repository/DocumentType/SaveAndContinue'), 2)
//focus on the button
WebUI.focus(findTestObject('Object Repository/DocumentType/SaveAndContinue'))
//wait for 3sec 
WebUI.click(findTestObject('Object Repository/DocumentType/SaveAndContinue'))

//wait for 5sec
WebUI.click(findTestObject('Object Repository/DocumentType/LastPageSaveAndcontinue'))

//Wait for last page
WebUI.click(findTestObject('Object Repository/DocumentType/ContinueOnLastPage'))
