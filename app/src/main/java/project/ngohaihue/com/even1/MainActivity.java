package project.ngohaihue.com.even1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ediNumberA;
    private EditText editNumberB;
    private int numberA;
    private int numberB;
    private int sum;
    private TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn_add(View view) {
        ediNumberA = (EditText) findViewById(R.id.edit_numberA);
        editNumberB = (EditText) findViewById(R.id.edit_numberB);
        numberA = Integer.parseInt(ediNumberA.getText().toString());
        numberB = Integer.parseInt(editNumberB.getText().toString());
        textResult = (TextView) findViewById(R.id.text_result);
        if (!editNumberB.toString().isEmpty()&&!ediNumberA.toString().isEmpty()){
            sum = numberA + numberB;
            textResult.setText(sum+"");
        }else{
            textResult.setText("Vui Long Nhap So");
        }
    }
}
