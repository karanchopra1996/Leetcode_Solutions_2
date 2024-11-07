class MyStack {
    Deque<Integer> dq;

    public MyStack() {
        this.dq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.dq.addLast(x);
        
    }
    
    public int pop() {
        int size = this.dq.size();
        for(int i=0; i<size-1; i++){
            this.push(this.dq.pollFirst());
        }
       return this.dq.pollFirst();
        
    }
    
    public int top() {
        int size = this.dq.size();
        for(int i=0; i<size-1; i++){
            this.push(this.dq.pollFirst());
        }
        int res = this.dq.peekFirst();
        this.push(this.dq.pollFirst());
        return res;
    }
    
    public boolean empty() {
        return this.dq.size() == 0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */