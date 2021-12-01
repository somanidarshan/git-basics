package com.example.gitbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BranchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branching2);

        /*

        Consider you have 3 Branches:
        Mater , Branch1, Branch2
        Step1: At the beginning, everything is same in all three
        Scenario 1:
        Start making changes in Branch1
        >>Make changes>> Add Files>> Commit files >> Push the files
        On the Github you will get the request to pull and then merge
        So do merge it with master....
        Now when you come back to Android Studio
        >>Move to master branch >> Fetch >> Pull (From Master)
        Because you have already merged the branch with master so pull from master
        Result: All the changes you have done in Branch1 will get in your Master branch Successfully

        Scenario 2:
        Now Branch2 is unknown about all this, so he can directly >>>FETCH
        >>pULL>> From master, provided changes are merged with master..
        you will see all the changes in Branch2 as well...and similarly you can make changes
        then add>>commit>>and then push>>
        Request gets accepted and changes will be merged and can be pulled in master branch

         */
    }
}