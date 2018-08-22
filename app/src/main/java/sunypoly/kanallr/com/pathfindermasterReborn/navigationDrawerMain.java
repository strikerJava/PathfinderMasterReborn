package sunypoly.kanallr.com.pathfindermasterReborn;

import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentBarbarianMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentBardMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentClericMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentDruidMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentFighterMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentMonkMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentPaladinMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentRangerMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentRougeMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentSorcererMake;
import sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments.FragmentWizardMake;
import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.*;


public class navigationDrawerMain extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Barbarian) {
            Fragment fr;
            fr = new FragmentBarbarianMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();

            // Handle the camera action
        } else if (id == R.id.Bard) {
            Fragment fr;
            fr = new FragmentBardMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Cleric) {
            Fragment fr;
            fr = new FragmentClericMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();

        } else if (id == R.id.Druid) {
            Fragment fr;
            fr = new FragmentDruidMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();

        }  else if (id == R.id.Fighter) {
            Fragment fr;
            fr = new FragmentFighterMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Monk) {
            Fragment fr;
            fr = new FragmentMonkMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Paladin) {
            Fragment fr;
            fr = new FragmentPaladinMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Ranger) {
            Fragment fr;
            fr = new FragmentRangerMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Rouge) {
            Fragment fr;
            fr = new FragmentRougeMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Sorcerer) {
            Fragment fr;
            fr = new FragmentSorcererMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Wizard) {
            Fragment fr;
            fr = new FragmentWizardMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.testDirectory) {
            Fragment fr;
            fr = new FragmentTestDir();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_send) {

        }
        else if (id == R.id.drawer_layout){
            Fragment fr;
            fr = new FragmentNewLayout();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    public void makeExternalDir(View view){
        // create a directory before creating a new file inside it.
        String intStorageDirectory = getFilesDir().toString();
        File mydir = new File(Environment.getExternalStorageDirectory() + "/mydir/");
        mydir.mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("sample.txt."), "utf-8"))) {
            writer.write("Character : dsadasdasmnbdsaknmdhgbsahjdkgsahjdasgvdhjsgdahjdgashjdgasdjhsagdsjhdgsahjdgsadhjsagdhjsadgsahjdsahjdsagjhsadghjdgsdjhsagdhjasdgasjhdgsadjhas");
            writer.newLine();
            writer.close();
        }
        catch (IOException x) {
            System.err.println(x);
        }

    }

}

