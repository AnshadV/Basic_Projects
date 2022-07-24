package com.anshadvaz.binary2decimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText binaryInput = findViewById(R.id.BinaryInput);
        TextView decimalOutput = findViewById(R.id.DecimalOutput);
        Button convertButton = findViewById(R.id.ConvertButton);
        TextView caption = findViewById(R.id.DecimalOutputCaption);


        //make sure the input contains only 0 and 1
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String binaryInputString = binaryInput.getText().toString();
                if(binaryInputString.matches("[01]+")){
                    decimalOutput.setText(Integer.toString(Integer.parseInt(binaryInputString, 2)));
                    decimalOutput.setVisibility(View.VISIBLE);
                    caption.setVisibility(View.VISIBLE);

                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter only 0s and 1s", Toast.LENGTH_SHORT).show();
                    binaryInput.setText("");
                }
            }
        });


    }
}