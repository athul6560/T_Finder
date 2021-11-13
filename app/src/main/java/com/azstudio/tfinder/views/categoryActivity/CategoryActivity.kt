package com.azstudio.tfinder.views.categoryActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.azstudio.tfinder.R

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TFinder)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
    }
}