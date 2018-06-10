package com.example.administrator.calculatordebug;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final double pi = 3.1415926;
    //运算符号
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button zhishu;
    private Button jiecheng;
    private Button kaifang;
    private Button mod;
    private Button tan;
    private Button cos;
    private Button sin;
    private Button lg;

    //数码
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;

    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;

    //其他
    private Button del;
    private Button clean;
    private Button equ;
    private Button point;

    private EditText showText;             //用来显示输入的符号和数字
    private String Input = "";           //字符串用来保存输入的数字和符号
    private String Operator;            //用来记录运算符号
    double sum1, num1, num2;
    int sum2, num3, num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcultor_activity);
        initView();                         //对按钮和事件进行初始化
    }

    private void initView() {
        //初始化数码按钮
        one = (Button) findViewById(R.id.button_one);
        two = (Button) findViewById(R.id.button_two);
        three = (Button) findViewById(R.id.button_three);
        four = (Button) findViewById(R.id.button_four);
        five = (Button) findViewById(R.id.button_five);
        six = (Button) findViewById(R.id.button_six);
        seven = (Button) findViewById(R.id.button_seven);
        eight = (Button) findViewById(R.id.button_eight);
        nine = (Button) findViewById(R.id.button_nine);
        zero = (Button) findViewById(R.id.button_zero);

        //初始化其他按钮
        add = (Button) findViewById(R.id.button_add);
        sub = (Button) findViewById(R.id.button_sub);
        mul = (Button) findViewById(R.id.button_mul);
        div = (Button) findViewById(R.id.button_div);
        tan = (Button) findViewById(R.id.button_tan);
        sin = (Button) findViewById(R.id.button_sin);
        cos = (Button) findViewById(R.id.button_cos);
        lg = (Button) findViewById(R.id.button_lg);
        mod = (Button) findViewById(R.id.button_mod);
        kaifang = (Button) findViewById(R.id.button_kaifang);
        jiecheng = (Button) findViewById(R.id.button_jiecheng);
        zhishu = (Button) findViewById(R.id.button_zhishu);

        del = (Button) findViewById(R.id.button_del);
        clean = (Button) findViewById(R.id.button_clean);
        equ = (Button) findViewById(R.id.button_equ);
        point = (Button) findViewById(R.id.button_point);
        showText = (EditText) findViewById(R.id.editText);

        //初始化文本编辑框
        showText.setCursorVisible(false);

        //添加数码按钮事件
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        //添加其他事件
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        tan.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        lg.setOnClickListener(this);
        kaifang.setOnClickListener(this);
        jiecheng.setOnClickListener(this);
        zhishu.setOnClickListener(this);
        mod.setOnClickListener(this);
        equ.setOnClickListener(this);
        del.setOnClickListener(this);
        clean.setOnClickListener(this);
        point.setOnClickListener(this);
        showText.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_one:                 //记录输入的数字1
                Input = addToInput("1");         //把数字添加进Input
                showText.setText(Input);   //把输入的数字显示在EditText
                break;
            case R.id.button_two:
                Input = addToInput("2");
                showText.setText(Input);
                break;
            case R.id.button_three:
                Input = addToInput("3");
                showText.setText(Input);
                break;
            case R.id.button_four:
                Input = addToInput("4");
                showText.setText(Input);
                break;
            case R.id.button_five:
                Input = addToInput("5");
                showText.setText(Input);
                break;
            case R.id.button_six:
                Input = addToInput("6");
                showText.setText(Input);
                break;
            case R.id.button_seven:
                Input = addToInput("7");
                showText.setText(Input);
                break;
            case R.id.button_eight:
                Input = addToInput("8");
                showText.setText(Input);
                break;
            case R.id.button_nine:
                Input = addToInput("9");
                showText.setText(Input);
                break;
            case R.id.button_zero:
                Input = addToInput("0");
                showText.setText(Input);
                break;

            //记录运算符
            case R.id.button_add:
                Input = addToInput("+");
                Operator = "+";
                showText.setText(Input);
                break;
            case R.id.button_sub:
                Input = addToInput("-");
                Operator = "-";
                showText.setText(Input);
                break;
            case R.id.button_mul:
                Input = addToInput("*");
                Operator = "*";
                showText.setText(Input);
                break;
            case R.id.button_div:
                Input = addToInput("/");
                Operator = "/";
                showText.setText(Input);
                break;
            case R.id.button_point:
                Input = addToInput(".");
                showText.setText(Input);
                break;
            case R.id.button_jiecheng:
                Input = addToInput("!");
                Operator = "!";
                showText.setText(Input);
                break;
            case R.id.button_kaifang:
                Input = addToInput("√￣");
                Operator = "√￣";
                showText.setText(Input);
                break;
            case R.id.button_zhishu:
                Input = addToInput("^");
                Operator = "^";
                showText.setText(Input);
                break;
            case R.id.button_tan:
                Input = addToInput("tan");
                Operator = "tan";
                showText.setText(Input);
                break;
            case R.id.button_sin:
                Input = addToInput("sin");
                Operator = "sin";
                showText.setText(Input);
                break;
            case R.id.button_cos:
                Input = addToInput("cos");
                Operator = "cos";
                showText.setText(Input);
                break;
            case R.id.button_lg:
                Input = addToInput("lg");
                Operator = "lg";
                showText.setText(Input);
                break;
            case R.id.button_mod:
                Input = addToInput("mod");
                Operator = "mod";
                showText.setText(Input);
                break;

            case R.id.button_del:               //删除刚刚输入的一个符号
                if (Input.length() >= 1)      //当至少已经输入了一个符号才执行
                {
                    Input = Input.substring(0, Input.length() - 1);
                }
                showText.setText(Input);
                break;
            case R.id.button_clean:                 //清除整个显示框
                Input = "";                  //变量全部初始化
                sum1 = 0;
                sum2 = 0;
                num4 = 0;
                num3 = 0;
                num2 = 0;
                num1 = 0;
                Operator = " ";
                showText.setText(Input);
                break;
            case R.id.button_equ:
                if (CheckInput(Input))      //当输入的数字和运算符都正确，才进行计算
                {
                        Input = Input + "=" + Double.valueOf(equals(Input));
                        showText.setText(Input);//显示数字运算符和结果
//                    Input = String.valueOf(equals(Input));        //保存运算结果，以便再直接输入一个运算符和一个数字进行下一次运算
                } else {
                    Toast.makeText(this, "输入有误", Toast.LENGTH_SHORT).show();         //输入不合理弹出警告
                }
                break;
            default:
                break;

        }
    }       //记录输入的字符，将字符录入Input,并在EditText中显示

    public String addToInput(String c)                    //添加并记录一个输入的数字或符号
    {
        Input = Input + String.valueOf(c);
        return Input;
    }

    public boolean CheckInput(String Input)    //这个方法用来检查用户输入的数字是否合理，比如用户输入了"9/3"这是合理的，加入输入了 " 8/*",这部合理
    {
        if (Input.length() < 2)                  //至少要分别输入了一个数字和一个运算符和一个数字，输入长度<2肯定不合理，如输入 99 按下=按钮肯定不计算
        {
            return false;
        }
//        else if (Input.indexOf(Operator, 1) == -1)     //如果没有输入运算符，肯定不合理
//        {
//            return false;
//        }
        return true;
    }

    public double equals(String Input)         //运算实现
    {
        int indexOfOperator = Input.indexOf(Operator);  //运算符在输入字符中的位置
        if (Input.contains(".") || Input.contains("cos") || Input.contains("sin") || Input.contains("tan") || Input.contains("lg") || Input.contains("√￣")) {
            if (Input.startsWith(Operator)) {
                if ((Operator == "sin") || (Operator == "cos") || (Operator == "tan")) {
                    num2 = Double.parseDouble(Input.substring(indexOfOperator + 3, Input.length()));
                    switch (Operator) {
                        case "sin":
                            sum1 = Math.sin(pi / 180 * num2);
                            break;
                        case "cos":
                            sum1 = Math.cos(pi / 180 * num2);
                            break;
                        case "tan":
                            sum1 = Math.tan(pi / 180 * num2);
                            break;
                        default:
                            break;
                    }
                    return sum1;
                } else if ((Operator == "lg") || (Operator == "√￣")) {
                    num2 = Double.parseDouble(Input.substring(indexOfOperator + 2, Input.length()));
                    switch (Operator) {
                        case "lg":
                            sum1 = (int) Math.log10(num2);
                            break;
                        case "√￣":
                            sum1 = (int) Math.sqrt(num2);
                            break;
                        default:
                            break;
                    }
                    return sum1;
                }
                return sum1;
            } else if (Input.endsWith(Operator)) {
                num1 = Double.parseDouble(Input.substring(0, indexOfOperator));
                switch (Operator) {
                    case "!":
                        sum1 = 1;
                        for (int i = 1; i < num1; i++) {
                            sum1 *= i;
                        }
                        break;
                    default:
                        break;
                }
                return sum1;
            } else {
                num1 = Double.parseDouble(Input.substring(0, indexOfOperator));
                num2 = Double.parseDouble(Input.substring(indexOfOperator + 1, Input.length()));
                switch (Operator) {
                    case "+":
                        sum1 = num1 + num2;
                        break;
                    case "-":
                        sum1 = num1 - num2;
                        break;
                    case "*":
                        sum1 = num1 * num2;
                        break;
                    case "/":
                        sum1 = num1 / num2;
                        break;
                    case "^":
                        sum1 = 1;
                        for (int i = 1; i <= num2; i++) {
                            sum1 *= num1;
                        }
                        break;
                    default:
                        break;
                }
                return sum1;
            }
        } else {

            if (Input.startsWith(Operator)) {
                if ((Operator == "sin") || (Operator == "cos") || (Operator == "tan")) {
                    num4 = Integer.parseInt(Input.substring(indexOfOperator + 3, Input.length()));
                    switch (Operator) {
                        case "sin":
                            sum2 = (int) Math.sin(pi / 180 * num4);
                            break;
                        case "cos":
                            sum2 = (int) Math.cos(pi / 180 * num4);
                            break;
                        case "tan ":
                            sum2 = (int) Math.tan(pi / 180 * num4);
                            break;
                        default:
                            break;
                    }
                    return sum2;
                } else if ((Operator == "lg") || (Operator == "√￣")) {
                    num4 = Integer.parseInt(Input.substring(indexOfOperator + 2, Input.length()));
                    switch (Operator) {
                        case "lg":
                            sum2 = (int) Math.log10(num4);
                            break;
                        case "√￣":
                            sum2 = (int) Math.sqrt(num4);
                            break;
                        default:
                            break;
                    }
                    return sum2;
                }
            } else if (Input.endsWith(Operator)) {
                num3 = Integer.parseInt(Input.substring(0, indexOfOperator));
                switch (Operator) {
                    case "!":
                        sum2 = 1;
                        for (int i = 1; i <= num3; i++) {
                            sum2 *= i;
                        }
                    default:
                        break;
                }
                return sum2;
            } else {
                if (Input.contains("mod")) {
                    num3 = Integer.parseInt(Input.substring(0, indexOfOperator));  //从输入的Input字符串里得到第一个运算数
                    num4 = Integer.parseInt(Input.substring(indexOfOperator + 3, Input.length()));
                    sum2 = num3 % num4;
                    return sum2;
                } else {
                    switch (Operator) {
                        case "+":
                            num3 = Integer.parseInt(Input.substring(0, indexOfOperator));  //从输入的Input字符串里得到第一个运算数
                            num4 = Integer.parseInt(Input.substring(indexOfOperator + 1, Input.length()));
                            sum2 = num3 + num4;
                            break;
                        case "-":
                            num3 = Integer.parseInt(Input.substring(0, indexOfOperator));  //从输入的Input字符串里得到第一个运算数
                            num4 = Integer.parseInt(Input.substring(indexOfOperator + 1, Input.length()));
                            sum2 = num3 - num4;
                            break;
                        case "*":
                            num3 = Integer.parseInt(Input.substring(0, indexOfOperator));  //从输入的Input字符串里得到第一个运算数
                            num4 = Integer.parseInt(Input.substring(indexOfOperator + 1, Input.length()));
                            sum2 = num3 * num4;
                            break;
                        case "/":
                            num3 = Integer.parseInt(Input.substring(0, indexOfOperator));  //从输入的Input字符串里得到第一个运算数
                            num4 = Integer.parseInt(Input.substring(indexOfOperator + 1, Input.length()));
                            sum2 = num3 / num4;
                            break;
                        case "^":
                            num3 = Integer.parseInt(Input.substring(0, indexOfOperator));  //从输入的Input字符串里得到第一个运算数
                            num4 = Integer.parseInt(Input.substring(indexOfOperator + 1, Input.length()));
                            sum2 = 1;
                            for (int i = 1; i <= num4; i++) {
                                sum2 *= num3;
                            }
                            break;
                        default:
                            break;
                    }
                    return sum2;
                }
            }

        }
        return sum2;
    }
}







