fun main() {
    var q = Queue(5)
    q.dequeue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.dequeue()

    q.enqueue(45)
    q.enqueue(32)
    q.enqueue(64)
//    q.enqueue(32)
    q.display()

}

// enqueue / add/ dequeue // isFull //peek
class Queue(var capacity: Int) {
    var data = IntArray(capacity)
    var front = 0
    var rear = 0
    fun enqueue(value: Int) {
        if (isFull()) {
            println("Queue is full")
            return
        }
        data[rear] = value
        rear++
    }

    fun dequeue(): Int? {
        if (isEmpty()) {
            println("Queue is empty")
            return null
        }
        var removed = data[front]
        for (i in front until rear - 1) {
            data[i] = data[i + 1]
        }
        rear--
        return removed

    }

    fun peek(): Int? {
        if (isEmpty()) {
            return null
        }
        return data[front]
    }

    fun isFull(): Boolean {
        return front == capacity
    }

    fun isEmpty(): Boolean {
        return front == rear
    }

    fun display() {
        if (isEmpty()) {
            return
        }
        for (i in front until rear) {
            println(data[i])
        }
    }
}

//STACKS
fun main() {

    var myStack=Stack()
    println(myStack.pop())
    myStack.push(5)
    myStack.push(24)
    myStack.push(62)
    println(myStack.peek())
    println(myStack.pop())
    myStack.push(14)
    myStack.push(51)
    myStack.push(88)
    var x=myStack.pop()
    var y=myStack.pop()
    var z=x!!+y!!  //double exclamation is used to force data to integer.Null assertion operator. used where you have a nullable type
    println(z)

}

class Stack{
    var data= mutableListOf<Int>()

    fun push(value:Int){
        data.add(value)
    }

    fun pop():Int?{
        if (data.isEmpty()){
            return null
        }
        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}

//USE CASES OF STACKS
//used for reversing a string
