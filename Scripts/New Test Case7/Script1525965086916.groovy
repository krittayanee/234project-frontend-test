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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.213.239.153:8086/')

WebUI.click(findTestObject('Page_ProjectBackend (14)/h2_Login'))

WebUI.setText(findTestObject('Page_ProjectBackend (14)/input_username'), 'user')

WebUI.setText(findTestObject('Page_ProjectBackend (14)/input_password'), 'user')

WebUI.click(findTestObject('Page_ProjectBackend (14)/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/a_Products'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/h2_Products'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/div_Garden            The gard'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/div_Banana            A good f'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/a_Carts            2'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/p_Total price  20150 THB'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/th_amount'))

WebUI.setText(findTestObject('Page_ProjectBackend (14)/input_amount'), '2')

WebUI.click(findTestObject('Page_ProjectBackend (14)/p_Total price  40150 THB'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/button_confirm'))

WebUI.click(findTestObject('Page_ProjectBackend (14)/div_Well done You successfully'))

WebUI.closeBrowser()
