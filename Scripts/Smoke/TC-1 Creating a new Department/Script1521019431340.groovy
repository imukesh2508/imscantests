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

//verfiy Home Page is displayed or not
WebUI.verifyElementPresent(findTestObject('Object Repository/Create_a_New_Dept/VerfiyHomePageDisplayed'), 3)

WebUI.delay(3)

//click on departments
WebUI.scrollToElement(findTestObject('Object Repository/Create_a_New_Dept/ClickOnDepartments'), 3)
WebUI.click(findTestObject('Object Repository/Create_a_New_Dept/ClickOnDepartments'))

WebUI.delay(2)

//click on create Department
WebUI.click(findTestObject('Object Repository/Create_a_New_Dept/ClickOnCreateDept'))

//wait for Popup
WebUI.waitForAlert(2)

//verify the PopUp is dispalyed or Not
WebUI.verifyElementVisible(findTestObject('Object Repository/Create_a_New_Dept/CreateDeptPopup/PopUpforDept/h4_Create Department'))

//Enter the code
WebUI.setText(findTestObject('Object Repository/Create_a_New_Dept/CreateDeptPopup/PopUpforDept/input_Code'), findTestData('ImScanDataSource').getValue(1, 19))

//Enter the name of Dept
WebUI.setText(findTestObject('Object Repository/Create_a_New_Dept/CreateDeptPopup/PopUpforDept/input_Name'), findTestData('ImScanDataSource').getValue(2, 19))

//Click On save
WebUI.click(findTestObject('Object Repository/Create_a_New_Dept/ClickOnSavePopup'))

//Check  whether displayed
//WebUI.setText(findTestObject('Object Repository/Search/Search_Inspect'), 'Nial1265')
String var1 = WebUI.setText(findTestObject('Object Repository/Search/Search_Inspect'), findTestData('ImScanDataSource').getValue(1, 19))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create_a_New_Dept/verifyDisplayedOrNot/td_Law1'), 5)

String var = WebUI.getText(findTestObject('Object Repository/Create_a_New_Dept/verifyDisplayedOrNot/td_Law1'))

if (var1 == var) {
    println('pass')
}

