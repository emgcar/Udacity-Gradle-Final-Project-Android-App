package com.udacity.brave_bunny.app;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import com.example.JavaJokeClass;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Jemma on 1/4/2017.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void asyncTaskRetrieveNonemptyString() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();

        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String joke = task.execute(new Pair<Context, String>(appContext, "Manfred")).get();

        assertTrue(joke.equals("Is your name Wi-Fi? Because I'm feeling a connection."));
        assertNotNull(joke);
    }
}
