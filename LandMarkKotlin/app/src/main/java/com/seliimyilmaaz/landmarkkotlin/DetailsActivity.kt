package com.seliimyilmaaz.landmarkkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.seliimyilmaaz.landmarkkotlin.databinding.ActivityDetailsBinding
import com.seliimyilmaaz.landmarkkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(LayoutInflater.from(this))
        var view = binding.root

        var intent = getIntent()

        val selectedIndex = Singelton.chosenLandMark

        selectedIndex.let {
            binding.txtLandMarkName.text = it!!.name
            binding.txtDescription.text = it!!.definitionOfLandmark
            binding.imgOfLandMark.setImageResource(it!!.imageNumber)
        }

        setContentView(view)
    }
}