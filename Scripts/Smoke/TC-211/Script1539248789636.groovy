import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 38))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 38))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Home/VerifyHomePage'), 10)

//Home tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Home/ClickOnHome'), 5)

//Scanning tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Scanning/ClickOnScanning'), 5)

//Importing tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Import/ClickOnImport'), 5)

//Indexing tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Indexing/Click_On_Indexing'), 5)

//Retrieval tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Retreival/ClickOnRetrieval'), 5)

//Dynamic forms tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/DynamicForms/ClickOnDynamic'), 5)

//workflow retreival tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Workflow/ClickOnWorkflow'), 5)

//Batch tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Batch Details/Click_on_batch_Details'), 5)

//Document Type Setup
WebUI.waitForElementVisible(findTestObject('Object Repository/DocumentType/ClickOnDocumentType'), 5)  

//Users tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Users/Users'),5)

//Roles tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Role_tab/ClickOnRoles'),5)

//Departments tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Departments/ClickonDepartments'), 5)

//Settings tab is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Settings/ClickOnSettings'), 5)

//Reports tab is dispalyed 
WebUI.waitForElementVisible(findTestObject('Object Repository/Reports/clickOnReports'), 5)

