package com.softyoumobileapp.data.network.fake

import android.content.Context
import android.content.res.AssetManager
import android.content.res.Resources
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.softyoumobileapp.data.network.NetworkMarvelDataSource
import com.softyoumobileapp.data.network.models.ResponseMarvel
import com.softyoumobileapp.data.network.models.ResultComics
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import javax.inject.Inject

class FakeNetworkMarvel @Inject constructor(
    private val networkJson: Json,
    private val context: Context
): NetworkMarvelDataSource {

    private val gson: Gson = GsonBuilder().setPrettyPrinting().create()

    fun provideInfo() {
        with(Dispatchers.IO){
            try {
                val info = gson.fromJson(context.assets.readFile(RESOURCE_COMICS),
                    ResponseMarvel::class.java) as (ResponseMarvel<ResultComics>)
                print(info.toString())
            }catch (e: Exception){
                print(e.message)
            }
        }
    }

    fun AssetManager.readFile(fileName: String) = open(fileName)
        .bufferedReader()
        .use { it.readText() }

    companion object {
        private const val RESOURCE_COMICS = "resource-comics.json"
        private const val RESOURCES_CREATORS = "response-creators.json"

    }
}