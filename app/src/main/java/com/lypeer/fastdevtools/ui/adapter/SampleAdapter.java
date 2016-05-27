package com.lypeer.fastdevtools.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.lypeer.baseadapter.base.BaseAdapter;
import com.lypeer.baseadapter.base.BaseViewHolder;
import com.lypeer.fastdevtools.ui.adapter.viewholder.SampleViewHolder;

/**
 * Created by lypeer on 16-5-27.
 */
public class SampleAdapter extends BaseAdapter<String> {
    @Override
    protected BaseViewHolder createViewHolder(Context context, ViewGroup parent) {
        return new SampleViewHolder(context, parent);
    }
}
