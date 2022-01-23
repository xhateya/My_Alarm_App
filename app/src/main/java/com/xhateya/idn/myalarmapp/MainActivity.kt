package com.xhateya.idn.myalarmapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTimeToday()
        initDatetoday()
        initAlarmType()
    }

    private fun initAlarmType() {
            view_set_one_time_alarm.setOnClickListener{
                startActivity(Intent(this, OneTimeAlarmActivity::class.java))

            }
            view_set_repeating_alarm.setOnClickListener {
                startActivity(Intent(this,RepeatingAlarmActivity::class.java))
            }
        }

    private fun initDatetoday() {
        val dateNow : Date = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("E, dd, MMM yyyy", Locale.getDefault())
        val formattedDate : String = dateFormat.format(dateNow)

      tv_date_today.text = formattedDate

    }

    private fun initTimeToday() {
        val timeNow = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH:mm")
        val formattedTime =timeFormat.format(timeNow.time)

        tv_time_today.text = formattedTime
    }
}