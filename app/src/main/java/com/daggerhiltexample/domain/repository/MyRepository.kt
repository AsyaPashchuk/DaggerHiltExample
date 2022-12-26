package com.daggerhiltexample.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}