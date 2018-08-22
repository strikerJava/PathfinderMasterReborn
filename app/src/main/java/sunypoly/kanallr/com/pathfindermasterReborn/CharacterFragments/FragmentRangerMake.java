package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.RangerMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentRangerMake extends Fragment implements View.OnClickListener {
    RangerMake rangerOne;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View returningView = inflater.inflate(
                R.layout.ranger_make, container, false);
        //Inflate the layout for this fragment

        Button spawnRangerButton = (Button) returningView.findViewById(R.id.spawnRangerButton);
        Button levelUpRangerButton = (Button) returningView.findViewById(R.id.levelUpRangerButton);
        spawnRangerButton.setOnClickListener(this);
        levelUpRangerButton.setOnClickListener(this);
        return returningView;
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnRangerButton:
                spawnRanger(view);
                break;
            case R.id.levelUpRangerButton:
                levelUpRangerButton(view);
                break;
            default:
                //do nothing
        }
    }
    public void spawnRanger(View view){
        rangerOne = new RangerMake();
        rangerOne.spawnLV1Ranger();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(rangerOne.firstName);

        textTest = (TextView) view.findViewById(R.id.lastNameID);
        textTest.setText(rangerOne.lastName);
        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rangerOne.level));
        textTest = (TextView) view.findViewById(R.id.genderID);
        textTest.setText(rangerOne.gender);
        textTest = (TextView) view.findViewById(R.id.alignmentView);
        textTest.setText(rangerOne.alignment);
        textTest = (TextView) view.findViewById(R.id.sizeClassView);
        textTest.setText(rangerOne.sizeClass);
        textTest = (TextView) view.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(rangerOne.sizeFeet) + "' "  + Integer.toString(rangerOne.sizeInches) + "''");
        textTest = (TextView) view.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(rangerOne.weight) + "lbs");
        textTest = (TextView) view.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(rangerOne.age));
        textTest = (TextView) view.findViewById(R.id.hairView);
        textTest.setText("hair: " + rangerOne.hair);
        textTest = (TextView) view.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +rangerOne.eyes);
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rangerOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rangerOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rangerOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rangerOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rangerOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rangerOne.touchAC));
        if(rangerOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[0]));
        }
        if(rangerOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[1]));
        }
        if(rangerOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[2]));
        }
        if(rangerOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[3]));
        }
        if(rangerOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[0]));
        }
        if(rangerOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[1]));
        }
        if(rangerOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[2]));
        }
        if(rangerOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rangerOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(rangerOne.hitDie1D));
        textTest = (TextView) view.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(rangerOne.ranksPerLevelBase));
        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rangerOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.weaponProfString);
        textTest.setText(rangerOne.weaponProf);
        textTest = (TextView) view.findViewById(R.id.armProfString);
        textTest.setText(rangerOne.armorProf);
        textTest = (TextView) view.findViewById(R.id.raceView);
        textTest.setText(rangerOne.race);
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rangerOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.specialSkills);
        textTest.setText(rangerOne.SpecialSkills[0]);
        textTest.append(", " + rangerOne.SpecialSkills[1]);
        textTest = (TextView) view.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) view.findViewById(R.id.SpellsAt1);
        textTest.setText("-");
        textTest = (TextView) view.findViewById(R.id.SpellsAt2);
        textTest.setText("-");
        textTest = (TextView) view.findViewById(R.id.SpellsAt3);
        textTest.setText("-");
        textTest = (TextView) view.findViewById(R.id.SpellsAt4);
        textTest.setText("-");
        //incomplete*/

    }
    public void levelUpRangerButton(View view){

        rangerOne.levelUpRanger();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(rangerOne.firstName);


        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rangerOne.level));
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rangerOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rangerOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rangerOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rangerOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rangerOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rangerOne.touchAC));
        if(rangerOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[0]));
        }
        if(rangerOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[1]));
        }
        if(rangerOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[2]));
        }
        if(rangerOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[3]));
        }
        if(rangerOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[0]));
        }
        if(rangerOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[1]));
        }
        if(rangerOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[2]));
        }
        if(rangerOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rangerOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rangerOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rangerOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.specialSkills);


        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(rangerOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) view.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[1]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[2]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[3]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[4]));

    }
}