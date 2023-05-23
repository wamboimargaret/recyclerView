package megan.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvnames: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onResume() {
        super.onResume()
        rvnames = findViewById(R.id.rvnames)


    }
    fun getFibonacciNumbers(limit: Int): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until limit) {
            fibonacciNumbers.add(fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2])
        }
        return fibonacciNumbers
         }

}