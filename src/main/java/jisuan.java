import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class jisuan {
    //运行后缀表达式
    public Double run(List<String> expressionList){
        Stack<Double> stack=new Stack<Double>();
        for(String item:expressionList){
            //如果是符号
            if(item.matches("[\\+\\-\\*/]")){
                double a = stack.pop();
                double b = stack.pop();
                double c = 0;
                switch(item){
                    case "+":
                        c=b+a;
                        break;
                    case "-":
                        c=b-a;
                        break;
                    case "*":
                        c=b*a;
                        break;
                    case "/":
                        if(a==0){
                            //除数为0错误
                            throw new ArithmeticException();
                        }
                        c=b/a;
                        break;
                    default:
                        c=0;
                        break;
                }
                stack.push(c);
            }else{
                //数字则进栈
                stack.push(new Double(item));
            }
        }
        return stack.pop();
    }

}
