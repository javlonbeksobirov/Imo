package com.b12game.imo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.b12game.imo.R
import com.b12game.imo.adapter.ChatAdapter
import com.b12game.imo.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))
        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.im_javlon, "Javlonbek Sobirov", 1))
        chats.add(Chat(R.drawable.im_sardor, "Sardorbek Sobirov", 0))
        chats.add(Chat(R.drawable.ic_launcher_background, "Dostonbek Sobirov", 2))
        chats.add(Chat(R.drawable.im_sardor_2, "Rustamjon Sobirov", 3))
        chats.add(Chat(R.drawable.ic_launcher_background, "Imronbek Iminov", 1))
        chats.add(Chat(R.drawable.ic_launcher_background, "Ali Akbar Iminov", 0))
        chats.add(Chat(R.drawable.ic_launcher_background, "Hamdam Sobirov", 5))
        chats.add(Chat(R.drawable.ic_launcher_background, "Cristiano Ronaldo", 1))
        chats.add(Chat(R.drawable.im_messi, "Leonel Messi", 0))
        chats.add(Chat(R.drawable.ic_launcher_background, "Javlonbek Sobirov", 0))
        chats.add(Chat(R.drawable.ic_launcher_background, "Javlonbek Sobirov", 2))
        chats.add(Chat(R.drawable.ic_launcher_background, "Javlonbek Sobirov", 1))
        chats.add(Chat(R.drawable.ic_launcher_background, "Javlonbek Sobirov", 6))

        return chats
    }
}