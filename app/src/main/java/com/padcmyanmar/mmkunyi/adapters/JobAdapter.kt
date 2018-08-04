package com.padcmyanmar.mmkunyi.adapters

import android.content.Context
import android.view.ViewGroup
import com.padcmyanmar.mmkunyi.R
import com.padcmyanmar.mmkunyi.data.vo.JobVO
import com.padcmyanmar.mmkunyi.viewholders.BaseViewHolder
import com.padcmyanmar.mmkunyi.viewholders.JobViewholder
import java.security.AccessControlContext

class JobAdapter(context: Context): BaseRecyclerAdapter<JobViewholder,JobVO>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<JobVO> {
        val jobViewItem=mlayoutInflater.inflate(R.layout.view_item_jobs,parent,false)
        return JobViewholder(jobViewItem)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<JobVO>, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}