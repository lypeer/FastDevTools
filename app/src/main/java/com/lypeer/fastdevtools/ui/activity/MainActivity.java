package com.lypeer.fastdevtools.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.lypeer.baseadapter.base.api.OnItemClickListener;
import com.lypeer.fastdevtools.R;
import com.lypeer.fastdevtools.ui.adapter.SampleAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.am_rv_sample)
    RecyclerView mAmRvSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        SampleAdapter adapter = new SampleAdapter();
        mAmRvSample.setLayoutManager(new LinearLayoutManager(this));
        mAmRvSample.setAdapter(adapter);

        adapter.setOnClickListener(new OnItemClickListener<String>() {
            @Override
            public void onItemClick(String itemValue, int viewID, int position) {
                Toast.makeText(MainActivity.this,
                        "position : "
                                .concat(String.valueOf(position))
                                .concat(" , value : ")
                                .concat(itemValue)
                        , Toast.LENGTH_SHORT).show();
            }
        });

        List<String> list = new ArrayList<>();
        list.add("lypeer's blog");
        list.add("gagaga");
        list.add("wechat : lypeer");
        list.add("miao ~~~");
        list.add("UESTC");
        adapter.refreshData(list);
    }
}
