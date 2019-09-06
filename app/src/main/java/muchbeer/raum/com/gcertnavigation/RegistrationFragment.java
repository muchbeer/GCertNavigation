package muchbeer.raum.com.gcertnavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends Fragment {

public static String USER_EMAIL = "muchbeer.raum.com.gcertnavigation.EMAIL";
public static String USER_PASSWORD = "muchbeer.raum.com.gcertnavigation.PASSWORD";
    public RegistrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View view = inflater.inflate(R.layout.fragment_registration, container, false);
  /*      EditText edtUser = view.findViewById(R.id.editTextEmail2);
        EditText edtPass = view.findViewById(R.id.editTextPassword2);

        //tv.setText(getArguments().getString("amount"));
        edtUser.setText(getArguments().getString(USER_EMAIL));
        edtPass.setText(getArguments().getString(USER_PASSWORD));
        Log.d("RegistrationFragment", getArguments().getString(USER_EMAIL));*/
        return view;


    }

}
