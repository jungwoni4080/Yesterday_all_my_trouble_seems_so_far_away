package com.implude.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<DataFriends>()
        val add = list.add(DataFriends(null, "비틀즈", "폴 메카트리, 존 레논, 조지 해리슨, 링고 스타"))
        list.add(DataFriends(null,"레드 제플린","존 폴존스, 로버트 플랜트, 존 본햄 외 1명"))
        list.add(DataFriends(null,"더 후","키스 문 외"))
        list.add(DataFriends(null,"The Velvet Underground", "루 리드, 니코 외"))

        val adapter = RecyclerAdapterFriends(list)
        RCV.adapter=adapter

    }
}