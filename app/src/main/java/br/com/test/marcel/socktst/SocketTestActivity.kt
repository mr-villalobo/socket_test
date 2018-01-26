package br.com.test.marcel.socktst

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_socket_test.*

class SocketTestActivity : Activity() {
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_socket_test)
    }
    
    override fun onStart() {
        super.onStart()
    
        testBtn.setOnClickListener({
            Toast.makeText(this, "Click!", Toast.LENGTH_LONG).show()
        })
    }
}
