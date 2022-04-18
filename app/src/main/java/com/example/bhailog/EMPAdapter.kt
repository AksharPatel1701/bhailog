package com

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bhailog.Emp
import com.example.bhailog.R
import kotlinx.android.synthetic.main.carditem.view.*


class EMPAdapter(val context:Context,var arr:ArrayList<Emp>)
    :RecyclerView.Adapter<EMPAdapter.PersonViewHolde>()

{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolde {
        var inflater=LayoutInflater.from(parent.context)
        var view= inflater.inflate(R.layout.carditem,parent,false)
        return PersonViewHolde(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolde, position: Int) {
        holder.bind(arr[position])

    }

    override fun getItemCount(): Int {
        return  arr.size
    }

    class PersonViewHolde(var view:View):RecyclerView.ViewHolder(view)
    {
        fun bind(p:Emp)
        {
            view.tvname.setText(p.emp_name)
            view.tvfathername.setText(p.emp_fathername)
            view.tvage.setText(p.emp_age.toString())


        }
    }
}
