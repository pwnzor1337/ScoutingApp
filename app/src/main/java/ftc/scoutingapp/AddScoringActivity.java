package ftc.scoutingapp;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Kaleb on 1/19/2018.
 */

public class AddScoringActivity extends AppCompatActivity {

    private int continueCounter = 0;

    EditText editTextNameRed1;
    EditText editTextNameRed2;
    EditText editTextNameBlue1;
    EditText editTextNameBlue2;

    TextView titleRed1;
    TextView titleRed2;
    TextView titleBlue1;
    TextView titleBlue2;

    TextView topLeftBackground;
    TextView topRightBackground;
    TextView bottomLeftBackground;
    TextView bottomRightBackground;

    //*****DATA******
    String teamRed1;
    String teamRed2;
    String teamBlue1;
    String teamBlue2;

    String rowRed1;
    String colRed1;
    String cubeRed1;
    String platRed1;
    String rowRed2;
    String colRed2;
    String cubeRed2;
    String platRed2;
    String rowBlue1;
    String colBlue1;
    String cubeBlue1;
    String platBlue1;
    String rowBlue2;
    String colBlue2;
    String cubeBlue2;
    String platBlue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("in new scoring");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_scoring);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        addNameEntries();
    }

    private void addNameEntries() {
        final RelativeLayout topLeft = (RelativeLayout) findViewById(R.id.topLeftPanel);
        final RelativeLayout topRight = (RelativeLayout) findViewById(R.id.topRightPanel);
        final RelativeLayout bottomLeft = (RelativeLayout) findViewById(R.id.bottomLeftPanel);
        final RelativeLayout bottomRight = (RelativeLayout) findViewById(R.id.bottomRightPanel);

        editTextNameRed1 = new EditText(this);
        editTextNameRed2 = new EditText(this);
        editTextNameBlue1 = new EditText(this);
        editTextNameBlue2 = new EditText(this);

        editTextNameRed1.setHint("Red 1 #");
        editTextNameRed2.setHint("Red 2 #");
        editTextNameBlue1.setHint("Blue 1 #");
        editTextNameBlue2.setHint("Blue 2 #");

        topLeft.addView(editTextNameRed1);
        topRight.addView(editTextNameRed2);
        bottomLeft.addView(editTextNameBlue1);
        bottomRight.addView(editTextNameBlue2);
    }

    private void setNames() {
        final RelativeLayout topLeft = (RelativeLayout) findViewById(R.id.topLeftPanel);
        final RelativeLayout topRight = (RelativeLayout) findViewById(R.id.topRightPanel);
        final RelativeLayout bottomLeft = (RelativeLayout) findViewById(R.id.bottomLeftPanel);
        final RelativeLayout bottomRight = (RelativeLayout) findViewById(R.id.bottomRightPanel);

        titleRed1 = new TextView(this);
        titleRed2 = new TextView(this);
        titleBlue1 = new TextView(this);
        titleBlue2 = new TextView(this);

        teamRed1 = editTextNameRed1.getText().toString();
        teamRed2 = editTextNameRed2.getText().toString();
        teamBlue1 = editTextNameBlue1.getText().toString();
        teamBlue2 = editTextNameBlue2.getText().toString();

        topLeft.setGravity(Gravity.TOP);
        topRight.setGravity(Gravity.TOP);
        bottomLeft.setGravity(Gravity.TOP);
        bottomRight.setGravity(Gravity.TOP);

        topLeft.setGravity(Gravity.CENTER_HORIZONTAL);
        topRight.setGravity(Gravity.CENTER_HORIZONTAL);
        bottomLeft.setGravity(Gravity.CENTER_HORIZONTAL);
        bottomRight.setGravity(Gravity.CENTER_HORIZONTAL);

        topLeft.removeView(editTextNameRed1);
        topRight.removeView(editTextNameRed2);
        bottomLeft.removeView(editTextNameBlue1);
        bottomRight.removeView(editTextNameBlue2);

        titleRed1.setText(teamRed1);
        titleRed2.setText(teamRed2);
        titleBlue1.setText(teamBlue1);
        titleBlue2.setText(teamBlue2);

        topLeft.addView(titleRed1);
        topRight.addView(titleRed2);
        bottomLeft.addView(titleBlue1);
        bottomRight.addView(titleBlue2);
    }

    private void setBackgroundColors() {
        topLeftBackground = (TextView) findViewById(R.id.topLeftPanelBackground);
        topRightBackground = (TextView) findViewById(R.id.topRightPanelBackground);
        bottomLeftBackground = (TextView) findViewById(R.id.bottomLeftPanelBackground);
        bottomRightBackground = (TextView) findViewById(R.id.bottomRightPanelBackground);

        topLeftBackground.setBackgroundColor(0x88ff0000);
        topRightBackground.setBackgroundColor(0x88ff0000);
        bottomLeftBackground.setBackgroundColor(0x880000ff);
        bottomRightBackground.setBackgroundColor(0x880000ff);
    }

    private void showTeleData() {

        System.out.println("yo im setting the shit to be visible rn.");
        findViewById(R.id.colRed1).setVisibility(View.VISIBLE);
        findViewById(R.id.rowRed1).setVisibility(View.VISIBLE);
        findViewById(R.id.cubeRed1).setVisibility(View.VISIBLE);
        findViewById(R.id.platformRed1).setVisibility(View.VISIBLE);

        findViewById(R.id.colRed2).setVisibility(View.VISIBLE);
        findViewById(R.id.rowRed2).setVisibility(View.VISIBLE);
        findViewById(R.id.cubeRed2).setVisibility(View.VISIBLE);
        findViewById(R.id.platformRed2).setVisibility(View.VISIBLE);

        findViewById(R.id.colBlue1).setVisibility(View.VISIBLE);
        findViewById(R.id.rowBlue1).setVisibility(View.VISIBLE);
        findViewById(R.id.cubeBlue1).setVisibility(View.VISIBLE);
        findViewById(R.id.platformBlue1).setVisibility(View.VISIBLE);

        findViewById(R.id.colBlue2).setVisibility(View.VISIBLE);
        findViewById(R.id.rowBlue2).setVisibility(View.VISIBLE);
        findViewById(R.id.cubeBlue2).setVisibility(View.VISIBLE);
        findViewById(R.id.platformBlue2).setVisibility(View.VISIBLE);
    }

    private void collectTeleData() {
        EditText editTextColRed1 = (EditText) findViewById(R.id.colRed1);
        EditText editTextRowRed1 = (EditText) findViewById(R.id.rowRed1);
        EditText editTextCubeRed1 = (EditText) findViewById(R.id.cubeRed1);
        EditText editTextPlatRed1 = (EditText) findViewById(R.id.platformRed1);

        EditText editTextColRed2 = (EditText) findViewById(R.id.colRed2);
        EditText editTextRowRed2 = (EditText) findViewById(R.id.rowRed2);
        EditText editTextCubeRed2 =(EditText) findViewById(R.id.cubeRed2);
        EditText editTextPlatRed2 = (EditText) findViewById(R.id.platformRed2);

        EditText editTextColBlue1 = (EditText) findViewById(R.id.colBlue1);
        EditText editTextRowBlue1 = (EditText) findViewById(R.id.rowBlue1);
        EditText editTextCubeBlue1 = (EditText) findViewById(R.id.cubeBlue1);
        EditText editTextPlatBlue1 = (EditText) findViewById(R.id.platformBlue1);

        EditText editTextColBlue2 = (EditText) findViewById(R.id.colBlue2);
        EditText editTextRowBlue2 = (EditText) findViewById(R.id.rowBlue2);
        EditText editTextCubeBlue2 = (EditText) findViewById(R.id.cubeBlue2);
        EditText editTextPlatBlue2 = (EditText) findViewById(R.id.platformBlue2);

        editTextColRed1.setVisibility(View.INVISIBLE);
        editTextRowRed1.setVisibility(View.INVISIBLE);
        editTextCubeRed1.setVisibility(View.INVISIBLE);
        editTextPlatRed1.setVisibility(View.INVISIBLE);

        editTextColRed2.setVisibility(View.INVISIBLE);
        editTextRowRed2.setVisibility(View.INVISIBLE);
        editTextCubeRed2.setVisibility(View.INVISIBLE);
        editTextPlatRed2.setVisibility(View.INVISIBLE);

        editTextColBlue1.setVisibility(View.INVISIBLE);
        editTextRowBlue1.setVisibility(View.INVISIBLE);
        editTextCubeBlue1.setVisibility(View.INVISIBLE);
        editTextPlatBlue1.setVisibility(View.INVISIBLE);

        editTextColBlue2.setVisibility(View.INVISIBLE);
        editTextRowBlue2.setVisibility(View.INVISIBLE);
        editTextCubeBlue2.setVisibility(View.INVISIBLE);
        editTextPlatBlue2.setVisibility(View.INVISIBLE);

        colRed1 = editTextColRed1.getText().toString();
        rowRed1 = editTextRowRed1.getText().toString();
        cubeRed1 = editTextCubeRed1.getText().toString();
        platRed1 = editTextPlatRed1.getText().toString();

        colRed2 = editTextColRed2.getText().toString();
        rowRed2 = editTextRowRed2.getText().toString();
        cubeRed2 = editTextCubeRed2.getText().toString();
        platRed2 = editTextPlatRed2.getText().toString();

        colBlue1 = editTextColBlue1.getText().toString();
        rowBlue1 = editTextRowBlue1.getText().toString();
        cubeBlue1 = editTextCubeBlue1.getText().toString();
        platBlue1 = editTextPlatBlue1.getText().toString();

        colBlue2 = editTextColBlue2.getText().toString();
        rowBlue2 = editTextRowBlue2.getText().toString();
        cubeBlue2 = editTextCubeBlue2.getText().toString();
        platBlue2 = editTextPlatBlue2.getText().toString();
    }

    private void showAutoData() {

    }

    private void collectAutoData() {

    }

    public void onContinue(View v) {
        System.out.println(continueCounter);
        closeKeyboard(v);
        if(continueCounter == 0) {
            setNames();
            setBackgroundColors();
            showTeleData();
            continueCounter++;
            return;
        }
        if(continueCounter == 1) {
            collectTeleData();
            showAutoData();
            continueCounter++;
            return;
        }
        if(continueCounter == 2) {
            collectAutoData();
            continueCounter++;
            return;
        }
    }



    public void closeKeyboard(View v) {
        if(v!=null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }
}
