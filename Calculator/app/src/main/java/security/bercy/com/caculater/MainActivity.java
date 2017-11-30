package security.bercy.com.caculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText result;
    int[] buttons;
    int ans;
    int result0;
    int result1;


    Button buttonJia;
    Button buttonJian;
    Button buttonCheng;
    Button buttonChu;
    Button buttonDengyu;

    String str1;
    String str2;

    int flag = 0;
    Button temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();




        for (int i = 0; i < buttons.length; i++) {
            temp = (Button) findViewById(buttons[i]);
            temp.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            str1 = result.getText().toString().trim();
                            str1 = str1 + String.valueOf(((Button) v).getText());
                            System.out.println("str1" + ":::" + str1);
                            result.setText(str1);
                        }
                    });
        }

        buttonListener(buttonJia, 1);
        buttonListener(buttonJian, 2);
        buttonListener(buttonCheng, 3);
        buttonListener(buttonChu, 4);

        buttonDengyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(str1);
                result1 = Integer.parseInt(str1);
                if (flag == 1) {
                    ans = result0 + result1;
                    System.out.println(result0 + ":" + result1);
                } else if (flag == 2) {
                    ans = result0 - result1;
                } else if (flag == 3) {
                    ans = result0 * result1;
                } else if (flag == 4) {
                    ans = (int) (result0 / result1);
                }
                String str = (ans + "").trim();
                result.setText(str);
            }
        });
    }


    public void initButton() {
        result = (EditText) this.findViewById(R.id.result);
        str1 = String.valueOf(result.getText());
        str2 = "";


        buttonJia = (Button) this.findViewById(R.id.buttonPlus);
        buttonJian = (Button) this.findViewById(R.id.buttonMin);
        buttonCheng = (Button) this.findViewById(R.id.buttonMul);
        buttonChu = (Button) this.findViewById(R.id.buttonDiv);
        buttonDengyu = (Button) this.findViewById(R.id.buttonEquals);

        buttons = new int[] {
                R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9 };

    }


    public void buttonListener(Button button, final int id) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = result.getText().toString().trim();
                result0 = Integer.parseInt(str);
                result.setText("");
                flag = id;
            }
        });
    }
}
