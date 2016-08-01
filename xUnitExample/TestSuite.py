class TestSuite:

	def __init__(self):
		self.tests = []

	def add(self, test):
		self.tests.append(test)

	def run(self, result):
		print "Quantity of methods to run: %d" % len(self.tests)
		for test in self.tests:
			test.run(result)
