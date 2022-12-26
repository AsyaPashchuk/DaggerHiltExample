package com.daggerhiltexample.data.repository

import android.app.Application
import com.daggerhiltexample.R
import com.daggerhiltexample.data.remote.MyApi
import com.daggerhiltexample.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}