package com.Faith.blogreaderapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.Faith.blogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvArticle.layoutManager=LinearLayoutManager(this)
        Info()
    }

    fun Info(){

        val article1=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article2=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article3=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article4=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article5=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article6=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article7=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article8=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")
        val article9=Article("Joyce Shelly", "", "Migration", "1st June 2023", "Monarch travel on an anual basis", "", "Read More")


        var articleList= listOf(article1, article2, article3, article4, article5, article6, article7, article8, article9)
        val articleAdapter=articleAdapter(articleList)
        binding.rvArticle.adapter=articleAdapter
    }
}