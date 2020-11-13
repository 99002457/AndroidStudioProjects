package com.lnt.navigationdrawer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link implicitintent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class implicitintent extends Fragment {
    SharedPreferences sharedPreferences;
    EditText name;
    EditText email;
    public static final String mypreferences="mypref";
    public static final String Name="nameKey";
    public static final String Email="emailKey";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public implicitintent() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment implicitintent.
     */
    // TODO: Rename and change types and number of parameters
    public static implicitintent newInstance(String param1, String param2) {
        implicitintent fragment = new implicitintent();
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
        sharedPreferences= getActivity().getSharedPreferences(mypreferences, Context.MODE_PRIVATE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_implicitintent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController nav= Navigation.findNavController(view);
        Button save=(Button)view.findViewById(R.id.save);
        Button retrive=(Button)view.findViewById(R.id.retrive);
        Button clear=(Button)view.findViewById(R.id.clear);
        final EditText name=(EditText)view.findViewById(R.id.name);
        final EditText email=(EditText)view.findViewById(R.id.email);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                String e=email.getText().toString();
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.commit();
                Toast.makeText(getActivity(),"Saved the Name: "+n+ " and EmailID : "+e,Toast.LENGTH_LONG).show();
            }
        });
        retrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nn=null;
                String ee=null;
                if(sharedPreferences.contains(Name))
                {
              nn=sharedPreferences.getString(Name,"Error");
              name.setText(nn);
                }
                if(sharedPreferences.contains(Email))
                {
               ee=sharedPreferences.getString(Email,"Error");
               email.setText(ee);
                }


                Toast.makeText(getActivity(),"Retrived the Name: "+nn+ " and EmailID : "+ee,Toast.LENGTH_LONG).show();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              name.setText("");
              email.setText("");
            }
        });

    }
}