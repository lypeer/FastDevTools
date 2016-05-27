package com.lypeer.fastdevtools.ui.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lypeer.baseadapter.base.BaseViewHolder;
import com.lypeer.baseadapter.base.api.OnItemClickListener;
import com.lypeer.fastdevtools.R;

import butterknife.Bind;

/**
 * Created by lypeer on 16-5-27.
 */
public class SampleViewHolder extends BaseViewHolder<String> {

    @Bind(R.id.is_tv_content)
    TextView mIsTvContent;

    public SampleViewHolder(Context context, ViewGroup root) {
        super(context, root, R.layout.item_sample);
    }

    @Override
    protected void bindData(final String itemValue, final int position, final OnItemClickListener listener) {
        if (itemValue != null) {
            mIsTvContent.setText(itemValue);
        }
        mIsTvContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener == null){
                    return;
                }
                listener.onItemClick(itemValue , v.getId() , position);
            }
        });
    }
}
