package com.app.recommenu.di

import android.util.Log


// why we do not prefer manual di injection
/*
    HttpClient,
    Executor,
    Request,
    Downloader
*/

class HttpClient{

}
class Executor{

}
class Request constructor(private  val httpClient: HttpClient, private val executor: Executor){
       fun getRequest(){
           Log.d("main", "file Downloading.... ")
       }
}
class Downloader(private val request: Request){
     fun getDownload(){
         request.getRequest()
     }
}


object DownloaderFactory{
    fun create():Downloader{
        var httpClient = HttpClient()
        var executor= Executor()
        var request = Request(httpClient, executor)
        return Downloader(request)
    }
}