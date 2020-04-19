import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaGUI {
    public void window() {
        // 1. 创建一个顶层容器（窗口）
        JFrame jf = new JFrame("测试窗口");

        jf.setSize(400, 600);
        jf.setLocationRelativeTo(null);             // 把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //上半部分,输入文本框
        JPanel topPanel = new JPanel();
        topPanel.setBounds(10,10,380,200);
        JTextField jtf = new JTextField(11);
        // 设置文件右边往左边输出
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        jtf.setForeground(Color.BLACK);
        jtf.setFont(new Font("SansSerif",Font.PLAIN,40));
        jtf.setEditable(false);
        jtf.setText("0");
        jtf.setPreferredSize(new Dimension (200,200));
        topPanel.add(jtf);
        jf.add(topPanel,BorderLayout.NORTH);

        //按钮板
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(80, 280, 300, 300);
        //网格布局
        bottomPanel.setLayout(new GridLayout(5, 4, 3, 3));
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");
        JButton jButton0 = new JButton("0");
        JButton jButtonplus = new JButton("+");
        JButton jButtonjian = new JButton("-");
        JButton jButtoncheng = new JButton("*");
        JButton jButtonchu = new JButton("/");
        JButton jButtonzuokuohao = new JButton("(");
        JButton jButtonyoukuohao = new JButton(")");
        JButton jButtondengyu = new JButton("=");
        JButton jButtonC= new JButton("C");
        JButton jButtonCE = new JButton("<x");

        myListener mylistener = new myListener(jtf);
        //针对每个按钮
        jButtonC.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonC.setFont(new Font("黑体", 0, 30));
        jButtonC.setForeground(Color.black);
        bottomPanel.add(jButtonC);
        jButtonC.addActionListener(mylistener);

        jButtonCE.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonCE.setFont(new Font("黑体", 0, 30));
        jButtonCE.setForeground(Color.black);
        bottomPanel.add(jButtonCE);
        jButtonCE.addActionListener(mylistener);

        jButtonplus.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonplus.setFont(new Font("黑体", 0, 30));
        jButtonplus.setForeground(Color.black);
        bottomPanel.add(jButtonplus);
        jButtonplus.addActionListener(mylistener);

        jButtonjian.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonjian.setFont(new Font("黑体", 0, 30));
        jButtonjian.setForeground(Color.black);
        bottomPanel.add(jButtonjian);
        jButtonjian.addActionListener(mylistener);

        jButton1.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton1.setFont(new Font("黑体", 0, 30));
        jButton1.setForeground(Color.black);
        bottomPanel.add(jButton1);
        jButton1.addActionListener(mylistener);

        jButton2.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton2.setFont(new Font("黑体", 0, 30));
        jButton2.setForeground(Color.black);
        bottomPanel.add(jButton2);
        jButton2.addActionListener(mylistener);

        jButton3.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton3.setFont(new Font("黑体", 0, 30));
        jButton3.setForeground(Color.black);
        bottomPanel.add(jButton3);
        jButton3.addActionListener(mylistener);

        jButtoncheng.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtoncheng.setFont(new Font("黑体", 0, 30));
        jButtoncheng.setForeground(Color.black);
        bottomPanel.add(jButtoncheng);
        jButtoncheng.addActionListener(mylistener);

        jButton4.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton4.setFont(new Font("黑体", 0, 30));
        jButton4.setForeground(Color.black);
        bottomPanel.add(jButton4);
        jButton4.addActionListener(mylistener);

        jButton5.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton5.setFont(new Font("黑体", 0, 30));
        jButton5.setForeground(Color.black);
        bottomPanel.add(jButton5);
        jButton5.addActionListener(mylistener);

        jButton6.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton6.setFont(new Font("黑体", 0, 30));
        jButton6.setForeground(Color.black);
        bottomPanel.add(jButton6);
        jButton6.addActionListener(mylistener);

        jButtonchu.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonchu.setFont(new Font("黑体", 0, 30));
        jButtonchu.setForeground(Color.black);
        bottomPanel.add(jButtonchu);
        jButtonchu.addActionListener(mylistener);

        jButton7.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton7.setFont(new Font("黑体", 0, 30));
        jButton7.setForeground(Color.black);
        bottomPanel.add(jButton7);
        jButton7.addActionListener(mylistener);

        jButton8.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton8.setFont(new Font("黑体", 0, 30));
        jButton8.setForeground(Color.black);
        bottomPanel.add(jButton8);
        jButton8.addActionListener(mylistener);

        jButton9.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton9.setFont(new Font("黑体", 0, 30));
        jButton9.setForeground(Color.black);
        bottomPanel.add(jButton9);
        jButton9.addActionListener(mylistener);

        jButtondengyu.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtondengyu.setFont(new Font("黑体", 0, 30));
        jButtondengyu.setForeground(Color.black);
        bottomPanel.add(jButtondengyu);
        jButtondengyu.addActionListener(mylistener);

        jButtonzuokuohao.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonzuokuohao.setFont(new Font("黑体", 0, 30));
        jButtonzuokuohao.setForeground(Color.black);
        bottomPanel.add(jButtonzuokuohao);
        jButtonzuokuohao.addActionListener(mylistener);

        jButton0.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton0.setFont(new Font("黑体", 0, 30));
        jButton0.setForeground(Color.black);
        bottomPanel.add(jButton0);
        jButton0.addActionListener(mylistener);

        jButtonyoukuohao.setBorder(BorderFactory.createRaisedBevelBorder());
        jButtonyoukuohao.setFont(new Font("黑体", 0, 35));
        jButtonyoukuohao.setForeground(Color.black);
        bottomPanel.add(jButtonyoukuohao);
        jButtonyoukuohao.addActionListener(mylistener);

        jf.add(bottomPanel);
        jf.setVisible(true);
    }
}


