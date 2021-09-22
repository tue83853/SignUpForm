package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.name)
        val userEmail: EditText = findViewById(R.id.email)
        val userPassword: EditText = findViewById(R.id.password)
        val confirm: EditText = findViewById(R.id.confirmpassword)
        val clickButton: Button = findViewById(R.id.register)

        // This will create a listener for click event
        val ocl: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val name: String = username.getText().toString()
                val email: String = userEmail.getText().toString()
                val password: String = userPassword.getText().toString()
                val confirmPassword: String = confirm.getText().toString()

                if (name == " " || email == " " || password == " " || confirmPassword == " ") {
                    val t: Toast = Toast.makeText(this@MainActivity, "Please enter all everything", Toast.LENGTH_SHORT)
                    t.show()

                } else if (password != confirmPassword) {
                    val t: Toast = Toast.makeText(this@MainActivity, "Error: Passwords don't match", Toast.LENGTH_SHORT)
                    t.show()

                } else {
                    val t: Toast =
                        Toast.makeText(this@MainActivity, "Your information has been saved! Welcome and thank you for registering!",
                            Toast.LENGTH_SHORT)
                    t.show()
                }
            }
        }
        clickButton.setOnClickListener(ocl)
    }
}