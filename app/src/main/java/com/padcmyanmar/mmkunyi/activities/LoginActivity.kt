package com.padcmyanmar.mmkunyi.activities

import android.content.Intent
import android.os.Bundle
import com.padcmyanmar.mmkunyi.R
import com.padcmyanmar.mmkunyi.data.model.JobsModel
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)

        btnGoogleSignIn.setOnClickListener {
            if (JobsModel.getINSTANCE().isUserLogin()){
                var intent = Intent(applicationContext,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                var intent = Intent(applicationContext,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }



}