package com.lypeer.baseadapter.base.api;

/**
 * 点击事件的接口
 * Created by lypeer on 16-5-24.
 */
public interface OnItemClickListener<V> {

    /**
     * 当item被点击的时候进行事件分发
     *
     * @param itemValue 点击的item传递的值
     * @param viewID    点击控件的id
     * @param position  被点击的item的位置
     */
    void onItemClick(V itemValue, int viewID, int position);
}
