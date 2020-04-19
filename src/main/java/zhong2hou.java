import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//中缀表达式转后缀表达式类

public class zhong2hou {

    //将表达式转为list
    public List<String> expressionToList(String expression) {
        int index = 0;
        List<String> list = new ArrayList<String>();
        do{
            char ch = expression.charAt(index);
            if(ch <= 47 || ch > 58){
                //字符串第一个字符是操作符，一定为正负号
                if(index==0){
                    StringBuilder str = new StringBuilder();
                    str.append(expression.charAt(index));
                    index++;
                    while (index < expression.length() && ((expression.charAt(index) >=47 && expression.charAt(index) <= 58 )|| expression.charAt(index)=='.')){
                        str.append(expression.charAt(index));
                        index ++;
                    }
                    list.add(str.toString());
                //不是第一个字符
                }else{
                    //一定不是正负号
                    if(ch!='+'&&ch!='-') {
                        list.add(ch + "");
                        index++;
                    }else {//是+，-，根据前一个字符是否为数字判断
                        //前一个字符是数字，是操作符
                        if(expression.charAt(index-1)>47 && expression.charAt(index-1)<=58){
                            list.add(ch + "");
                            index++;
                        }else {
                            StringBuilder str = new StringBuilder();
                            str.append(ch);
                            index++;
                            while (index < expression.length() && ((expression.charAt(index) >47 && expression.charAt(index) <= 58 )|| expression.charAt(index)=='.')){
                                str.append(expression.charAt(index));
                                index ++;
                            }
                            list.add(str.toString());
                        }
                    }
                }

            }else{
                //是数字,判断多位数的情况
                StringBuilder str = new StringBuilder();
                while (index < expression.length() && ((expression.charAt(index) >47 && expression.charAt(index) <= 58 )|| expression.charAt(index)=='.')){
                    str.append(expression.charAt(index));
                    index ++;
                }
                list.add(str.toString());
            }
        }while (index < expression.length());
        return list;
    }

    public List<String> parseString(List<String> expressionList) {
        Stack<String> opStack = new Stack<String>();
        List<String> suffixList = new ArrayList<String>();
        for(String item : expressionList){
            if(isOperator(item)){
                //是操作符 判断操作符栈是否为空
                if(opStack.isEmpty() || "(".equals(opStack.peek()) || priority(item) > priority(opStack.peek())){
                    //为空或者栈顶元素为左括号或者当前操作符大于栈顶操作符直接压栈
                    opStack.push(item);
                }else {
                    //否则将栈中元素出栈如队，直到遇到大于当前操作符或者遇到左括号时
                    while (!opStack.isEmpty() && !"(".equals(opStack.peek())){
                        if(priority(item) <= priority(opStack.peek())){
                            suffixList.add(opStack.pop());
                            break;
                        }
                    }
                    //当前操作符压栈
                    opStack.push(item);
                }
            }else if(isNumber(item)){
                //是数字则直接入队
                suffixList.add(item);
            }else if("(".equals(item)){
                //是左括号，压栈
                opStack.push(item);
            }else if(")".equals(item)){
                //是右括号 ，将栈中元素弹出入队，直到遇到左括号，左括号出栈，但不入队
                while (!opStack.isEmpty()){
                    if("(".equals(opStack.peek())){
                        opStack.pop();
                        break;
                    }else {
                        suffixList.add(opStack.pop());
                    }
                }
            }else {
                //既不是数也不是字符，输入错误

                throw new RuntimeException("有非法字符！");

            }
        }
        //循环完毕，如果操作符栈中元素不为空，将栈中元素出栈入队
        while (!opStack.isEmpty()){
            suffixList.add(opStack.pop());
        }
        return suffixList;
    }

    //判断字符串是否为操作符
    public boolean isOperator(String op){
        return op.matches("[\\+\\-\\*/]");
    }
    //判断是否为数字(整数或浮点数)
    public boolean isNumber(String num){
        return num.matches("(-|\\+)?(\\d+)*.?\\d+");
    }
    //获取操作符的优先级
    public int priority(String op){
        if(op.equals("*") || op.equals("/")){
            return 1;
        }else if(op.equals("+") || op.equals("-")){
            return 0;
        }
        return -1;
    }


}
