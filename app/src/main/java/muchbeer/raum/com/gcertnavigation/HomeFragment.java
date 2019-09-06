package muchbeer.raum.com.gcertnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import static androidx.navigation.ui.NavigationUI.setupActionBarWithNavController;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    NavController navController2= null;

    NavHostFragment  navHostFragment;
    NavInflater inflater;
    NavGraph graph;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     //   BottomNavigationView
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     //  navController2 = Navigation.findNavController(view);

        inflater  = navHostFragment.getNavController().getNavInflater();

        graph = inflater.inflate(R.navigation.nav_graph_home);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        //   NavHostFragment navHostFragment = (NavHostFragment) getChildFragmentManager().findFragmentById(R.id.fragment);



     /*   navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                toolbar.setTitle(destination.getLabel());
            }
        });*/

//        NavController navController = Navigation.findNavController( getActivity(), R.id.nav_host_fragment);
           //         fragmentView = view.findViewById(R.id.nav_host_fragment);

       // NavigationUI.setupWithNavController(bottomNavigationView, navController);

    /*   */

     //   NavigationUI.setupWithNavController(bottomNavigationView, Navigation.findNavController(getActivity(), R.id.fragment)); // here navView using Kotlin extension to avoid findviewbyid


//        Toolbar toolbar = view.findViewById(R.id.toolbar);
// .setupWithNavController(navHostFragment.navController)
//NavigationUI.setupWithNavController(bottomNavigationView, navController);

//This changes when the back is added by the way this is the little change I made to see if this will work






       /* AppBarConfiguration appBarConfiguration2 =
                new AppBarConfiguration.Builder(navController2.getGraph()).build();*/
      /*  AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.navigation.nav_graph_home)
                .build();*/
      //  val navController = navHostFragment.findNavController()
      //  setupActionBarWithNavController((AppCompatActivity) getActivity(), navController2, appBarConfiguration);
      //  setupWithNavController((AppCompatActivity) getActivity(), navController2, appBarConfiguration);


    //    NavigationUI.setupWithNavController(bottomNavigationView, navController2);
   /*     navController2.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                toolbar.setTitle(destination.getLabel());
            }
        });*/

//NavigationUI.setupWithNavController(toolbar, navController);
//setupWithNavController(navHostFragment.getNavController());

     //   Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_registrationFragment);

      //  toolbar.set
   //    NavigationUI bottomNavigationView2 = (NavigationUI) view.findViewById(R.id.bottomNavigationView);




       /* graph.setDefaultArguments(getIntent().getExtras());
        graph.setStartDestination(R.id.fragment1);*/


        //   navHostFragment.getNavController().getGraph().setDefaultArguments(getIntent().getExtras());
        navHostFragment  = (NavHostFragment) getChildFragmentManager().findFragmentById(R.id.nav_host_fragment);


        BottomNavigationView bottomNavigationView =  view.findViewById(R.id.bottomNavigationView);
        Toolbar toolbar = view.findViewById(R.id.toolbar);
      //  ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        // NavGraph graph = inflater.inflate(R.navigation.nav_graph_home);
        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController());


        //NavigationUI.setupWithNavController(toolbar, navController);
        navHostFragment.getNavController().addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                toolbar.setTitle(destination.getLabel());
            }
        });
        //  NavController navController3 = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
        //   NavigationUI.setupWithNavController(bottomNavigationView, navController3);

       // graph.setStartDestination(R.id.feedFragment);
    /*    if (false) {
            graph.setStartDestination(R.id.orderFragment);
        }*/ /*else {
            graph.setStartDestination(R.id.orderFragment);
        }*/

     //   navHostFragment.getNavController().setGraph(graph);
        return view;
    }

}
