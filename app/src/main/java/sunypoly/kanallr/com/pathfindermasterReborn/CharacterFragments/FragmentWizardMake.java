package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.WizardMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentWizardMake extends Fragment implements View.OnClickListener {
    WizardMake wizardOne;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View returningView = inflater.inflate(
                R.layout.wizard_make, container, false);
        //Inflate the layout for this fragment

        Button spawnWizardButton = (Button) returningView.findViewById(R.id.spawnWizardButton);
        Button levelUpWizardButton = (Button) returningView.findViewById(R.id.levelUpWizardButton);
        spawnWizardButton.setOnClickListener(this);
        levelUpWizardButton.setOnClickListener(this);
        return returningView;
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnWizardButton:
                spawnWizard(view);
                break;
            case R.id.levelUpWizardButton:
                levelUpWizardButton(view);
                break;
            default:
                //do nothing
        }
    }
    public void spawnWizard(View view){
        wizardOne = new WizardMake();
        wizardOne.spawnLV1Wiz();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(wizardOne.firstName);

        textTest = (TextView) view.findViewById(R.id.lastNameID);
        textTest.setText(wizardOne.lastName);
        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(wizardOne.level));
        textTest = (TextView) view.findViewById(R.id.genderID);
        textTest.setText(wizardOne.gender);
        textTest = (TextView) view.findViewById(R.id.alignmentView);
        textTest.setText(wizardOne.alignment);
        textTest = (TextView) view.findViewById(R.id.sizeClassView);
        textTest.setText(wizardOne.sizeClass);
        textTest = (TextView) view.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(wizardOne.sizeFeet) + "' "  + Integer.toString(wizardOne.sizeInches) + "''");
        textTest = (TextView) view.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(wizardOne.weight) + "lbs");
        textTest = (TextView) view.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(wizardOne.age));
        textTest = (TextView) view.findViewById(R.id.hairView);
        textTest.setText("hair: " + wizardOne.hair);
        textTest = (TextView) view.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +wizardOne.eyes);
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(wizardOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(wizardOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(wizardOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(wizardOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(wizardOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(wizardOne.touchAC));
        if(wizardOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[0]));
        }
        if(wizardOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[1]));
        }
        if(wizardOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[2]));
        }
        if(wizardOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[3]));
        }
        if(wizardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[0]));
        }
        if(wizardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[1]));
        }
        if(wizardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[2]));
        }
        if(wizardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(wizardOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(wizardOne.hitDie1D));
        textTest = (TextView) view.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(wizardOne.ranksPerLevelBase));
        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(wizardOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.weaponProfString);
        textTest.setText(wizardOne.weaponProf);
        textTest = (TextView) view.findViewById(R.id.armProfString);
        textTest.setText(wizardOne.armorProf);
        textTest = (TextView) view.findViewById(R.id.raceView);
        textTest.setText(wizardOne.race);
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(wizardOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.specialSkills);
        textTest.setText(wizardOne.SpecialSkills[0]);
        textTest.append(", " + wizardOne.SpecialSkills[1]);
        textTest = (TextView) view.findViewById(R.id.SpellsAt0);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[0]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt1);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[1]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt2);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[2]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt3);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[3]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt4);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[4]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt5);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[5]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt6);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[6]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt7);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[7]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt8);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[8]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt9);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[9]));
        //incomplete*/

    }
    public void levelUpWizardButton(View view){

        wizardOne.levelUpWiz();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(wizardOne.firstName);


        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(wizardOne.level));
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(wizardOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(wizardOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(wizardOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(wizardOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(wizardOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(wizardOne.touchAC));
        if(wizardOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[0]));
        }
        if(wizardOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[1]));
        }
        if(wizardOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[2]));
        }
        if(wizardOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[3]));
        }
        if(wizardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[0]));
        }
        if(wizardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[1]));
        }
        if(wizardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[2]));
        }
        if(wizardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(wizardOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(wizardOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(wizardOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.specialSkills);
        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(wizardOne.SpecialSkills[c] + ", ");
            c++;
        }
        textTest = (TextView) view.findViewById(R.id.SpellsAt0);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[0]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt1);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[1]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt2);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[2]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt3);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[3]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt4);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[4]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt5);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[5]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt6);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[6]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt7);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[7]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt8);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[8]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt9);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[9]));

    }
}