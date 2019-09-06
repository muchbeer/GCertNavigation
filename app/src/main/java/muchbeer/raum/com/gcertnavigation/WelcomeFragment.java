package muchbeer.raum.com.gcertnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    NavController navController = null;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       // Toast.makeText(getActivity(), "WelcomeFragrment ");
        View view = inflater.inflate(R.layout.fragment_welcome,container, false);


       /* view.findViewById<Button>(R.id.view_transactions_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.send_money_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_balance_btn).setOnClickListener(this)*/

      //   NavigationUI.setupWithNavController(navController.);
        EditText edtEmail = view.findViewById(R.id.editTextEmail);
        EditText edtPass = view.findViewById(R.id.editTextPassword);



        Button sendToAnotherFragment = (Button) view.findViewById(R.id.button_registration);

        sendToAnotherFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_registrationFragment);



                //  Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_registrationFragment);
                navController.navigate(R.id.action_welcomeFragment_to_registrationFragment);
                //  Toast.makeText(getActivity(), "The best action sorted",Toast.LENGTH_LONG).show();
            }
        });
        Button sendLogin = view.findViewById(R.id.button_login);

        sendLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getEmai = edtEmail.getText().toString();
                String getPassword = edtPass.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("userName", getEmai);
                bundle.putString("streetNumber", getPassword);
                Log.d("WelcomeFragment", getEmai);


              /*  BigDecimal amount = ReceiveNumber(BigDecimal(input.getText.toString());
                Bundle bundle = Bundle();
                bundle.getDecimal("amount", amount);*/


                Toast.makeText(getActivity(), "WelcomeFragment data is: " + getEmai, Toast.LENGTH_LONG ).show();
                Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_clientPage, bundle);
            }
        });

        Button saleButton = view.findViewById(R.id.btnSale);
        saleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_welcomeFragment_to_homeFragment);
            }
        });

  /*
       */
        return view;
    }

}
