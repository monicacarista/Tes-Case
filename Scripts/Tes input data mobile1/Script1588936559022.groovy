import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\monica\\AndroidStudioProjects\\PROJECTProgmob\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.TextView0 - SI-KRS'), 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.TextView0 - SI KRS UKDW'), 0)

Mobile.clearText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Email'), 0)

Mobile.setText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0'), 'monica@si.ukdw.ac.id', 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.TextView0 - Data Diri'), 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Nama Mahasiswa'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Nama Mahasiswa'), 0)

Mobile.setText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Nama Mahasiswa'), 'Monica', 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - NIM Mahasiswa'), 0)

Mobile.setText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - NIM Mahasiswa (1)'), '72170133', 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Alamat Mahasiswa'), 0)

Mobile.setText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Alamat Mahasiswa (1)'), 'klitren', 
    0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Email Mahasiswa'), 0)

Mobile.setText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Email Mahasiswa (1)'), 'monica@si.ukdw.ac.id', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Foto Mahasiswa'), 0)

Mobile.setText(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.EditText0 - Foto Mahasiswa (1)'), 'vv', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.Button0 - SIMPAN'), 0)

Mobile.tap(findTestObject('TES INSERT DARA DIRI MOBILE/android.widget.Button0 - YES'), 0)

Mobile.closeApplication()

