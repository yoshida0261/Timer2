package com.starcompany.timer2;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TimerFragment extends Fragment {

    public TimerFragment()
    {
    }

    public static TimerFragment newInstance(){
        return new TimerFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.activity_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] Data = {
                "1:00", "3:00", "5:00", "10:00", "15:00", "30:00"
        };

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        Data);

        ListView listView = getView().findViewById(R.id.list_timer);
                listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                ListView listView = (ListView) parent;
                // クリックされたアイテムを取得します
                String item = (String) listView.getItemAtPosition(position);
                Toast.makeText(getActivity(), item, Toast.LENGTH_LONG).show();
            }
        });


    }


}
