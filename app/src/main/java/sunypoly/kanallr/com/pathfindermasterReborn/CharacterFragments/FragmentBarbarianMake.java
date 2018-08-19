package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.BarbarianMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentBarbarianMake extends Fragment implements View.OnClickListener {
    BarbarianMake barbOne;
    public void spawnBarbarian(View view){
        View thisView = getView();
        barbOne = new BarbarianMake();
        barbOne.spawnLV1Barbarian();
        TextView textTest = (TextView) thisView.findViewById(R.id.firstNameID);
        textTest.setText(barbOne.firstName);

        textTest = (TextView) thisView.findViewById(R.id.lastNameID);
        textTest.setText(barbOne.lastName);
        textTest = (TextView) thisView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(barbOne.level));
        textTest = (TextView) thisView.findViewById(R.id.genderID);
        textTest.setText(barbOne.gender);
        textTest = (TextView) thisView.findViewById(R.id.alignmentView);
        textTest.setText(barbOne.alignment);
        textTest = (TextView) thisView.findViewById(R.id.sizeClassView);
        textTest.setText(barbOne.sizeClass);
        textTest = (TextView) thisView.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(barbOne.sizeFeet) + "' "  + Integer.toString(barbOne.sizeInches) + "''");
        textTest = (TextView) thisView.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(barbOne.weight) + "lbs");
        textTest = (TextView) thisView.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(barbOne.age));
        textTest = (TextView) thisView.findViewById(R.id.hairView);
        textTest.setText("hair: " + barbOne.hair);
        textTest = (TextView) thisView.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +barbOne.eyes);
        textTest = (TextView) thisView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[1]));
        textTest = (TextView) thisView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[2]));
        textTest = (TextView) thisView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[5]));
        textTest = (TextView) thisView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[1]));
        textTest = (TextView) thisView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[2]));
        textTest = (TextView) thisView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(barbOne.fortSave));
        textTest = (TextView) thisView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(barbOne.refSave));
        textTest = (TextView) thisView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(barbOne.willSave));
        textTest = (TextView) thisView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseWillSave));
        textTest = (TextView) thisView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseRefSave));
        textTest = (TextView) thisView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseFortSave));
        textTest = (TextView) thisView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(barbOne.AC));
        textTest = (TextView) thisView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(barbOne.FlatFootAC));
        textTest = (TextView) thisView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(barbOne.touchAC));
        if(barbOne.AttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(barbOne.AttackBonus[0]));
        }
        if(barbOne.AttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(barbOne.AttackBonus[1]));
        }
        if(barbOne.AttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(barbOne.AttackBonus[2]));
        }
        if(barbOne.AttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(barbOne.AttackBonus[3]));
        }
        if(barbOne.baseAttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[0]));
        }
        if(barbOne.baseAttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[1]));
        }
        if(barbOne.baseAttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[2]));
        }
        if(barbOne.baseAttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[3]));
        }
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(barbOne.Initiative));
        textTest = (TextView) thisView.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(barbOne.hitDie1D));
        textTest = (TextView) thisView.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(barbOne.ranksPerLevelBase));
        textTest = (TextView) thisView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(barbOne.travelSpeed));
        textTest = (TextView) thisView.findViewById(R.id.weaponProfString);
        textTest.setText(barbOne.weaponProf);
        textTest = (TextView) thisView.findViewById(R.id.armProfString);
        textTest.setText(barbOne.armorProf);
        textTest = (TextView) thisView.findViewById(R.id.raceView);
        textTest.setText(barbOne.race);
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(barbOne.Initiative));
        textTest = (TextView) thisView.findViewById(R.id.specialSkills);
        textTest.setText(barbOne.SpecialSkills[0]);
        textTest.append(", " + barbOne.SpecialSkills[1]);
        // firstName = barbOne.firstName;
        //incomplete

    }
    public void levelUpBarbButton(View view){

        barbOne.levelUpBarb();
        View tempView = getView();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        //textTest.setText(barbOne.firstName);
        textTest = (TextView) tempView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(barbOne.level));
        textTest = (TextView) tempView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[0]));
        textTest = (TextView) tempView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[1]));
        textTest = (TextView) tempView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[2]));
        textTest = (TextView) tempView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[3]));
        textTest = (TextView) tempView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[4]));
        textTest = (TextView) tempView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[5]));
        textTest = (TextView) tempView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[0]));
        textTest = (TextView) tempView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[1]));
        textTest = (TextView) tempView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[2]));
        textTest = (TextView) tempView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[3]));
        textTest = (TextView) tempView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[4]));
        textTest = (TextView) tempView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) tempView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) tempView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(barbOne.fortSave));
        textTest = (TextView) tempView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(barbOne.refSave));
        textTest = (TextView) tempView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(barbOne.willSave));
        textTest = (TextView) tempView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseWillSave));
        textTest = (TextView) tempView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseRefSave));
        textTest = (TextView) tempView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseFortSave));
        textTest = (TextView) tempView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(barbOne.AC));
        textTest = (TextView) tempView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(barbOne.FlatFootAC));
        textTest = (TextView) tempView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(barbOne.touchAC));
        if(barbOne.AttackBonus[0] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(barbOne.AttackBonus[0]));
        }
        if(barbOne.AttackBonus[1] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(barbOne.AttackBonus[1]));
        }
        if(barbOne.AttackBonus[2] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(barbOne.AttackBonus[2]));
        }
        if(barbOne.AttackBonus[3] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(barbOne.AttackBonus[3]));
        }
        if(barbOne.baseAttackBonus[0] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[0]));
        }
        if(barbOne.baseAttackBonus[1] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[1]));
        }
        if(barbOne.baseAttackBonus[2] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[2]));
        }
        if(barbOne.baseAttackBonus[3] != -99){
            textTest = (TextView) tempView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[3]));
        }
        textTest = (TextView) tempView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(barbOne.Initiative));

        textTest = (TextView) tempView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(barbOne.travelSpeed));
        textTest = (TextView) tempView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(barbOne.Initiative));

        textTest = (TextView) tempView.findViewById(R.id.specialSkills);


        textTest.setText("");
       int c = 0;
        while(c < 100){
            textTest.append(barbOne.SpecialSkills[c] + ", ");
            c++;
        }
        // firstName = barbOne.firstName;
        //incomplete

    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        View returningView =  inflater.inflate(
                R.layout.barbarian_make, container, false);
        Button makeCharacter = (Button) returningView.findViewById(R.id.spawnBarbButton);
        Button levelUpButton = (Button) returningView.findViewById(R.id.levelUpButton);
        makeCharacter.setOnClickListener(this);
        levelUpButton.setOnClickListener(this);
        return returningView;
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnBarbButton:
                spawnBarbarian(view);
                break;
            case R.id.levelUpButton:
                levelUpBarbButton(view);
                break;
            default:
                //do nothing

        }
    }


}