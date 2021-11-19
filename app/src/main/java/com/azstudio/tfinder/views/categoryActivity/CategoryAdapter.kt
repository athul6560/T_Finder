package com.azstudio.tfinder.views.categoryActivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azstudio.tfinder.R
import com.azstudio.tfinder.data.model.Category

class CategoryAdapter (private val mList: List<Category>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list_inflator, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = mList[position]


        holder.categoryName.text = itemsViewModel.CategoryName

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val categoryName: TextView = itemView.findViewById(R.id.category_name_holder)
    }
}