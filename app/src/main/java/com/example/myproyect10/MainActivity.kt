package com.example.myproyect10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private var User: EditText?=null
    private var Password: EditText?=null
    var intentosLogin=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        User=findViewById(R.id.edtTxUsrNm)
        Password=findViewById(R.id.edtTxtPsswd)
    }

    fun onLogin(view: View) {
        //Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show()
        if (User!!.text.toString().equals("jose")) {
            if (Password!!.text.toString().equals("123")) {
                val cambioAWelcomeActivity = Intent(this, WelcomeActivity::class.java)


                cambioAWelcomeActivity.putExtra("User", User!!.text.toString())

                val builder= AlertDialog.Builder(this)
                builder.setMessage(User!!.text.toString()).setTitle(getString(R.string.text_welcome)).setPositiveButton("OK"){dialog,witch->
                    val intento=Intent(this,WelcomeActivity::class.java)
                    intento.apply {
                        putExtra(
                            "User",
                            User!!.text.toString()
                        )


                    }
                    startActivity(cambioAWelcomeActivity)
                }
                val dialog=builder.create()
                dialog.show()



                //finish()
            }
            else{

                Password!!.setText("")
                Toast.makeText(this, getString(R.string.text_incorrect_password), Toast.LENGTH_LONG).show()

            }

        }

        else{
            User!!.setText("")
            Toast.makeText(this, getString(R.string.text_incorrect_username), Toast.LENGTH_LONG).show()

        }
        //intentosLogin++


    }
            }



