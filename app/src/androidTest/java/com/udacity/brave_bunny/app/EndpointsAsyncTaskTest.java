package com.udacity.brave_bunny.app;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Jemma on 1/4/2017.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {


    @Test
    public void asyncTaskRetrieveNonemptyString() throws Exception {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String joke = task.retrieveJoke();
        assertNotNull(joke);
    }
}
