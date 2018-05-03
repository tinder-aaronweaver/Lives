/**
 * Created by Adib Faramarzi
 */

@file:JvmName("Lives")
@file:JvmMultifileClass
package com.snakydesign.livedataextensions

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

/**
 * Creates a LiveData that emits the initialValue immediately.
 */
fun<T> just(initialValue:T): MutableLiveData<T> {
    return MutableLiveData<T>().apply{
        value = initialValue
    }
}


/**
 * Creates a LiveData that emits the value that the `callable` function produces, immediately.
 */
fun<T> from(callable : ()->T):LiveData<T>{
    val returnedLiveData = MutableLiveData<T>()
    returnedLiveData.value = callable.invoke()
    return returnedLiveData
}

/**
 * Creates an empty LiveData.
 */
fun<T> empty():MutableLiveData<T>{
    return MutableLiveData()
}