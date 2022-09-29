package com.squishy.myapplication

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner
import com.facebook.testing.screenshot.ScreenshotRunner
import org.junit.runner.Runner
import kotlin.reflect.KClass

class SnapshotTestRunner : AndroidJUnitRunner() {
    override fun onCreate(arguments: Bundle?) {

        super.onCreate(arguments)
    }

    override fun finish(resultCode: Int, results: Bundle?) {
        ScreenshotRunner.onDestroy()
        super.finish(resultCode, results)
    }
}