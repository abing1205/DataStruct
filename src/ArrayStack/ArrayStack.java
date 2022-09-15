package ArrayStack;

public class ArrayStack {

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        arrayStack = new int[maxSize];
    }
    //栈顶指针
    private int top = -1;
    //栈的大小
    private int maxSize;
    //定义数组栈
    private int[] arrayStack;

    public boolean isFull(){
        return top == maxSize-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
        return arrayStack[top];
    }
    //压栈
    public int push(int value){
        if(isFull()){
            throw new RuntimeException("栈满，请释放空间");
        }
        top++;
        arrayStack[top] = value;
        return value;
    }
    //弹栈
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("栈空，请添加元素");
        int value = arrayStack[top];
        top--;
        return value;
    }
    //遍历栈中元素
    public void list(){
        if(isEmpty()){
            throw new RuntimeException("栈空");
        }
        for(int i=top;i>=0;i--){
            System.out.printf("%d ",arrayStack[i]);
        }
    }

    //判断回文数
    //使用StringBuilder
    public boolean huiWen(String value){

        StringBuilder newVal = new StringBuilder();
        for(int i=0;i<value.length();i++){
            push(value.charAt(i));
            newVal.append((char)pop());
        }
        return newVal.toString().equals(value);
    }
    //使用String来拼接字符串
    public boolean huiWenString(String value){

        String newVal = "";
        for(int i=0;i<value.length();i++){
            push(value.charAt(i));
            newVal += (char)pop();
        }
        return newVal.equals(value);
    }

    //使用栈实现计算器

    /**
     * 判断符号的优先级
     * @param value
     * @return
     */
    public int priority(char value){
        if(value == '*' || value == '/'){
            return 1;
        }
        if(value == '+' || value == '-'){
            return 0;
        }
        return -1;
    }

    /**
     * 判断是否为运算符
     * @param value
     * @return
     */
    public boolean isOperator(char value){
        return value == '*' || value == '/' || value == '+' || value == '-';
    }

    /**
     * 计算方法
     */
    public int calculate(int num1, int num2, char operator){
        int result = 0;
        switch (operator){
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 / num1;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num2 * num1;
                break;
        }
        return result;
    }
}
