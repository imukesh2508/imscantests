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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

WebUI.scrollToElement(findTestObject('Object Repository/Reports/clickOnReports'), 5)
//Click on reports tab
WebUI.click(findTestObject('Object Repository/Reports/clickOnReports'))
Thread.sleep(3000)

//click on Create Reports
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/CreateReports'))

Thread.sleep(30000);

//Enter the Report name
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/ReportName'))
WebUI.setText(findTestObject('Object Repository/Reports/ReportCreation/ReportName'),findTestData('ImScanDataSource').getValue(1, 42))

//Check Generate pdf option
WebUI.check(findTestObject('Object Repository/Reports/ReportCreation/GeneratePdfcheckbox'))

//enter the report title
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/ReportTitle'))
WebUI.setText(findTestObject('Object Repository/Reports/ReportCreation/ReportTitle'),findTestData('ImScanDataSource').getValue(2, 42) )

//Click on Continue
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/ContinueOnGeneralSettingd'))

Thread.sleep(1000)

//select a 1st doc type
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/Select1stDoctype'))

//select a 1st left operand
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/Select1stleftOperand'))

//select contains Operator
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/ContainsOperator'))

//enter a value in The value field
WebUI.setText(findTestObject('Object Repository/Reports/ReportCreation/ValueField'), "a")

//Click on the Add button
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/AddButton'))

//Click on the Continue button
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/ContinueOnCondSettings'))
Thread.sleep(1000)
//check the index field
WebUI.check(findTestObject('Object Repository/Reports/ReportCreation/SelectAnIndex'))

//Click on the Done button
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/DoneButtonIndexReport'))

//Click on the Continue button
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/ContinueOnIndexReports'))

Thread.sleep(1000)
//Click on Finish button
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/Finish'))

//focus on the Popup
WebUI.focus(findTestObject('Object Repository/Reports/ReportCreation/FinishPopUp'))

//Click on Yes
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/Reports/ReportCreation/YesOnPopup'))

//Wait for sometime
Thread.sleep(2000)

WebUI.waitForElementVisible(findTestObject('Object Repository/Reports/ReportsHomePage'), 10)




