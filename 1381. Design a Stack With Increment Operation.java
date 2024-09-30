class CustomStack {
    int stack[];
    int top = -1;
    int max;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        max = maxSize;
    }
    
    public void push(int x) {
        if((top+1)<max)
        {
            stack[++top]=x;
        }
    }
    
    public int pop()
    {
        if(top==-1)return -1;
        else
        {
            int temp = stack[top];
            top--;
            return temp;
        }
    }
    
    public void increment(int k, int val) 
    {
        for(int i=0;i<k && i<=top;i++)
        {
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
