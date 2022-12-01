import unittest
from random import randint
import DataStructures.DrivenCode.CircularQueue.main as cq

class Test(unittest.TestCase):
    def setUp(self):
        self.lt = []

    def test_1(self):
        self.lt = []
        size = randint(5,20)
        q = cq.CircularQueue(size)
        for i in range(size):
            self.lt.append(randint(1,100))
        for i in self.lt:
            q.enqueue(i)

        r = q.dequeue()
        self.assertEquals(self.lt[0],r)

    def test_2(self):
        self.lt = []
        size = randint(5, 20)
        q = cq.CircularQueue(size)
        for i in range(size):
            self.lt.append(randint(1, 100))
        for i in self.lt:
            q.enqueue(i)
        q.dequeue()
        self.assertEquals(self.lt[1:],q.display())

