package com.padcmyanmar.mmkunyi.activities

import android.os.Bundle
import android.view.View
import com.google.android.gms.auth.api.signin.GoogleSignInApi
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.padcmyanmar.mmkunyi.R
import kotlinx.android.synthetic.main.activity_job_details.*

class JobDetailsActivity:BaseActivity(),View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_details)
        setSupportActionBar(toolbar)
    }
    override fun onConnectionFailed(p0: ConnectionResult) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}