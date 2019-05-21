package myapp.com.layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var frame1 : FrameLayout
    private lateinit var frame2 : FrameLayout
    private lateinit var frame3 : FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frame1 = findViewById(R.id.frame1)
        frame2 = findViewById(R.id.frame2)
        frame3 = findViewById(R.id.frame3)

        frame1.setOnClickListener{
        }
    }
}
