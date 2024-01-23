class MinStack {
    Stack<int[]> stack ;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
    int arr[]=new int[]{val,val};
        if(!stack.isEmpty()){
            int currMin=this.getMin();
            if(val<=currMin) stack.push(arr);
            else{
                arr[1]=currMin;
                stack.push(arr);
            }
        }else{
            stack.push(arr);
        }
    
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek()[0];
        
    }
    
    public int getMin() {
        return stack.peek()[1];
        
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */