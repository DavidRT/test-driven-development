class TestCase:
	def __init__(self,name):
		self.name = name

	def run(self):
		self.setUp()
		method = getattr(self,self.name)
		method()	

	def setUp(self):
		# Not implemented here, but its impelemnted in WasRun class.
		pass 