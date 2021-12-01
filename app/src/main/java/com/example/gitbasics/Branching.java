package com.example.gitbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Branching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branching);

        /*

        Introduction to Branching
        Step 1: Create New Branch from bottom branch options
        Step 2: Give a Specific and relatable name so that we can easily identify it
        Step 3: Now start making changes, it won't affect on master branch

        Now after adding all the things in the specific branch:
        Follow the process for merging and puling in your master branch
        Step 1: Once you commit and push your work in specific branch,
        you will get one pull request on github account,accept and click>
        "create pull request">> then select "Merge">>
        Step 2: Once you select merge, github will merge the master and specific branch
        Step 3: Now we need to change our branch to Master branch in Android Studio:
        Step4: Then we need to select the option of "Fetch" from git
        Step 5: Then you need to select pull by right clicking the project option and selecting git
        Step 6: After selecting pull all the changes will updated in master branch
        //Done


         */
    }
}