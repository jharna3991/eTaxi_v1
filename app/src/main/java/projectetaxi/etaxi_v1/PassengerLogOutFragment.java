package projectetaxi.etaxi_v1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ashim Bazracharya on 10/14/2017.
 */

public class PassengerLogOutFragment extends Fragment {

    View logoutView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        logoutView = inflater.inflate(R.layout.passenger_logout, container, false);
        return logoutView;
    }
}
