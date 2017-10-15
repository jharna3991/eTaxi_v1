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

public class PassengerSettingFragment extends Fragment {

    View settingView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        settingView = inflater.inflate(R.layout.passenger_settings, container, false);
        return settingView;
    }
}
