package com.azstudio.tfinder.views.categoryActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.azstudio.tfinder.R
import com.azstudio.tfinder.data.model.Category
import com.azstudio.tfinder.databinding.ActivityCategoryBinding


class CategoryActivity : AppCompatActivity() {

    private var _binding: ActivityCategoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: CategoryAdapter
    private lateinit var listCategory: List<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TFinder)
        super.onCreate(savedInstanceState)
        _binding = ActivityCategoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setDummydata()
        setAdapter()
    }

    private fun setDummydata() {
        listCategory = listOf(
            Category("Electrician"),
            Category("AC Repair")

        )
    }


    private fun setAdapter() {

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        rvAdapter = CategoryAdapter(listCategory)


        binding.recyclerView.adapter = rvAdapter

    }
}