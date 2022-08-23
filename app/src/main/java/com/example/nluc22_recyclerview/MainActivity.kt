package com.example.nluc22_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nluc22_recyclerview.Adapters.StudentAdapter
import com.example.nluc22_recyclerview.databinding.ActivityMainBinding
import com.example.nluc22_recyclerview.model.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binder = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binder.root)

        val data = ArrayList<Student>()

        data.add(Student("120202222" ,"Ahmed E Murtaja" , 100.2 , R.drawable.ezz))
        data.add(Student("1202011111" ,"Suleiman K S AlJojo" , 101.2 , R.drawable.soliman))
        data.add(Student("120201234" ,"Abdullah K S Aljojo" , 66.5 , R.drawable.abd))
        data.add(Student("120200444" ,"Mahmoud S Habbush" , 63.4 , R.drawable.mah))
        data.add(Student("120202222" ,"Ahmed E Murtaja" , 100.2 , R.drawable.ezz))
        data.add(Student("1202011111" ,"Suleiman K S AlJojo" , 101.2 , R.drawable.soliman))
        data.add(Student("120201234" ,"Abdullah K S Aljojo" , 66.5 , R.drawable.abd))
        data.add(Student("120200444" ,"Mahmoud S Habbush" , 63.4 , R.drawable.mah))
        data.add(Student("120202222" ,"Ahmed E Murtaja" , 100.2 , R.drawable.ezz))
        data.add(Student("1202011111" ,"Suleiman K S AlJojo" , 101.2 , R.drawable.soliman))
        data.add(Student("120201234" ,"Abdullah K S Aljojo" , 66.5 , R.drawable.abd))
        data.add(Student("120200444" ,"Mahmoud S Habbush" , 63.4 , R.drawable.mah))
        data.add(Student("120202222" ,"Ahmed E Murtaja" , 100.2 , R.drawable.ezz))
        data.add(Student("1202011111" ,"Suleiman K S AlJojo" , 101.2 , R.drawable.soliman))
        data.add(Student("120201234" ,"Abdullah K S Aljojo" , 66.5 , R.drawable.abd))
        data.add(Student("120200444" ,"Mahmoud S Habbush" , 63.4 , R.drawable.mah))

        binder.rvStudent.layoutManager = LinearLayoutManager(this)
        val studentAdapter = StudentAdapter(this , data)
        binder.rvStudent.adapter = studentAdapter
    }
}