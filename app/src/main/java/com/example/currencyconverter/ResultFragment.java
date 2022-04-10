package com.example.currencyconverter;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResultFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResultFragment extends Fragment {

    EditText editText;
    RadioButton r1,r2,r3;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ResultFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ResultFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ResultFragment newInstance(String param1, String param2) {
        ResultFragment fragment = new ResultFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_result, container, false);

        editText = view.findViewById(R.id.mainET);
        r1 = view.findViewById(R.id.radioBTM_US_Dollar);
        r2 = view.findViewById(R.id.radioBTM_Euro);
        r3 = view.findViewById(R.id.radioBTM_British_Pound);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Enter Amount", Toast.LENGTH_SHORT).show();

                }else {
                    Intent intent = new Intent(getContext(),CurrencyConverterActivity.class);
                    intent.putExtra("value",editText.getText().toString());
                    intent.putExtra("currency","USDollar");
                    startActivity(intent);
                }

            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Enter Amount", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(getContext(),CurrencyConverterActivity.class);
                    intent.putExtra("value",editText.getText().toString());
                    intent.putExtra("currency","Euro");
                    startActivity(intent);
                }

            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Enter Amount", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(getContext(),CurrencyConverterActivity.class);
                    intent.putExtra("value",editText.getText().toString());
                    intent.putExtra("currency","BritishPound");
                    startActivity(intent);
                }

            }
        });


        return view;
    }

}