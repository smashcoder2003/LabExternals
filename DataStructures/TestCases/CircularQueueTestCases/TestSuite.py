import unittest
import DataStructures.TestCases.CircularQueueTestCases.TestCasesForDeletion as d
import DataStructures.TestCases.CircularQueueTestCases.TestCasesForInsertion as i


def TestSuite():
    suite = unittest.TestSuite()
    suite.addTest(d.Test('test_1'))
    suite.addTest(d.Test('test_2'))
    suite.addTest(i.TestCases('test_1'))
    suite.addTest(i.TestCases('test_2'))
    return suite


def TestRun():
    tester = unittest.TextTestRunner()
    tester.run(TestSuite())


if __name__ == "__main__":
    TestRun()
