package com.example.myproyect10

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar


class WelcomeActivity:AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        val welcomeMessage="Welcome"

        val username=intent.getStringExtra("User")
        supportActionBar?.setTitle(username)

       // findViewById<TextView>(R.id.txtVwWelcomeUser).setText(welcomeMessage+""+username)


        val fap: View = findViewById(R.id.fab)
        fap.setOnClickListener{view->
            Snackbar.make(view,"Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()

        }


        val drawerLayout:DrawerLayout=findViewById(R.id.drawer_layout)
        val navView:NavigationView=findViewById(R.id.nav_view)
        val navController=findNavController(R.id.nav_host_fragment)

          appBarConfiguration=AppBarConfiguration(setOf(R.id.nav_todo,R.id.nav_profile),drawerLayout)

        setupActionBarWithNavController(navController,appBarConfiguration)

      navView.setupWithNavController(navController)

      val menu:Menu=navView.getMenu()
      val menuItem=menu.findItem(R.id.nav_logout)
      menuItem.setOnMenuItemClickListener { this.finish()
          true
      }


    }
    override fun onOptionsItemSelected(item: MenuItem)= when (item.itemId) {
        R.id.action_settings -> {
            Toast.makeText(this, R.string.action_settings, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_search -> {
            Toast.makeText(this, R.string.action_search, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_about-> {
            Toast.makeText(this, R.string.action_about, Toast.LENGTH_LONG).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)

        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_welcome, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration)||super.onSupportNavigateUp()
    }

}