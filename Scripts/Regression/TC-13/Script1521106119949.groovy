import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), 'Dixita')
WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), 'Dixita456')

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

//verfiy Home Page is displayed or not
WebUI.verifyElementPresent(findTestObject('Object Repository/Create_a_New_Dept/VerfiyHomePageDisplayed'), 3)

WebUI.delay(3)

//click on departments
WebUI.click(findTestObject('Object Repository/Create_a_New_Dept/ClickOnDepartments'))

WebUI.delay(2)

//enter the Deptcode or Dept Name in Search box

WebUI.setText(findTestObject('Object Repository/Search/Search_Inspect'), 'PUR001')

//click on Edit
WebUI.click(findTestObject('Object Repository/Create_a_New_Dept/EditIconDept'))

//switch to the PopUp
WebUI.focus(findTestObject('Object Repository/Create_a_New_Dept/PopUpForEditDept/div_                    Depart'))

//check the DeptCode field is DISABLED
try {
   WebUI.verifyElementNotClickable(findTestObject('Object Repository/Create_a_New_Dept/PopUpForEditDept/ClickOnDeptCode(Edit)'))
   println ('Department Code is Disabled')
} 
catch (Exception e) {
	println('Department Code is Enabled')
	Assert.fail()
}