class myListener implements ActionListener{
    private StringBuffer str = new StringBuffer();
    private JTextField jtf;
    public myListener(JTextField jtf) {
        this.jtf = jtf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取发生事件的按钮的标签
        String test = e.getActionCommand();
        if(test.equals("0")||test.equals("1")||test.equals("2")||test.equals("3")||test.equals("4")
        ||test.equals("5")||test.equals("6")||test.equals("7")||test.equals("8")||test.equals("9")
        ||test.equals("+")||test.equals("-")||test.equals("*")||test.equals("/")||test.equals("(")
        ||test.equals(")")){
            str.append(test);
            jtf.setText(str.toString());
        }else if(test.equals("C")){
            str.setLength(0);
            jtf.setText("0");
        }else if(test.equals("<x")){
            str.deleteCharAt(str.length()-1);
            jtf.setText(str.toString());
        }else if(test.equals("=")){
            //计算
            try {
                Double result = new jisuan().run(new zhong2hou().parseString(new zhong2hou().expressionToList(str.toString())));
                str.setLength(0);
                str.append(String.valueOf(result));
                jtf.setText(str.toString());
            }catch (Exception e1){
                if(e1 instanceof ArithmeticException){
                    str.setLength(0);
                    jtf.setText("除数不能为0");
                }else {
                    str.setLength(0);
                    jtf.setText("表达式错误");
                }
            }
        }
        //渐变字体
        if(str.length()<17){
            jtf.setFont(new Font("SansSerif",Font.PLAIN,40));
        }
        if(str.length()>=17&&str.length()<22){
            jtf.setFont(new Font("SansSerif",Font.PLAIN,30));
        }
        if(str.length()>=22&&str.length()<33){
            jtf.setFont(new Font("SansSerif",Font.PLAIN,20));
        }
        if(str.length()>=33){
            jtf.setFont(new Font("SansSerif",Font.PLAIN,10));
        }
    }
}

