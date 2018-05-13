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

WebUI.navigateToUrl('http://34.213.239.153:8088/')

WebUI.click(findTestObject('Page_ProjectBackend (16)/h2_Login'))

WebUI.setText(findTestObject('Page_ProjectBackend (16)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_ProjectBackend (16)/input_password'), 'admin')

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/a_Total Transaction'))

WebUI.delay(5)

def oldTotal = WebUI.getText(findTestObject('Object Repository/Page_ProjectBackend (16)/old_Total'))

oldTotal = oldTotal.replaceAll('Total price: ', '')

oldTotal = oldTotal.replaceAll(' THB', '')

oldTotal = oldTotal.replaceAll(',', '')

oldTotal = Integer.parseInt(oldTotal)

WebUI.click(findTestObject('Page_ProjectBackend (16)/old_Total'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_Logout'))

WebUI.setText(findTestObject('Page_ProjectBackend (16)/input_username'), 'user')

WebUI.setText(findTestObject('Page_ProjectBackend (16)/input_password'), 'user')

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/a_Carts            3'))

WebUI.delay(5)

def newprice = WebUI.getText(findTestObject('Object Repository/Page_ProjectBackend (16)/newprice'))

newprice = newprice.replaceAll('Total price: ', '')

newprice = newprice.replaceAll(' THB', '')

newprice = newprice.replaceAll(',', '')

newprice = Integer.parseInt(newprice)

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_ProjectBackend (16)/div_Well done You successfully'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_Logout'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/h2_Login'))

WebUI.setText(findTestObject('Page_ProjectBackend (16)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_ProjectBackend (16)/input_password'), 'admin')

WebUI.click(findTestObject('Page_ProjectBackend (16)/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend (16)/a_Total Transaction'))

def newTotal = WebUI.getText(findTestObject('Object Repository/Page_ProjectBackend (16)/newTotal'))

newTotal = newTotal.replaceAll('Total price: ', '')

newTotal = newTotal.replaceAll(' THB', '')

newTotal = newTotal.replaceAll(',', '')

newTotal = Integer.parseInt(newTotal)

WebUI.closeBrowser()

