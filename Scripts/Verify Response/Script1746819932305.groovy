import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject

ResponseObject response = WS.sendRequest(new RequestObject('Get Users'))
WS.verifyResponseStatusCode(response, 200)
def responseBody = response.getResponseBodyContent()
println responseBody