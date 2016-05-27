package com.lypeer.baseadapter.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lypeer.baseadapter.base.api.OnItemClickListener;

import java.util.List;

/**
 * Adapter基类.
 * 适用于只有单个Item的RecyclerView.
 *
 * Created by lypeer on 16-5-24.
 */
public abstract class BaseAdapter<V> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /**
     * 装载了每个Item的Value的列表
     */
    private List<V> mValueList;

    /**
     * 我写的一个接口，通过回调分发点击事件
     */
    private OnItemClickListener<V> mOnItemClickListener;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return createViewHolder(parent.getContext(), parent);
    }

    @Override
    @SuppressWarnings("unchecked")//一定会是BaseViewHolder的子类，因为createViewHolder()的返回值
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((BaseViewHolder) holder).setData(mValueList.get(position), position, mOnItemClickListener);
    }

    /**
     * 设置每个Item的点击事件
     * @param listener
     */
    public void setOnClickListener(OnItemClickListener<V> listener) {
        this.mOnItemClickListener = listener;
    }

    /**
     * 刷新数据
     * @param valueList 新的数据列表
     */
    public void refreshData(List<V> valueList) {
        this.mValueList = valueList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mValueList == null ? 0 : mValueList.size();
    }

    /**
     * 生成ViewHolder
     * @param context
     * @param parent
     * @return
     */
    protected abstract BaseViewHolder createViewHolder(Context context, ViewGroup parent);
}

