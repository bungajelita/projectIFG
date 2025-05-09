import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject

RequestObject request = new RequestObject('Get Users')
request.setRestUrl('https://api.example.com/users')
request.setMethod('GET')

ResponseObject response = WS.sendRequest(request)
WS.verifyResponseStatusCode(response, 200)