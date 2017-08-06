class Stack<T> {
    class Node{
        public Node next;
        public T data ;
        public Node(T data, Node next){
            this.data  = data ;
            this.next = next ;
        }
    }
    public Node head;


    public Stack(){
        head = null;
    }
    public void push(T data){
        head = new Node(data, this.head);
    }
    public T pop() throws Exception {
        if(this.head != null ){
            T data = this.head.data ;
            this.head = this.head.next;
            return data;
        } else {
            throw new Exception("pop called on empty stack");
        }

    }
    public static void main(String[] args) {
        Stack<Integer> istack = new Stack<Integer>();
        istack.push(4) ;
        istack.push(5);
        while(true){
            System.out.println(istack.pop());
        }
    }
}
