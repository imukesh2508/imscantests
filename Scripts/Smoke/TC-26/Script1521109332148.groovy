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

//click on Users
WebUI.click(findTestObject('Object Repository/Users/Users'))
WebUI.delay(5)

//click on Create User
WebUI.click(findTestObject('Object Repository/Users/CreateUser'))

//wait for the PopUp
WebUI.waitForAlert(5)

//focus on the PopUp
WebUI.focus(findTestObject('Object Repository/Users/UsersPopUp/Popup'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Users/Firstname'), 2)

//Enter the firstName
WebUI.focus(findTestObject('Object Repository/Users/Firstname'))

WebUI.setText(findTestObject('Object Repository/Users/Firstname'), findTestData('ImScanDataSource').getValue(1, 8))

WebUI.delay(3)

//Enter the LastName
WebUI.focus(findTestObject('Object Repository/Users/Lastname'))

WebUI.setText(findTestObject('Object Repository/Users/Lastname'), findTestData('ImScanDataSource').getValue(2, 8))

//Enter the username
WebUI.focus(findTestObject('Object Repository/Users/Username'))

WebUI.setText(findTestObject('Object Repository/Users/Username'), findTestData('ImScanDataSource').getValue(3, 8))

//Enter the Password
WebUI.focus(findTestObject('Object Repository/Users/Password'))

WebUI.setText(findTestObject('Object Repository/Users/Password'), 'Stevenson')

//enter email Id
WebUI.focus(findTestObject('Object Repository/Users/emailId'))

WebUI.setText(findTestObject('Object Repository/Users/emailId'), findTestData('ImScanDataSource').getValue(4, 8))

//Select the Role
WebUI.click(findTestObject('Object Repository/Users/RoleSelection'))

//select User Role
WebUI.selectOptionByValue(findTestObject('Object Repository/Users/RoleSelection'), findTestData('ImScanDataSource').getValue(9, 8), false)


//select the Available doctype
WebUI.click(findTestObject('Object Repository/Users/SelectAvailableDoctypes'))

//click on the right arrow
WebUI.click(findTestObject('Object Repository/Users/ClickOnRightbutton'))

//Scroll to specific Element
WebUI.scrollToElement(findTestObject('Object Repository/Users/SelectAvailableDept'), 2)

//select  the Avaialable Departments
WebUI.click(findTestObject('Object Repository/Users/SelectAvailableDept'))

WebUI.delay(2)

//click on the right arrow
WebUI.click(findTestObject('Object Repository/Users/arrow/span_glyphicon glyphicon-chevr'))

//click On save
WebUI.click(findTestObject('Object Repository/Users/ClickonSaveOfPopup'))

