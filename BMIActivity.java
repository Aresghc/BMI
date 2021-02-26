package com.example.hongchiguo.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
    }
    public void bottonClicked(View v)
    {
        View weightView = findViewById(R.id.weightBox);
        EditText weightEdit = (EditText)weightView;
        String weight = weightEdit.getText().toString();

        String height = ((EditText)findViewById(R.id.heightBox)).getText().toString();

        BMIModel model = new BMIModel(weight,height);
        String answer = model.getBMI();

        ((TextView)findViewById(R.id.answer)).setText(answer);
    }
}
