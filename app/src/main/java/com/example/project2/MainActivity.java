package com.example.project2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private EditText mEditText4;
    private EditText mEditText5;
    private EditText mEditText6;
    private TextView mTextViewResult;

    String[] items = {"Виберіть предмет з списку", "Математика", "ФІзика", "Біологія", "Хімія", "Англійська мова", "Українська мова"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner1 = findViewById(R.id.spinner1);
        final Spinner spinner2 = findViewById(R.id.spinner2);
        final Spinner spinner3 = findViewById(R.id.spinner3);
        final Spinner spinner4 = findViewById(R.id.spinner4);
        final Spinner spinner5 = findViewById(R.id.spinner5);
        final Spinner spinner6 = findViewById(R.id.spinner6);

        mEditText1 = findViewById(R.id.edit_text1);
        mEditText2 = findViewById(R.id.edit_text2);
        mEditText3 = findViewById(R.id.edit_text3);
        mEditText4 = findViewById(R.id.edit_text4);
        mEditText5 = findViewById(R.id.edit_text5);
        mEditText6 = findViewById(R.id.edit_text6);
        mTextViewResult = findViewById(R.id.text_view_result);
        Button mButtonAdd = findViewById(R.id.button1);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.num, Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.num, Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (mEditText3.getText().toString().length() == 0) {
                    mEditText3.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.num, Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (mEditText4.getText().toString().length() == 0) {
                    mEditText4.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.num, Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (mEditText5.getText().toString().length() == 0) {
                    mEditText5.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.num, Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (mEditText6.getText().toString().length() == 0) {
                    mEditText6.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.num, Toast.LENGTH_SHORT);
                    toast.show();
                }


                int sum1 = Integer.parseInt(mEditText1.getText().toString());
                int sum2 = Integer.parseInt(mEditText2.getText().toString());
                int sum3 = Integer.parseInt(mEditText3.getText().toString());
                int sum4 = Integer.parseInt(mEditText4.getText().toString());
                int sum5 = Integer.parseInt(mEditText5.getText().toString());
                int sum6 = Integer.parseInt(mEditText6.getText().toString());

                int sum = sum1 + sum2 + sum3 + sum4 + sum5 + sum6;
                double div;
                div = sum / 6;
                mTextViewResult.setText(String.valueOf(div));

            }

        });


        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(spinnerArrayAdapter);
        spinner2.setAdapter(spinnerArrayAdapter);
        spinner3.setAdapter(spinnerArrayAdapter);
        spinner4.setAdapter(spinnerArrayAdapter);
        spinner5.setAdapter(spinnerArrayAdapter);
        spinner6.setAdapter(spinnerArrayAdapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner1.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner1.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner1.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner1.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner1.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner1.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner2.setSelection(0);
                } else if (position == spinner1.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner3.setSelection(0);
                } else if (position == spinner1.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner4.setSelection(0);
                } else if (position == spinner1.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner5.setSelection(0);
                } else if (position == spinner1.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner6.setSelection(0);
                } else if (position == spinner1.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.text_item1, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }




}
