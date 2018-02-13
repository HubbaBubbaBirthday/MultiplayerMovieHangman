package com.hangingman.multiplayermoviehangman

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainMenu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun goToNextScreen(view: View?) {
        fun newIntent(context: Context?): Intent {
            val intent = Intent(context, EnterPlayerDetailsActivity::class.java)
            return intent
        }
        if (view != null) {
            startActivity(newIntent(context = view.context))
        }
    }
}
