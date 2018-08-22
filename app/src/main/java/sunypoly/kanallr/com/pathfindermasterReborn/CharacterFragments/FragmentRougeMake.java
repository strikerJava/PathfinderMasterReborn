package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.RougeMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentRougeMake extends Fragment implements View.OnClickListener {
    RougeMake rougeOne;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View returningView = inflater.inflate(
                R.layout.rouge_make, container, false);
        //Inflate the layout for this fragment

        Button spawnRougeButton = (Button) returningView.findViewById(R.id.spawnRougeButton);
        Button levelUpRougeButton = (Button) returningView.findViewById(R.id.levelUpRougeButton);
        spawnRougeButton.setOnClickListener(this);
        levelUpRougeButton.setOnClickListener(this);
        return returningView;
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnRangerButton:
                spawnRouge(view);
                break;
            case R.id.levelUpRangerButton:
                levelUpRougeButton(view);
                break;
            default:
                //do nothing
        }
    }
    public void spawnRouge(View view){
        rougeOne = new RougeMake();
        rougeOne.spawnLV1Rouge();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(rougeOne.firstName);

        textTest = (TextView) view.findViewById(R.id.lastNameID);
        textTest.setText(rougeOne.lastName);
        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rougeOne.level));
        textTest = (TextView) view.findViewById(R.id.genderID);
        textTest.setText(rougeOne.gender);
        textTest = (TextView) view.findViewById(R.id.alignmentView);
        textTest.setText(rougeOne.alignment);
        textTest = (TextView) view.findViewById(R.id.sizeClassView);
        textTest.setText(rougeOne.sizeClass);
        textTest = (TextView) view.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(rougeOne.sizeFeet) + "' "  + Integer.toString(rougeOne.sizeInches) + "''");
        textTest = (TextView) view.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(rougeOne.weight) + "lbs");
        textTest = (TextView) view.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(rougeOne.age));
        textTest = (TextView) view.findViewById(R.id.hairView);
        textTest.setText("hair: " + rougeOne.hair);
        textTest = (TextView) view.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +rougeOne.eyes);
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rougeOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rougeOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rougeOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rougeOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rougeOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rougeOne.touchAC));
        if(rougeOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[0]));
        }
        if(rougeOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[1]));
        }
        if(rougeOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[2]));
        }
        if(rougeOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[3]));
        }
        if(rougeOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[0]));
        }
        if(rougeOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[1]));
        }
        if(rougeOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[2]));
        }
        if(rougeOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rougeOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(rougeOne.hitDie1D));
        textTest = (TextView) view.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(rougeOne.ranksPerLevelBase));
        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rougeOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.weaponProfString);
        textTest.setText(rougeOne.weaponProf);
        textTest = (TextView) view.findViewById(R.id.armProfString);
        textTest.setText(rougeOne.armorProf);
        textTest = (TextView) view.findViewById(R.id.raceView);
        textTest.setText(rougeOne.race);
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rougeOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.specialSkills);
        textTest.setText(rougeOne.SpecialSkills[0]);
        textTest.append(", " + rougeOne.SpecialSkills[1]);

        //incomplete*/

    }
    public void levelUpRougeButton(View view){

        rougeOne.levelUpRouge();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(rougeOne.firstName);


        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rougeOne.level));
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rougeOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rougeOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rougeOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rougeOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rougeOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rougeOne.touchAC));
        if(rougeOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[0]));
        }
        if(rougeOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[1]));
        }
        if(rougeOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[2]));
        }
        if(rougeOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[3]));
        }
        if(rougeOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[0]));
        }
        if(rougeOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[1]));
        }
        if(rougeOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[2]));
        }
        if(rougeOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rougeOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rougeOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rougeOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.specialSkills);


        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(rougeOne.SpecialSkills[c] + ", ");
            c++;
        }


    }
}