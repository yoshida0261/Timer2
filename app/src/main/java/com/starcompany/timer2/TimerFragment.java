package com.starcompany.timer2;


import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class TimerFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] Data = {
                "1:00", "3:00", "5:00", "10:00", "15:00", "30:00"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        Data);

        setListAdapter(adapter);
    }


}
