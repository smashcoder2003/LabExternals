import unittest
import DataStructures.TestCases.InfixToPostFixTestCases.TestCases as t


def TestSuite():
    suite = unittest.TestSuite()
    suite.addTest(t.Test('test_1'))
    suite.addTest(t.Test('test_2'))
    suite.addTest(t.Test('test_3'))
    suite.addTest(t.Test('test_4'))
    suite.addTest(t.Test('test_5'))
    return suite


def TestRun():
    tester = unittest.TextTestRunner()
    tester.run(TestSuite())
