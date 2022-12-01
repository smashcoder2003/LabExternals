import unittest
from random import randint,choice
import DataStructures.DrivenCode.InfixToPostfix.main as ip


class Test(unittest.TestCase):
    def setUp(self):
        pass

    def test_1(self):
        exp = "3w=6"
        res = "3w=6"
        statement = "FAILED !!!\n GIVEN EXPRESSION : {}\n EXPECTED : {}\n ACTUAL : {}".format(exp, res,ip.Convert(exp))
        self.assertEquals(res, exp, statement)

    def test_2(self):
        exp = "m+n=-9"
        res = "mn=+9-"
        statement = "FAILED !!!\n GIVEN EXPERSSION : {}\nEXPECTED : {}\nACTUAL : {}".format(exp, res, ip.Convert(exp))
        self.assertEquals(res, ip.Convert(exp), statement)

    def test_3(self):
        exp = "3d−2=2d+2"
        res = "3d−2=2d2+"
        statement = "FAILED !!!\n GIVEN EXPERSSION : {}\nEXPECTED : {}\nACTUAL : {}".format(exp, res, ip.Convert(exp))
        self.assertEquals(res, ip.Convert(exp), statement)

    def test_4(self):
        exp = "4(4b−4)=16"
        res = "44b−4=16"
        statement = "FAILED !!!\n GIVEN EXPERSSION : {}\nEXPECTED : {}\nACTUAL : {}".format(exp, res, ip.Convert(exp))
        self.assertEquals(res, ip.Convert(exp), statement)

    def test_5(self):
        exp = "(2x+2)/2=3"
        res = "2x2+2=3/"
        statement = "FAILED !!!\n GIVEN EXPERSSION : {}\nEXPECTED : {}\nACTUAL : {}".format(exp, res, ip.Convert(exp))
        self.assertEquals(res, ip.Convert(exp), statement)

