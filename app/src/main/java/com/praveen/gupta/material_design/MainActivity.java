package com.praveen.gupta.material_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout demoInputLayout;
    EditText demoEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoInputLayout = (TextInputLayout)findViewById(R.id.demoTextInputLayout);

        demoEditText = (EditText)findViewById(R.id.demoEditText);

        demoEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {


                if (editable.length() > demoInputLayout.getCounterMaxLength())
                    demoInputLayout.setError("Max character length is " + demoInputLayout.getCounterMaxLength());
                else
                    demoInputLayout.setError(null);

            }
        });

    }
}
