package com.example.gmailrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rv);
        //name date boolean
        val dataa = arrayListOf(itemModel("Albert Einstein", "12/03/1879", true),
            itemModel("Nelson Mandela", "18/07/1918", false),
            itemModel("Mahatma Gandhi", "02/10/1869", true),
            itemModel("Martin Luther King Jr.", "15/01/1929", false),
            itemModel("Leonardo da Vinci", "15/04/1452", true),
            itemModel("Isaac Newton", "25/12/1642", false),
            itemModel("Winston Churchill", "30/11/1874", true),
            itemModel("Charles Darwin", "12/02/1809", false),
            itemModel("Abraham Lincoln", "12/02/1809", true),
            itemModel("Steve Jobs", "24/02/1955", false),
            itemModel("William Shakespeare", "26/04/1564", true),
            itemModel("Muhammad Ali", "17/01/1942", false),
            itemModel("Mother Teresa", "26/08/1910", true),
            itemModel("Albert Schweitzer", "14/01/1875", false),
            itemModel("Marie Curie", "07/11/1867", true),
            itemModel("Elvis Presley", "08/01/1935", false),
            itemModel("John F. Kennedy", "29/05/1917", true));
        rv.layoutManager = LinearLayoutManager(this);
        val adapter = RVCustom(dataa);
        val imageView = findViewById<ImageView>(R.id.imageView);
        imageView.setOnClickListener{
            dataa.removeAt(1);
            adapter.notifyItemRemoved(2)
        }

        rv.adapter = adapter
    }
}