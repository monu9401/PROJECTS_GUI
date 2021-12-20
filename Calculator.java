import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
class miniCalculator implements ActionListener
{
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JPanel panel = new JPanel();
    JPanel result = new JPanel();
    JButton button0 = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton buttonE = new JButton();
    JButton buttonx = new JButton();
    JButton buttonDivide = new JButton();
    JButton buttonAdd = new JButton();
    JButton buttonSubtract = new JButton();
    JButton clear = new JButton();
    JButton power = new JButton();
    JButton decimal = new JButton();
    JButton backspace = new JButton();
    JButton percentage = new JButton();
    Border border = BorderFactory.createLineBorder(Color.cyan,5);
    String x="",y="";
    String res="";
    char ch='\0';
    int count=0;
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button0)
        {
            if(ch=='\0')
            {
                x=x+'0';
                label2.setText(x);
            }
            else
            {
                y=y+'0';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button1)
        {
            if(ch=='\0')
            {
                x=x+'1';
                label2.setText(x);
            }
            else
            {
                y=y+'1';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button2)
        {
            if(ch=='\0')
            {
                x=x+'2';
                label2.setText(x);
            }
            else
            {
                y=y+'2';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button3)
        {
            if(ch=='\0')
            {
                x=x+'3';
                label2.setText(x);
            }
            else
            {
                y=y+'3';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button4)
        {
            if(ch=='\0')
            {
                x=x+'4';
                label2.setText(x);
            }
            else
            {
                y=y+'4';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button5)
        {
            if(ch=='\0')
            {
                x=x+'5';
                label2.setText(x);
            }
            else
            {
                y=y+'5';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button6)
        {
            if(ch=='\0')
            {
                x=x+'6';
                label2.setText(x);
            }
            else
            {
                y=y+'6';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button7)
        {
            if(ch=='\0')
            {
                x=x+'7';
                label2.setText(x);
            }
            else
            {
                y=y+'7';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button8)
        {
           if(ch=='\0')
            {
                x=x+'8';
                label2.setText(x);
            }
            else
            {
                y=y+'8';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==button9)
        {
            if(ch=='\0')
            {
                x=x+'9';
                label2.setText(x);
            }
            else
            {
                y=y+'9';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==buttonE)
        {
            if(ch=='\0' && y.length()==0)
            {
                String temp1="";
                double temp = Double.valueOf(x);
                if(temp == (int)temp)
                temp1=String.valueOf((int)temp);
                else
                temp1=String.valueOf(temp);
                label1.setText(temp1);
            }
            else
            {
                double ans = evaluate(x,y,ch);
                if(ans==Double.MIN_VALUE)
                {
                    label1.setText("ERROR!!");
                    x="";
                    y="";
                    ch='\0';
                }
                else if(ans==Double.MAX_VALUE)
                {
                    label1.setText("EXCEEDED!!");
                    x="";
                    y="";
                    ch='\0';
                }
                else
                {
                    if(ans==(int)ans)
                    res=String.valueOf((int)ans);
                    else
                    res=String.valueOf(ans);
                    label1.setText(res);
                    x=res;
                    y="";
                    ch='\0';
                }
            }
            label1.setVisible(true);
        }
        else if(e.getSource()==buttonx)
        {
            ch='*';
            label2.setText(x+ch);
            label2.setVisible(true);
        }
        else if(e.getSource()==buttonDivide)
        {
            ch='/';
            label2.setText(x+ch);
            label2.setVisible(true);
        }
        else if(e.getSource()==buttonAdd)
        {
            ch='+';
            label2.setText(x+ch);
            label2.setVisible(true);
        }
        else if(e.getSource()==buttonSubtract)
        {
            if(x.length()==0)
            x="-"+x;
            else
            ch='-';
            label2.setText(x+ch);
            label2.setVisible(true);
        }
        else if(e.getSource()==clear)
        {
            x="";
            y="";
            ch='\0';
            res="";
            label1.setText("");
            label2.setText("");
            label1.setVisible(true);
            label2.setVisible(true);
        }
        else if(e.getSource()==power)
        {
            ch='^';
            label2.setText(x+ch);
            label2.setVisible(true);
        }
        else if(e.getSource()==decimal)
        {
            if(ch=='\0')
            {
                if(!x.contains("."))
                x=x+'.';
                label2.setText(x);
            }
            else
            {
                if(!y.contains("."))
                y=y+'.';
                label2.setText(x+ch+y);
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==backspace)
        {
            if(ch=='\0')
            {
                if(x.length()>0)
                x=x.substring(0,x.length()-1);
                label2.setText(x);
            }
            else
            {
                if(y.length()==0)
                {
                    ch='\0';
                    label2.setText(x);
                }
                else
                {
                    if(y.length()>0)
                    y=y.substring(0,y.length()-1);
                    label2.setText(x+ch+y);
                }
            }
            label2.setVisible(true);
        }
        else if(e.getSource()==percentage)
        {
            ch='%';
            label2.setText(x+ch);
            label2.setVisible(true);
        }
    }
    public double evaluate(String x,String y,char ch)
    {
        try
        {
            double f1 = Double.valueOf(x);
            double f2 = Double.valueOf(y);
            if(ch=='+')
            {
                return f1+f2;
            }
            else if(ch=='-')
            {
                return f1-f2;
            }
            else if(ch=='*')
            {
                return f1*f2;
            }
            else if(ch=='/')
            {
                if(f2==0)
                return Double.MIN_VALUE;
                else
                return f1/f2;
            }
            else if(ch=='^')
            {
                if(Math.pow(f1,f2)>Math.pow(10,300))
                return Double.MAX_VALUE;
                else
                return Math.pow(f1,f2);
            }
            else if(ch=='%')
            {
                return (f1*100)/f2;
            }
            else
            {
                return 0.0;
            }
        }
        catch(Exception e)
        {
            label1.setText("ERROR");
            label1.setVisible(true);
            return Double.MIN_VALUE;
        }
    }
    public void work()
    {
        // Button 0
        JLabel l0 = new JLabel();
        button0.setBounds(0,0,100,100);
        button0.addActionListener(this);
        button0.setText("0");
        button0.setFocusable(false);
        button0.setEnabled(true);
        button0.setForeground(new Color(00,00,255));
        button0.setFont(new Font("MV Boli",Font.BOLD,20));
        button0.setBackground(new Color(25,50,50));
        l0.setBounds(100,100,100,100);
        l0.add(button0);

        // Button 1
        JLabel l1 = new JLabel();
        button1.setBounds(0,0,100,100);
        button1.addActionListener(this);
        button1.setText("1");
        button1.setFocusable(false);
        button1.setEnabled(true);
        button1.setForeground(new Color(00,00,255));
        button1.setFont(new Font("MV Boli",Font.BOLD,20));
        button1.setBackground(new Color(25,50,50));
        l1.setBounds(0,400,100,100);
        l1.add(button1);

        // Button 2
        JLabel l2 = new JLabel();
        button2.setBounds(0,0,100,100);
        button2.addActionListener(this);
        button2.setText("2");
        button2.setFocusable(false);
        button2.setEnabled(true);
        button2.setForeground(new Color(00,00,255));
        button2.setFont(new Font("MV Boli",Font.BOLD,20));
        button2.setBackground(new Color(25,50,50));
        l2.setBounds(100,400,100,100);
        l2.add(button2);

        // Button 3
        JLabel l3 = new JLabel();
        button3.setBounds(0,0,100,100);
        button3.addActionListener(this);
        button3.setText("3");
        button3.setFocusable(false);
        button3.setEnabled(true);
        button3.setForeground(new Color(00,00,255));
        button3.setFont(new Font("MV Boli",Font.BOLD,20));
        button3.setBackground(new Color(25,50,50));
        l3.setBounds(200,400,100,100);
        l3.add(button3);

        // Button 4
        JLabel l4 = new JLabel();
        button4.setBounds(0,0,100,100);
        button4.addActionListener(this);
        button4.setText("4");
        button4.setFocusable(false);
        button4.setEnabled(true);
        button4.setForeground(new Color(00,00,255));
        button4.setFont(new Font("MV Boli",Font.BOLD,20));
        button4.setBackground(new Color(25,50,50));
        l4.setBounds(0,300,100,100);
        l4.add(button4);

        // Button 5
        JLabel l5 = new JLabel();
        button5.setBounds(0,0,100,100);
        button5.addActionListener(this);
        button5.setText("5");
        button5.setFocusable(false);
        button5.setEnabled(true);
        button5.setForeground(new Color(00,00,255));
        button5.setFont(new Font("MV Boli",Font.BOLD,20));
        button5.setBackground(new Color(25,50,50));
        l5.setBounds(100,300,100,100);
        l5.add(button5);

        // Button 6
        JLabel l6 = new JLabel();
        button6.setBounds(0,0,100,100);
        button6.addActionListener(this);
        button6.setText("6");
        button6.setFocusable(false);
        button6.setEnabled(true);
        button6.setForeground(new Color(00,00,255));
        button6.setFont(new Font("MV Boli",Font.BOLD,20));
        button6.setBackground(new Color(25,50,50));
        l6.setBounds(200,300,100,100);
        l6.add(button6);

        // Button 7
        JLabel l7 = new JLabel();
        button7.setBounds(0,0,100,100);
        button7.addActionListener(this);
        button7.setText("7");
        button7.setFocusable(false);
        button7.setEnabled(true);
        button7.setForeground(new Color(00,00,255));
        button7.setFont(new Font("MV Boli",Font.BOLD,20));
        button7.setBackground(new Color(25,50,50));
        l7.setBounds(0,200,100,100);
        l7.add(button7);

        // Button 8
        JLabel l8 = new JLabel();
        button8.setBounds(0,0,100,100);
        button8.addActionListener(this);
        button8.setText("8");
        button8.setFocusable(false);
        button8.setEnabled(true);
        button8.setForeground(new Color(00,00,255));
        button8.setFont(new Font("MV Boli",Font.BOLD,20));
        button8.setBackground(new Color(25,50,50));
        l8.setBounds(100,200,100,100);
        l8.add(button8);

        // Button 9
        JLabel l9 = new JLabel();
        button9.setBounds(0,0,100,100);
        button9.addActionListener(this);
        button9.setText("9");
        button9.setFocusable(false);
        button9.setEnabled(true);
        button9.setForeground(new Color(00,00,255));
        button9.setFont(new Font("MV Boli",Font.BOLD,20));
        button9.setBackground(new Color(25,50,50));
        l9.setBounds(200,200,100,100);
        l9.add(button9);

        // Button /
        JLabel ld = new JLabel();
        buttonDivide.setBounds(0,0,100,100);
        buttonDivide.addActionListener(this);
        buttonDivide.setText("/");
        buttonDivide.setFocusable(false);
        buttonDivide.setEnabled(true);
        buttonDivide.setForeground(new Color(00,00,255));
        buttonDivide.setFont(new Font("MV Boli",Font.BOLD,20));
        buttonDivide.setBackground(new Color(25,50,50));
        ld.setBounds(300,300,100,100);
        ld.add(buttonDivide);

        // Button =
        JLabel le = new JLabel();
        buttonE.setBounds(0,0,100,100);
        buttonE.addActionListener(this);
        buttonE.setText("=");
        buttonE.setFocusable(false);
        buttonE.setEnabled(true);
        buttonE.setForeground(new Color(00,00,255));
        buttonE.setFont(new Font("MV Boli",Font.BOLD,20));
        buttonE.setBackground(new Color(25,50,50));
        le.setBounds(300,400,100,100);
        le.add(buttonE);

        // Button *
        JLabel lx = new JLabel();
        buttonx.setBounds(0,0,100,100);
        buttonx.addActionListener(this);
        buttonx.setText("*");
        buttonx.setFocusable(false);
        buttonx.setEnabled(true);
        buttonx.setForeground(new Color(00,00,255));
        buttonx.setFont(new Font("MV Boli",Font.BOLD,20));
        buttonx.setBackground(new Color(25,50,50));
        lx.setBounds(300,200,100,100);
        lx.add(buttonx);

        // Button +
        JLabel la = new JLabel();
        buttonAdd.setBounds(0,0,100,100);
        buttonAdd.addActionListener(this);
        buttonAdd.setText("+");
        buttonAdd.setFocusable(false);
        buttonAdd.setEnabled(true);
        buttonAdd.setForeground(new Color(00,00,255));
        buttonAdd.setFont(new Font("MV Boli",Font.BOLD,20));
        buttonAdd.setBackground(new Color(25,50,50));
        la.setBounds(200,100,100,100);
        la.add(buttonAdd);

        // Button -
        JLabel ls = new JLabel();
        buttonSubtract.setBounds(0,0,100,100);
        buttonSubtract.addActionListener(this);
        buttonSubtract.setText("-");
        buttonSubtract.setFocusable(false);
        buttonSubtract.setEnabled(true);
        buttonSubtract.setForeground(new Color(00,00,255));
        buttonSubtract.setFont(new Font("MV Boli",Font.BOLD,20));
        buttonSubtract.setBackground(new Color(25,50,50));
        ls.setBounds(300,100,100,100);
        ls.add(buttonSubtract);

        // Button C
        JLabel lc = new JLabel();
        clear.setBounds(0,0,100,100);
        clear.addActionListener(this);
        clear.setText("C");
        clear.setFocusable(false);
        clear.setEnabled(true);
        clear.setForeground(new Color(00,00,255));
        clear.setFont(new Font("MV Boli",Font.BOLD,20));
        clear.setBackground(new Color(25,50,50));
        lc.setBounds(200,0,100,100);
        lc.add(clear);

        // Button .
        JLabel ldec = new JLabel();
        decimal.setBounds(0,0,100,100);
        decimal.addActionListener(this);
        decimal.setText(".");
        decimal.setFocusable(false);
        decimal.setEnabled(true);
        decimal.setForeground(new Color(00,00,255));
        decimal.setFont(new Font("MV Boli",Font.BOLD,20));
        decimal.setBackground(new Color(25,50,50));
        ldec.setBounds(0,100,100,100);
        ldec.add(decimal);

        // Button ^
        JLabel lp = new JLabel();
        power.setBounds(0,0,100,100);
        power.addActionListener(this);
        power.setText("^");
        power.setFocusable(false);
        power.setEnabled(true);
        power.setForeground(new Color(00,00,255));
        power.setFont(new Font("MV Boli",Font.BOLD,20));
        power.setBackground(new Color(25,50,50));
        lp.setBounds(100,0,100,100);
        lp.add(power);

        // Button Backspace
        JLabel lb = new JLabel();
        backspace.setBounds(0,0,100,100);
        backspace.addActionListener(this);
        backspace.setText("Backspace");
        backspace.setFocusable(false);
        backspace.setEnabled(true);
        backspace.setForeground(new Color(00,00,255));
        backspace.setFont(new Font("MV Boli",Font.BOLD,15));
        backspace.setBackground(new Color(25,50,50));
        lb.setBounds(300,0,100,100);
        lb.add(backspace);

        // Button %
        JLabel labs = new JLabel();
        percentage.setBounds(0,0,100,100);
        percentage.addActionListener(this);
        percentage.setText("%");
        percentage.setFocusable(false);
        percentage.setEnabled(true);
        percentage.setForeground(new Color(00,00,255));
        percentage.setFont(new Font("MV Boli",Font.BOLD,20));
        percentage.setBackground(new Color(25,50,50));
        labs.setBounds(0,0,100,100);
        labs.add(percentage);


        result.setBackground(new Color(00,00,00));                              // Result Panel
        result.setBounds(0,0,400,175);
        result.add(label1);
        result.add(label2);
        result.setBorder(border);
        result.setLayout(null);

        label1.setForeground(Color.green);                                      // result label
        label1.setFont(new Font("Consolas",Font.PLAIN,25));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setVisible(false);
        label1.setLayout(null);
        label1.setBounds(0,80,400,90);

        label2.setForeground(Color.red);                                        // value label
        label2.setFont(new Font("Consolas",Font.PLAIN,25));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setVisible(false);
        label2.setLayout(null);
        label2.setBounds(0,0,400,85);

        panel.setBackground(new Color(220,100,200));                            // key Panel
        panel.setBounds(0,175,400,500);
        panel.setLayout(null);

        frame.setTitle("Standard Calculator");                                  // main frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(415,710);
        frame.getContentPane().setBackground(new Color(100,100,100));
        frame.setLayout(null);
        frame.add(panel);
        frame.add(result);
        panel.add(l0);
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(l5);
        panel.add(l6);
        panel.add(l7);
        panel.add(l8);
        panel.add(l9);
        panel.add(ld);
        panel.add(le);
        panel.add(lx);
        panel.add(ls);
        panel.add(la);
        panel.add(lc);
        panel.add(ldec);
        panel.add(lp);
        panel.add(lb);
        panel.add(labs);
    }
    public static void main(String args[])
    {
        new miniCalculator().work();
    }
}
