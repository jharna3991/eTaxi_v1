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

public class TaxiBookingFragment extends Fragment {

    View bookingView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        bookingView = inflater.inflate(R.layout.taxi_booking, container, false);
        return bookingView;
    }
}
