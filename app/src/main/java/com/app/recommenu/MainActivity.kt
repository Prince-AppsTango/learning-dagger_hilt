package com.app.recommenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.app.recommenu.di.Downloader
import com.app.recommenu.di.DownloaderFactory
import com.app.recommenu.ui.theme.RecommenuTheme

class MainActivity : ComponentActivity() {
    private  lateinit var  baseApp: BaseApp
    private var  download= DownloaderFactory.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecommenuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Hello Android")
                }
            }
        }
        baseApp = BaseApp()
        baseApp.car.getCar()
        download.getDownload()
    }
}


//class 1 ---------> External source ------------> class2