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

    String autoJewelRed1;
    String safeZoneRed1;
    String autoCubeRed1;
    String autoColRed1;
    String autoJewelRed2;
    String safeZoneRed2;
    String autoCubeRed2;
    String autoColRed2;
    String autoJewelBlue1;
    String safeZoneBlue1;
    String autoCubeBlue1;
    String autoColBlue1;
    String autoJewelBlue2;
    String safeZoneBlue2;
    String autoCubeBlue2;
    String autoColBlue2;

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
        final RelativeLayout topLeft = (RelativeLayout) findViewById(R.id.topLeftPanelTele);
        final RelativeLayout topRight = (RelativeLayout) findViewById(R.id.topRightPanelTele);
        final RelativeLayout bottomLeft = (RelativeLayout) findViewById(R.id.bottomLeftPanelTele);
        final RelativeLayout bottomRight = (RelativeLayout) findViewById(R.id.bottomRightPanelTele);

        topLeft.setVisibility(View.VISIBLE);
        topRight.setVisibility(View.VISIBLE);
        bottomLeft.setVisibility(View.VISIBLE);
        bottomRight.setVisibility(View.VISIBLE);
    }

    private void collectTeleData() {
        final RelativeLayout topLeft = (RelativeLayout) findViewById(R.id.topLeftPanelTele);
        final RelativeLayout topRight = (RelativeLayout) findViewById(R.id.topRightPanelTele);
        final RelativeLayout bottomLeft = (RelativeLayout) findViewById(R.id.bottomLeftPanelTele);
        final RelativeLayout bottomRight = (RelativeLayout) findViewById(R.id.bottomRightPanelTele);

        topLeft.setVisibility(View.INVISIBLE);
        topRight.setVisibility(View.INVISIBLE);
        bottomLeft.setVisibility(View.INVISIBLE);
        bottomRight.setVisibility(View.INVISIBLE);

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
        final RelativeLayout topLeft = (RelativeLayout) findViewById(R.id.topLeftPanelAuto);
        final RelativeLayout topRight = (RelativeLayout) findViewById(R.id.topRightPanelAuto);
        final RelativeLayout bottomLeft = (RelativeLayout) findViewById(R.id.bottomLeftPanelAuto);
        final RelativeLayout bottomRight = (RelativeLayout) findViewById(R.id.bottomRightPanelAuto);

        topLeft.setVisibility(View.VISIBLE);
        topRight.setVisibility(View.VISIBLE);
        bottomLeft.setVisibility(View.VISIBLE);
        bottomRight.setVisibility(View.VISIBLE);
    }

    private void collectAutoData() {
        final RelativeLayout topLeft = (RelativeLayout) findViewById(R.id.topLeftPanelAuto);
        final RelativeLayout topRight = (RelativeLayout) findViewById(R.id.topRightPanelAuto);
        final RelativeLayout bottomLeft = (RelativeLayout) findViewById(R.id.bottomLeftPanelAuto);
        final RelativeLayout bottomRight = (RelativeLayout) findViewById(R.id.bottomRightPanelAuto);

        topLeft.setVisibility(View.INVISIBLE);
        topRight.setVisibility(View.INVISIBLE);
        bottomLeft.setVisibility(View.INVISIBLE);
        bottomRight.setVisibility(View.INVISIBLE);

        EditText editTextAutoJewelRed1 = (EditText) findViewById(R.id.autoJewelRed1);
        EditText editTextSafeZoneRed1 = (EditText) findViewById(R.id.safeZoneRed1);
        EditText editTextAutoCubeRed1 = (EditText) findViewById(R.id.autoCubeRed1);
        EditText editTextAutoColRed1 = (EditText) findViewById(R.id.autoColRed1);

        EditText editTextAutoJewelRed2 = (EditText) findViewById(R.id.autoJewelRed2);
        EditText editTextSafeZoneRed2 = (EditText) findViewById(R.id.safeZoneRed2);
        EditText editTextAutoCubeRed2 = (EditText) findViewById(R.id.autoCubeRed2);
        EditText editTextAutoColRed2 = (EditText) findViewById(R.id.autoColRed2);

        EditText editTextAutoJewelBlue1 = (EditText) findViewById(R.id.autoJewelBlue1);
        EditText editTextSafeZoneBlue1 = (EditText) findViewById(R.id.safeZoneBlue1);
        EditText editTextAutoCubeBlue1 = (EditText) findViewById(R.id.autoCubeBlue1);
        EditText editTextAutoColBlue1 = (EditText) findViewById(R.id.autoColBlue1);

        EditText editTextAutoJewelBlue2 = (EditText) findViewById(R.id.autoJewelBlue2);
        EditText editTextSafeZoneBlue2 = (EditText) findViewById(R.id.safeZoneBlue2);
        EditText editTextAutoCubeBlue2 = (EditText) findViewById(R.id.autoCubeBlue2);
        EditText editTextAutoColBlue2 = (EditText) findViewById(R.id.autoColBlue2);

        autoJewelRed1 = editTextAutoJewelRed1.getText().toString();
        safeZoneRed1 = editTextSafeZoneRed1.getText().toString();
        autoCubeRed1 = editTextAutoCubeRed1.getText().toString();
        autoColRed1 = editTextAutoColRed1.getText().toString();

        autoJewelRed2 = editTextAutoJewelRed1.getText().toString();
        safeZoneRed2 = editTextSafeZoneRed1.getText().toString();
        autoCubeRed2 = editTextAutoCubeRed1.getText().toString();
        autoColRed2 = editTextAutoColRed1.getText().toString();

        autoJewelBlue1 = editTextAutoJewelRed1.getText().toString();
        safeZoneBlue1 = editTextSafeZoneRed1.getText().toString();
        autoCubeBlue1 = editTextAutoCubeRed1.getText().toString();
        autoColBlue1 = editTextAutoColRed1.getText().toString();

        autoJewelBlue2 = editTextAutoJewelRed1.getText().toString();
        safeZoneBlue2 = editTextSafeZoneRed1.getText().toString();
        autoCubeBlue2 = editTextAutoCubeRed1.getText().toString();
        autoColBlue2 = editTextAutoColRed1.getText().toString();
    }

    private void createSaveFile() {

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
            createSaveFile();
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
