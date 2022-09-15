package ArrayStack;

public class TestArrayStack {
    public static void main(String[] args) {
        //ArrayStack stack = new ArrayStack(3);
     /*   stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.list();*/
        /*System.out.println(stack.huiWen("aba"));
        System.out.println(stack.huiWenString("aba"));*/

        String expression = "7+2*6-4";
        ArrayStack numberStack = new ArrayStack(10);
        ArrayStack operatorStack = new ArrayStack(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        char oper = ' ';
        char ch = ' ';
        while(true){
            //依次得到表达式中的字符
            ch = expression.substring(index,index+1).charAt(0);
            if(operatorStack.isOperator(ch)){
                if(!operatorStack.isEmpty()){
                    if(operatorStack.priority(ch) <= operatorStack.priority((char) operatorStack.peek())){
                        num1 = numberStack.pop();
                        num2 = numberStack.pop();
                        oper = (char) operatorStack.pop();
                        res = numberStack.calculate(num1,num2,oper);
                        numberStack.push((int) res);
                        operatorStack.push(ch);
                    }else{
                        //当前操作符优先级大于栈顶的操作符，直接如符号栈
                        operatorStack.push(ch);
                    }
                }else{
                    //如果符号栈为空，直接如符号栈
                    operatorStack.push(ch);
                }
            }else{
                //如果操作符为数字，入数字栈
                numberStack.push(Integer.parseInt(String.valueOf(ch)));
            }
            index++;
            if(index >= expression.length()){
                break;
            }
        }

        while(true){
            if(operatorStack.isEmpty()){
                break;
            }
            num1 = numberStack.pop();
            num2 = numberStack.pop();
            oper = (char) operatorStack.pop();
            res = numberStack.calculate(num1,num2,oper);
            numberStack.push(res);
        }
        System.out.println(expression + "="+numberStack.pop());
    }
}
