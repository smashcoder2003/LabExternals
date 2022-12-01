import unittest
from random import randint
import DataStructures.DrivenCode.CircularQueue.main as cq


class TestCases(unittest.TestCase):
    def setUp(self):
        self.lt = []

    def test_1(self):
        size = randint(5, 20)
        q = cq.CircularQueue(size)
        for i in range(size):
            self.lt.append(randint(1, 100))
        for i in self.lt:
            q.enqueue(i)
        statement = "FAILED \n ELEMENTS PUSHED : {} \n EXPECTED : {}\n ACTUAL : {}".format(self.lt, self.lt,
                                                                                           q.display())
        self.assertEquals(self.lt, q.display())

    def test_2(self):
        self.lt = []
        size = randint(5, 20)
        q = cq.CircularQueue(size)
        for i in range(size):
            self.lt.append(randint)
        for i in self.lt:
            q.enqueue(i)
        self.assertEquals(0, q.front)
        self.assertEquals(len(self.lt) - 1, q.rear)