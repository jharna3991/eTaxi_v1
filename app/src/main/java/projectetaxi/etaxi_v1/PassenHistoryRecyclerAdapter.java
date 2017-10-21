package projectetaxi.etaxi_v1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ashim Bazracharya on 10/21/2017.
 */

public class PassenHistoryRecyclerAdapter extends RecyclerView.Adapter<PassenHistoryRecyclerAdapter.HistoryViewHolder>{

    ArrayList<PassengerHistory> arrayList = new ArrayList<>();

    public PassenHistoryRecyclerAdapter(ArrayList<PassengerHistory> arrayList) {

        this.arrayList = arrayList;

    }

    @Override
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_passen_history,
                parent, false);
        HistoryViewHolder viewHolder = new HistoryViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HistoryViewHolder holder, int position) {

        holder.tvPassenDate.setText(arrayList.get(position).getBookingDate());
        holder.tvSourceLatitude.setText(arrayList.get(position).getSrcLat());
        holder.tvSourceLongitude.setText(arrayList.get(position).getSrcLong());
        holder.tvDestinationLatitude.setText(arrayList.get(position).getDestLat());
        holder.tvDestinationLongitude.setText(arrayList.get(position).getDestLong());
        holder.tvPassenAmount.setText(arrayList.get(position).getPassenAmount());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class HistoryViewHolder extends RecyclerView.ViewHolder {

        TextView tvPassenDate, tvSourceLatitude, tvSourceLongitude, tvDestinationLatitude,
                tvDestinationLongitude, tvPassenAmount;

        public HistoryViewHolder(View itemView) {
            super(itemView);

            tvPassenDate = (TextView)itemView.findViewById(R.id.tvPassDate);
            tvSourceLatitude = (TextView)itemView.findViewById(R.id.tvSourceLatitude);
            tvSourceLongitude = (TextView)itemView.findViewById(R.id.tvSourceLongitude);
            tvDestinationLatitude = (TextView)itemView.findViewById(R.id.tvDestinationLatitude);
            tvDestinationLongitude = (TextView)itemView.findViewById(R.id.tvDestinationLongitude);
            tvPassenAmount = (TextView)itemView.findViewById(R.id.tvPassAmount);


        }
    }
}
