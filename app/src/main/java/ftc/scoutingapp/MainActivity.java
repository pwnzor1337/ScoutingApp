package ftc.scoutingapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeoutException;

/**
 * Created by Kaleb on 11/12/2017.
 */

/*  TODO: Area where scouters can enter in data that other teams tell them
    TODO: Area where they can view what other teams scores are in certain areas
    TODO: Ability to search for a team number/name and find that team's stats
 */

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> viewHistory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.menu);
    }

    @Override
    public void setContentView(int layoutResID) {
        System.out.println("setting content");
        super.setContentView(layoutResID);

        System.out.println("adding to viewhistory");
        viewHistory.add(layoutResID);
    }


    private void goBackOneView() {
        viewHistory.remove(viewHistory.size() - 1);
        super.setContentView(viewHistory.get(viewHistory.size() - 1));
    }

    //This is = pressing back button.
    @Override
    public void onBackPressed() {
        if(viewHistory.size() > 1) {
            goBackOneView();
        }
        else {
//            System.exit(1);
            super.onBackPressed();
        }
    }

    public void closeKeyboard(View v) {
        if(v!=null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }

    public void addReport(View v) {

        onBackPressed();
    }

    public void findTeam(View v) {
        String teamNumber;

//        SharedPreferences sharedpref = getSharedPreferences(teamNumber,
    }


    public void goToBrowseData(View v) {
        System.out.println("going to browse data");
        setContentView(R.layout.browse_data);
    }
    public void goToNewScoring(View v) {
        System.out.println("going to new scoring");
        Intent addScoringActivityScreenIntent = new Intent(this, AddScoringActivity.class);
        final int result = 1;
        startActivityForResult(addScoringActivityScreenIntent,result);
    }
    public void goToNewReport(View v) {
        System.out.println("going to new report");
        setContentView(R.layout.new_report);
    }
    public void goToHelp(View v) {
        System.out.println("going to help");
        setContentView(R.layout.help);
    }
}
