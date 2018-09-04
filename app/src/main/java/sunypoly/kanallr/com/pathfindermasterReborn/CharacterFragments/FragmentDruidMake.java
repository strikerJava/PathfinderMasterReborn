package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.DruidMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentDruidMake extends Fragment implements View.OnClickListener {
    DruidMake druidOne;
    Button makeDruid;
    Button levelUpDruid;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View returningView = inflater.inflate(R.layout.druid_make, container, false);
        makeDruid = (Button) returningView.findViewById(R.id.SpawnDruidButton);levelUpDruid = (Button) returningView.findViewById(R.id.LevelDruid);
        makeDruid.setOnClickListener(this);
        levelUpDruid.setOnClickListener(this);
        levelUpDruid.setEnabled(false);
        return returningView;
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.SpawnDruidButton:
                spawnDruid();
                levelUpDruid.setEnabled(true);
                break;
            case R.id.LevelDruid:
                levelUpDruid();
                break;
        }
    }
    public void spawnDruid(){
        View currentView = getView();
        druidOne = new DruidMake();
        druidOne.spawnLV1Druid();
        TextView textTest = (TextView) currentView.findViewById(R.id.firstNameID);
        textTest.setText(druidOne.firstName);

        textTest = (TextView) currentView.findViewById(R.id.lastNameID);
        textTest.setText(druidOne.lastName);
        textTest = (TextView) currentView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(druidOne.level));
        textTest = (TextView) currentView.findViewById(R.id.genderID);
        textTest.setText(druidOne.gender);
        textTest = (TextView) currentView.findViewById(R.id.alignmentView);
        textTest.setText(druidOne.alignment);
        textTest = (TextView) currentView.findViewById(R.id.sizeClassView);
        textTest.setText(druidOne.sizeClass);
        textTest = (TextView) currentView.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(druidOne.sizeFeet) + "' "  + Integer.toString(druidOne.sizeInches) + "''");
        textTest = (TextView) currentView.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(druidOne.weight) + "lbs");
        textTest = (TextView) currentView.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(druidOne.age));
        textTest = (TextView) currentView.findViewById(R.id.hairView);
        textTest.setText("hair: " + druidOne.hair);
        textTest = (TextView) currentView.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +druidOne.eyes);
        textTest = (TextView) currentView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[1]));
        textTest = (TextView) currentView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[2]));
        textTest = (TextView) currentView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[5]));
        textTest = (TextView) currentView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[1]));
        textTest = (TextView) currentView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[2]));
        textTest = (TextView) currentView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(druidOne.fortSave));
        textTest = (TextView) currentView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(druidOne.refSave));
        textTest = (TextView) currentView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(druidOne.willSave));
        textTest = (TextView) currentView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseWillSave));
        textTest = (TextView) currentView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseRefSave));
        textTest = (TextView) currentView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseFortSave));
        textTest = (TextView) currentView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(druidOne.AC));
        textTest = (TextView) currentView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(druidOne.FlatFootAC));
        textTest = (TextView) currentView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(druidOne.touchAC));
        if(druidOne.AttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(druidOne.AttackBonus[0]));
        }
        if(druidOne.AttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(druidOne.AttackBonus[1]));
        }
        if(druidOne.AttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(druidOne.AttackBonus[2]));
        }
        if(druidOne.AttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(druidOne.AttackBonus[3]));
        }
        if(druidOne.baseAttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[0]));
        }
        if(druidOne.baseAttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[1]));
        }
        if(druidOne.baseAttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[2]));
        }
        if(druidOne.baseAttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[3]));
        }
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(druidOne.Initiative));
        textTest = (TextView) currentView.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(druidOne.hitDie1D));
        textTest = (TextView) currentView.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(druidOne.ranksPerLevelBase));
        textTest = (TextView) currentView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(druidOne.travelSpeed));
        textTest = (TextView) currentView.findViewById(R.id.weaponProfString);
        textTest.setText(druidOne.weaponProf);
        textTest = (TextView) currentView.findViewById(R.id.armProfString);
        textTest.setText(druidOne.armorProf);
        textTest = (TextView) currentView.findViewById(R.id.raceView);
        textTest.setText(druidOne.race);
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(druidOne.Initiative));
        textTest = (TextView) currentView.findViewById(R.id.specialSkills);
        textTest.setText(druidOne.SpecialSkills[0]);
        textTest.append(", " + druidOne.SpecialSkills[1]);
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[0]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[1]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[2]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[3]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[4]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[5]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[6]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[7]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[8]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[9]));

        //todo: Incomplete??
    }
    public void levelUpDruid(){
        View currentView = getView();
        druidOne.levelUpDruid();
        TextView textTest = (TextView) currentView.findViewById(R.id.firstNameID);
        textTest.setText(druidOne.firstName);


        textTest = (TextView) currentView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(druidOne.level));
        textTest = (TextView) currentView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[1]));
        textTest = (TextView) currentView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[2]));
        textTest = (TextView) currentView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[5]));
        textTest = (TextView) currentView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[1]));
        textTest = (TextView) currentView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[2]));
        textTest = (TextView) currentView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(druidOne.fortSave));
        textTest = (TextView) currentView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(druidOne.refSave));
        textTest = (TextView) currentView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(druidOne.willSave));
        textTest = (TextView) currentView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseWillSave));
        textTest = (TextView) currentView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseRefSave));
        textTest = (TextView) currentView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseFortSave));
        textTest = (TextView) currentView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(druidOne.AC));
        textTest = (TextView) currentView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(druidOne.FlatFootAC));
        textTest = (TextView) currentView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(druidOne.touchAC));
        if(druidOne.AttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(druidOne.AttackBonus[0]));
        }
        if(druidOne.AttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(druidOne.AttackBonus[1]));
        }
        if(druidOne.AttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(druidOne.AttackBonus[2]));
        }
        if(druidOne.AttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(druidOne.AttackBonus[3]));
        }
        if(druidOne.baseAttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[0]));
        }
        if(druidOne.baseAttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[1]));
        }
        if(druidOne.baseAttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[2]));
        }
        if(druidOne.baseAttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[3]));
        }
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(druidOne.Initiative));

        textTest = (TextView) currentView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(druidOne.travelSpeed));
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(druidOne.Initiative));

        textTest = (TextView) currentView.findViewById(R.id.specialSkills);


        textTest.setText("");
       int c = 0;
        while(c < 100){
            textTest.append(druidOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) currentView.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[0]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[1]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[2]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[3]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[4]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[5]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[6]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[7]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[8]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[9]));
    }
}