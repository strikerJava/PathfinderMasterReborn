package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.FighterMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentFighterMake extends Fragment implements View.OnClickListener{
    FighterMake fighterOne;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View returningView = inflater.inflate(
                R.layout.fighter_make, container, false);
        //Inflate the layout for this fragment

        Button spawnFighter = (Button) returningView.findViewById(R.id.spawnFighterButton);
        Button levelUpFighter = (Button) returningView.findViewById(R.id.levelUpFighterButton);
        spawnFighter.setOnClickListener(this);
        levelUpFighter.setOnClickListener(this);
        return returningView;
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnFighterButton:
                spawnFighter(view);
                break;
            case R.id.levelUpFighterButton:
                levelUpFighterButton(view);
                break;
            default:
                //do nothing

        }
    }
    public void spawnFighter(View view){
        fighterOne = new FighterMake();
        fighterOne.spawnLV1FighterStr();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(fighterOne.firstName);

        textTest = (TextView) view.findViewById(R.id.lastNameID);
        textTest.setText(fighterOne.lastName);
        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(fighterOne.level));
        textTest = (TextView) view.findViewById(R.id.genderID);
        textTest.setText(fighterOne.gender);
        textTest = (TextView) view.findViewById(R.id.alignmentView);
        textTest.setText(fighterOne.alignment);
        textTest = (TextView) view.findViewById(R.id.sizeClassView);
        textTest.setText(fighterOne.sizeClass);
        textTest = (TextView) view.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(fighterOne.sizeFeet) + "' "  + Integer.toString(fighterOne.sizeInches) + "''");
        textTest = (TextView) view.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(fighterOne.weight) + "lbs");
        textTest = (TextView) view.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(fighterOne.age));
        textTest = (TextView) view.findViewById(R.id.hairView);
        textTest.setText("hair: " + fighterOne.hair);
        textTest = (TextView) view.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +fighterOne.eyes);
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(fighterOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(fighterOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(fighterOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(fighterOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(fighterOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(fighterOne.touchAC));
        if(fighterOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[0]));
        }
        if(fighterOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[1]));
        }
        if(fighterOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[2]));
        }
        if(fighterOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[3]));
        }
        if(fighterOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[0]));
        }
        if(fighterOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[1]));
        }
        if(fighterOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[2]));
        }
        if(fighterOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(fighterOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(fighterOne.hitDie1D));
        textTest = (TextView) view.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(fighterOne.ranksPerLevelBase));
        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(fighterOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.weaponProfString);
        textTest.setText(fighterOne.weaponProf);
        textTest = (TextView) view.findViewById(R.id.armProfString);
        textTest.setText(fighterOne.armorProf);
        textTest = (TextView) view.findViewById(R.id.raceView);
        textTest.setText(fighterOne.race);
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(fighterOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.specialSkills);
        textTest.setText(fighterOne.SpecialSkills[0]);
        textTest.append(", " + fighterOne.SpecialSkills[1]);

        //incomplete

    }
    public void levelUpFighterButton(View view){

        fighterOne.levelUpFighter();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(fighterOne.firstName);


        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(fighterOne.level));
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(fighterOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(fighterOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(fighterOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(fighterOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(fighterOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(fighterOne.touchAC));
        if(fighterOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[0]));
        }
        if(fighterOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[1]));
        }
        if(fighterOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[2]));
        }
        if(fighterOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[3]));
        }
        if(fighterOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[0]));
        }
        if(fighterOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[1]));
        }
        if(fighterOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[2]));
        }
        if(fighterOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(fighterOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(fighterOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(fighterOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.specialSkills);


        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(fighterOne.SpecialSkills[c] + ", ");
            c++;
        }


    }
}