package com.daggerhiltexample

import androidx.lifecycle.ViewModel
import com.daggerhiltexample.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    //Lazy injection -> Lazy<MyRepository> -
    // it's created when we first use it
    private val repository: dagger.Lazy<MyRepository>
): ViewModel() {

    init {
        //Lazy injection
        //https://www.youtube.com/watch?v=bbMsuI2p1DQ&list=RDCMUCKNTZMRHPLXfqlbdOI7mCkg&index=24
        //at the and of the video about for what we nee Lazy injection
        //token value from api after already login etc...
        repository.get()
    }
}