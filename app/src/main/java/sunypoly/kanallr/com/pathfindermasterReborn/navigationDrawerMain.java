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

    PaladinMake paladinOne;
    RangerMake rangerOne;
    RougeMake rougeOne;
    WizardMake wizardOne;

    int c = 0;
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


    public void spawnPaladin(View view){
        paladinOne = new PaladinMake();
        paladinOne.spawnLV1Paladin();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(paladinOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(paladinOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(paladinOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(paladinOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(paladinOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(paladinOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(paladinOne.sizeFeet) + "' "  + Integer.toString(paladinOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(paladinOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(paladinOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + paladinOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +paladinOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(paladinOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(paladinOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(paladinOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(paladinOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(paladinOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(paladinOne.touchAC));
        if(paladinOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[0]));
        }
        if(paladinOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[1]));
        }
        if(paladinOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[2]));
        }
        if(paladinOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[3]));
        }
        if(paladinOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[0]));
        }
        if(paladinOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[1]));
        }
        if(paladinOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[2]));
        }
        if(paladinOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(paladinOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(paladinOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(paladinOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(paladinOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(paladinOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(paladinOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(paladinOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(paladinOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(paladinOne.SpecialSkills[0]);
        textTest.append(", " + paladinOne.SpecialSkills[1]);

            textTest = (TextView) this.findViewById(R.id.SpellsAt0);
            textTest.setText("0");

            textTest = (TextView) this.findViewById(R.id.SpellsAt1);
            textTest.setText("0");


            textTest = (TextView) this.findViewById(R.id.SpellsAt2);
            textTest.setText("0");

            textTest = (TextView) this.findViewById(R.id.SpellsAt3);
            textTest.setText("0");


            textTest = (TextView) this.findViewById(R.id.SpellsAt4);
            textTest.setText("0");


        //incomplete*/

    }
    public void levelUpPaladinButton(View view){

        paladinOne.levelUpPaladin();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(paladinOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(paladinOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(paladinOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(paladinOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(paladinOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(paladinOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(paladinOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(paladinOne.touchAC));
        if(paladinOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[0]));
        }
        if(paladinOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[1]));
        }
        if(paladinOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[2]));
        }
        if(paladinOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[3]));
        }
        if(paladinOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[0]));
        }
        if(paladinOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[1]));
        }
        if(paladinOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[2]));
        }
        if(paladinOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(paladinOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(paladinOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(paladinOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(paladinOne.SpecialSkills[c] + ", ");
            c++;
        }

        if(paladinOne.totalPaladinSpells[0] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt0);
            textTest.setText("");
        }
        if(paladinOne.totalPaladinSpells[1] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt1);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[1]));

        }
        if(paladinOne.totalPaladinSpells[2] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt2);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[2]));
        }
        if(paladinOne.totalPaladinSpells[3] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt3);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[3]));
        }
        if(paladinOne.totalPaladinSpells[4] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt4);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[4]));
        }

    }
    public void spawnRanger(View view){
        rangerOne = new RangerMake();
        rangerOne.spawnLV1Ranger();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rangerOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(rangerOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rangerOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(rangerOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(rangerOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(rangerOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(rangerOne.sizeFeet) + "' "  + Integer.toString(rangerOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(rangerOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(rangerOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + rangerOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +rangerOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rangerOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rangerOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rangerOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rangerOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rangerOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rangerOne.touchAC));
        if(rangerOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[0]));
        }
        if(rangerOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[1]));
        }
        if(rangerOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[2]));
        }
        if(rangerOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[3]));
        }
        if(rangerOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[0]));
        }
        if(rangerOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[1]));
        }
        if(rangerOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[2]));
        }
        if(rangerOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rangerOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(rangerOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(rangerOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rangerOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(rangerOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(rangerOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(rangerOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rangerOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(rangerOne.SpecialSkills[0]);
        textTest.append(", " + rangerOne.SpecialSkills[1]);
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText("-");
        //incomplete*/

    }
    public void levelUpRangerButton(View view){

        rangerOne.levelUpRanger();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rangerOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rangerOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rangerOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rangerOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rangerOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rangerOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rangerOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rangerOne.touchAC));
        if(rangerOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[0]));
        }
        if(rangerOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[1]));
        }
        if(rangerOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[2]));
        }
        if(rangerOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[3]));
        }
        if(rangerOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[0]));
        }
        if(rangerOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[1]));
        }
        if(rangerOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[2]));
        }
        if(rangerOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rangerOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rangerOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rangerOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(rangerOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[4]));

    }
    public void spawnRouge(View view){
        rougeOne = new RougeMake();
        rougeOne.spawnLV1Rouge();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rougeOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(rougeOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rougeOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(rougeOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(rougeOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(rougeOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(rougeOne.sizeFeet) + "' "  + Integer.toString(rougeOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(rougeOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(rougeOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + rougeOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +rougeOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rougeOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rougeOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rougeOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rougeOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rougeOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rougeOne.touchAC));
        if(rougeOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[0]));
        }
        if(rougeOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[1]));
        }
        if(rougeOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[2]));
        }
        if(rougeOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[3]));
        }
        if(rougeOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[0]));
        }
        if(rougeOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[1]));
        }
        if(rougeOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[2]));
        }
        if(rougeOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rougeOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(rougeOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(rougeOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rougeOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(rougeOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(rougeOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(rougeOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rougeOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(rougeOne.SpecialSkills[0]);
        textTest.append(", " + rougeOne.SpecialSkills[1]);

        //incomplete*/

    }
    public void levelUpRougeButton(View view){

        rougeOne.levelUpRouge();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rougeOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rougeOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rougeOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rougeOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rougeOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rougeOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rougeOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rougeOne.touchAC));
        if(rougeOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[0]));
        }
        if(rougeOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[1]));
        }
        if(rougeOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[2]));
        }
        if(rougeOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[3]));
        }
        if(rougeOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[0]));
        }
        if(rougeOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[1]));
        }
        if(rougeOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[2]));
        }
        if(rougeOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rougeOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rougeOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rougeOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(rougeOne.SpecialSkills[c] + ", ");
            c++;
        }


    }
    public void spawnWizard(View view){
        wizardOne = new WizardMake();
        wizardOne.spawnLV1Wiz();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(wizardOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(wizardOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(wizardOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(wizardOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(wizardOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(wizardOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(wizardOne.sizeFeet) + "' "  + Integer.toString(wizardOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(wizardOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(wizardOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + wizardOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +wizardOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(wizardOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(wizardOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(wizardOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(wizardOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(wizardOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(wizardOne.touchAC));
        if(wizardOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[0]));
        }
        if(wizardOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[1]));
        }
        if(wizardOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[2]));
        }
        if(wizardOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[3]));
        }
        if(wizardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[0]));
        }
        if(wizardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[1]));
        }
        if(wizardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[2]));
        }
        if(wizardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(wizardOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(wizardOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(wizardOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(wizardOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(wizardOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(wizardOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(wizardOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(wizardOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(wizardOne.SpecialSkills[0]);
        textTest.append(", " + wizardOne.SpecialSkills[1]);
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[9]));
        //incomplete*/

    }
    public void levelUpWizardButton(View view){

        wizardOne.levelUpWiz();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(wizardOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(wizardOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(wizardOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(wizardOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(wizardOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(wizardOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(wizardOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(wizardOne.touchAC));
        if(wizardOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[0]));
        }
        if(wizardOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[1]));
        }
        if(wizardOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[2]));
        }
        if(wizardOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[3]));
        }
        if(wizardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[0]));
        }
        if(wizardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[1]));
        }
        if(wizardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[2]));
        }
        if(wizardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(wizardOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(wizardOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(wizardOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(wizardOne.SpecialSkills[c] + ", ");
            c++;
        }
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[9]));

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

