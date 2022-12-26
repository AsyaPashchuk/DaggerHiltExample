package com.daggerhiltexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.daggerhiltexample.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    //use field injection for Service(because you can't add constructor to service )
    @Inject
    lateinit var repository: MyRepository
    //use it in onCreate(), because there the di will have been done


    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}