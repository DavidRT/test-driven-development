from TestResult import TestResult


class TestCase:
	def __init__(self,name):
		self.name = name

	def run(self, result):
		print("run..")
		result.testStarted()
		print("setUp")
		self.setUp()
		try:
			method = getattr(self,self.name)
			print("call method")
			print(method)
			method()
		except:
			print ("excception raises!")
			result.testFailed()
		self.tearDown()	

	def setUp(self):
		# Not implemented here, but its impelemnted in WasRun class.
		pass 

	def tearDown(self):
		pass