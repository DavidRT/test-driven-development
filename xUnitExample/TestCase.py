from TestResult import TestResult


class TestCase:
	def __init__(self,name):
		self.name = name

	def run(self):
		result = TestResult()
		result.testStarted()
		self.setUp()
		method = getattr(self,self.name)
		method()
		self.tearDown()	
		return result

	def setUp(self):
		# Not implemented here, but its impelemnted in WasRun class.
		pass 

	def tearDown(self):
		pass