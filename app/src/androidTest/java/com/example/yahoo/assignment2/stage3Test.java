package com.example.yahoo.assignment2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityTestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)

public class stage3Test {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);

    @Test
    public void TestInvalid() {
      onView(withId(R.id.password)).perform(typeText(""));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Not valid password")));
    }
    @Test
    public void TestTooWeak() {
        onView(withId(R.id.password)).perform(typeText("123"));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Too Weak")));

    }
    @Test
    public void TestNotStrong(){
        onView(withId(R.id.password)).perform(typeText("YahuWang"));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Not Strong")));
    }

    @Test
    public void TestStrong(){
        onView(withId(R.id.password)).perform(typeText("YahuWang970524"));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Strong")));
    }
    @Test
    public void TestVeryStrong(){
        onView(withId(R.id.password)).perform(typeText("YahuWang970524!@"));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Very Strong")));
    }
}
