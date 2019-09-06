package muchbeer.raum.com.gcertnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClientPage extends Fragment {

    NavController navController = null;
    private String userName = null;
    private String streetName = null;

    public ClientPage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       userName= getArguments().getString("userName");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        TextView userName = view.findViewById(R.id.txt1);
        TextView streetNumber = view.findViewById(R.id.txt2);

       String getUsername=  getArguments().getString("userName");
        Log.d("ClientPage", "The out put is: "+ getUsername);
        userName.setText(getUsername);
        Button backButton = view.findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // navController.navigate(R.id.action_welcomeFragment_to_clientPage);
                getActivity().onBackPressed();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_client_page, container, false);
        return view;
    }

}
