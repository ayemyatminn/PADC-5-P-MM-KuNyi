package com.padcmyanmar.mmkunyi.data.model

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference

class JobsModel(context: Context) {

    companion object {
        private var INSTANCE: JobsModel? = null
        private var mDatabaseReference: DatabaseReference? = null
        private var mJobDatabaseReference: DatabaseReference? = null
        private var mFireBaseAuth: FirebaseAuth?= null
        private var mFirebaseUser: FirebaseUser?= null
        fun getINSTANCE(): JobsModel {
            if (INSTANCE == null) {
                throw RuntimeException("Health Model is being initialized.")
            }
            var i = INSTANCE
            return i!!
        }

        fun initHealthModel(context: Context) {
            INSTANCE = JobsModel(context)
            mFireBaseAuth=FirebaseAuth.getInstance()
            mFirebaseUser = mFireBaseAuth.getCurrentUser()
        }
    }

    fun isUserLogin(): Boolean{
        return mFirebaseUser!=null
    }
}