class Stack:
    class Node:
        def __init__(self, data, nextnode):
            self.data = data
            self.nextnode = nextnode
    def __init__(self):
        self.head = None
    def push(self, data):
        node = self.Node(data, self.head)
        self.head = node
    def pop(self):
        if self.head is not None:
            data = self.head.data
            self.head = self.head.nextnode
            return data
        else:
            raise StopIteration("stack done")

if __name__ == "__main__":
    Hi = Stack()
    Hi.push(1)
    Hi.push(1)
    Hi.push(3)
    print(Hi.pop())
    Hi.push(8)
    Hi.push(10)
    while True:
        print (Hi.pop());
