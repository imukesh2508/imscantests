import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Window.Type

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.TestDataType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

import groovy.swing.factory.TitledBorderFactory

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

//Select a File type
WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentType/FileType'), 1)

//Enter the name of Document Type
WebUI.setText(findTestObject('Object Repository/DocumentType/Enter_DocumentName'), 'Dynamic doc 25')

//Click on Folder name
WebUI.click(findTestObject('Object Repository/DocumentType/Enter-ClickOnFolderName'))

//Enter the Title
WebUI.setText(findTestObject('Object Repository/DocumentType/Title(Dynamic)'), 'Dynamic doc 25')



