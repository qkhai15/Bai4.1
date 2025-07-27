package com.example.ngdngchuyninhit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;

public class MainActivity extends Activity {
    EditText edtdoC, edtdoF;
    Button btncf, btnfc, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtdoC = findViewById(R.id.edtdoC);
        edtdoF = findViewById(R.id.edtdoF);
        btncf = findViewById(R.id.btncf);
        btnfc = findViewById(R.id.btnfc);
        btnClear = findViewById(R.id.btnClear);

        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doC = edtdoC.getText().toString();
                if (!doC.isEmpty()) {
                    int C = Integer.parseInt(doC);
                    edtdoF.setText("" + dcf.format(C * 1.8 + 32));
                }
            }
        });

        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doF = edtdoF.getText().toString();
                if (!doF.isEmpty()) {
                    int F = Integer.parseInt(doF);
                    edtdoC.setText("" + dcf.format((F - 32) / 1.8));
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtdoC.setText("");
                edtdoF.setText("");
            }
        });
    }
}