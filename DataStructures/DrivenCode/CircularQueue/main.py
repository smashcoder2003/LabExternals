class CircularQueue:

    # constructor
    def __init__(self, size):  # initializing the class
        self.size = size

        # initializing queue with none
        self.queue = [None for i in range(size)]
        self.front = self.rear = -1

    def enqueue(self, data):

        # condition if queue is full
        if (self.rear + 1) % self.size == self.front:
            return 0

        # condition for empty queue
        elif self.front == -1:
            self.front = 0
            self.rear = 0
            self.queue[self.rear] = data
        else:

            # next position of rear
            self.rear = (self.rear + 1) % self.size
            self.queue[self.rear] = data

    def dequeue(self):
        if self.front == -1:  # condition for empty queue
            return -1

        # condition for only one element
        elif self.front == self.rear:
            temp = self.queue[self.front]
            self.front = -1
            self.rear = -1
            return temp
        else:
            temp = self.queue[self.front]
            self.front = (self.front + 1) % self.size
            return temp

    def display(self):
        lt = []
        # condition for empty queue
        if self.front == -1:
            return -1

        elif self.rear >= self.front:
            for i in range(self.front, self.rear + 1):
                lt.append(self.queue[i])
            return lt

        else:
            for i in range(self.front, self.size):
                lt.append(self.queue[i])
            for i in range(0, self.rear + 1):
                lt.append(self.queue[i])
            return lt


if __name__ == "__main__":
    ob = CircularQueue(5)
    # ob.enqueue(14)
    # ob.enqueue(22)
    # ob.enqueue(13)
    # ob.enqueue(-6)
    # print(ob.display())
    # print("Deleted value = ", ob.dequeue())
    # print("Deleted value = ", ob.dequeue())
    # print(ob.display())
    # ob.enqueue(9)
    # ob.enqueue(20)
    # ob.enqueue(5)
    # print(ob.display())
    for i in range(5):
        ob.enqueue(i)
    print(ob.display())
    print(ob.front)
    print(ob.rear)
    print(ob.dequeue())
    print(ob.display())
