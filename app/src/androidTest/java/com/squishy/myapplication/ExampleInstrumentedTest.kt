package com.squishy.myapplication

import android.content.Intent
import android.view.LayoutInflater
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnitRunner

import org.junit.Test
import org.junit.runner.RunWith

import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ScreenshotRunner
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.After

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule @JvmField
    var activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setup() {
        ScreenshotRunner.onCreate(InstrumentationRegistry.getInstrumentation(), null)
    }

    @Test
    fun testing() {
        activityTestRule.scenario.onActivity {
            Screenshot.snapActivity(it).record()
        }
    }

    @After
    fun after() {
        ScreenshotRunner.onDestroy()
    }

}