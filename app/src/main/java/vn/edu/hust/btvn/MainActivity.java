package vn.edu.hust.btvn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,clear,clearone,adsub,reset,enter;
    TextView tv,tv1;
    Double var1;
    Double var2;
    Double ans;
    Boolean addition=false, subtract=false,multiply=false,divide=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.zero);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        clear=findViewById(R.id.clear);
        clearone=findViewById(R.id.clearone);
        reset=findViewById(R.id.reset);
        enter=findViewById(R.id.enter);

        tv1=findViewById(R.id.tv1);
        // to show value of this button in textview1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"1");
            }
        });
        // to show value of this button in textview1
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"2");
            }
        });
        // to show value of this button in textview1
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"3");
            }
        });
        // to show value of this button in textview1
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"4");
            }
        });
        // to show value of this button in textview1
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"5");
            }
        });
        // to show value of this button in textview1
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"6");
            }
        });
        // to show value of this button in textview1
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"7");
            }
        });
        // to show value of this button in textview1
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"8");
            }
        });
        // to show value of this button in textview1
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"9");
            }
        });
        // to show value of this button in textview1
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvar1();
                buttonFlase();
                addition=true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvar1();
                buttonFlase();
                subtract=true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvar1();
                buttonFlase();
                multiply=true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvar1();
                buttonFlase();
                divide=true;
            }
        });
        clearone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteone();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allreset();
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(tv1.getText().toString());
                if(addition){
                    ans=var1+var2;
                } else if (subtract){
                    ans=var1-var2;
                } else if (multiply){
                    ans=var1*var2;
                } else if (divide){
                    ans=var1/var2;
                } else {
                    ans=ans+0;
                }
                tv1.setText(ans.toString());
                enter.setEnabled(false);
            }
        });
    }
    //  To disalbe buttons
    public void buttonFlase(){
        sub.setEnabled(false);
        add.setEnabled(false);
        div.setEnabled(false);
        mul.setEnabled(false);
        tv1.setText("");
    }
    // To set val1 value
    public void setvar1(){
        var1=Double.parseDouble(tv1.getText().toString());
    }
    // to reset all buttons and textview
    public void allreset(){
        enter.setEnabled(true);
        sub.setEnabled(true);
        add.setEnabled(true);
        div.setEnabled(true);
        mul.setEnabled(true);

        tv1.setText("");
    }
    // to change button color
    public void deleteone(){
        int length=tv1.getText().toString().length();
        tv1.getText().toString().substring(0,length);
    }
}


