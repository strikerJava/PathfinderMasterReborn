package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.PaladinMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentPaladinMake extends Fragment  implements View.OnClickListener{
    PaladinMake paladinOne;
    Button spawnPaladinButton;
    Button levelUpPaladinButton;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View returningView = inflater.inflate(
                R.layout.paladin_make, container, false);
        //Inflate the layout for this fragment

         spawnPaladinButton = (Button) returningView.findViewById(R.id.spawnPaladinButton);
         levelUpPaladinButton = (Button) returningView.findViewById(R.id.levelUpPaladinButton);
        spawnPaladinButton.setOnClickListener(this);
        levelUpPaladinButton.setOnClickListener(this);
        levelUpPaladinButton.setEnabled(false);
        return returningView;
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnPaladinButton:
                spawnPaladin();
                levelUpPaladinButton.setEnabled(true);
                break;
            case R.id.levelUpPaladinButton:
                levelUpPaladinButton();
                break;
            default:
                //do nothing
        }
    }
    public void spawnPaladin(){
        View currentView = getView();
        paladinOne = new PaladinMake();
        paladinOne.spawnLV1Paladin();
        TextView textTest = (TextView) currentView.findViewById(R.id.firstNameID);
        textTest.setText(paladinOne.firstName);

        textTest = (TextView) currentView.findViewById(R.id.lastNameID);
        textTest.setText(paladinOne.lastName);
        textTest = (TextView) currentView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(paladinOne.level));
        textTest = (TextView) currentView.findViewById(R.id.genderID);
        textTest.setText(paladinOne.gender);
        textTest = (TextView) currentView.findViewById(R.id.alignmentView);
        textTest.setText(paladinOne.alignment);
        textTest = (TextView) currentView.findViewById(R.id.sizeClassView);
        textTest.setText(paladinOne.sizeClass);
        textTest = (TextView) currentView.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(paladinOne.sizeFeet) + "' "  + Integer.toString(paladinOne.sizeInches) + "''");
        textTest = (TextView) currentView.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(paladinOne.weight) + "lbs");
        textTest = (TextView) currentView.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(paladinOne.age));
        textTest = (TextView) currentView.findViewById(R.id.hairView);
        textTest.setText("hair: " + paladinOne.hair);
        textTest = (TextView) currentView.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +paladinOne.eyes);
        textTest = (TextView) currentView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[1]));
        textTest = (TextView) currentView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[2]));
        textTest = (TextView) currentView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[5]));
        textTest = (TextView) currentView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[1]));
        textTest = (TextView) currentView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[2]));
        textTest = (TextView) currentView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(paladinOne.fortSave));
        textTest = (TextView) currentView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(paladinOne.refSave));
        textTest = (TextView) currentView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(paladinOne.willSave));
        textTest = (TextView) currentView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseWillSave));
        textTest = (TextView) currentView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseRefSave));
        textTest = (TextView) currentView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseFortSave));
        textTest = (TextView) currentView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(paladinOne.AC));
        textTest = (TextView) currentView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(paladinOne.FlatFootAC));
        textTest = (TextView) currentView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(paladinOne.touchAC));
        if(paladinOne.AttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[0]));
        }
        if(paladinOne.AttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[1]));
        }
        if(paladinOne.AttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[2]));
        }
        if(paladinOne.AttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[3]));
        }
        if(paladinOne.baseAttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[0]));
        }
        if(paladinOne.baseAttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[1]));
        }
        if(paladinOne.baseAttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[2]));
        }
        if(paladinOne.baseAttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[3]));
        }
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(paladinOne.Initiative));
        textTest = (TextView) currentView.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(paladinOne.hitDie1D));
        textTest = (TextView) currentView.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(paladinOne.ranksPerLevelBase));
        textTest = (TextView) currentView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(paladinOne.travelSpeed));
        textTest = (TextView) currentView.findViewById(R.id.weaponProfString);
        textTest.setText(paladinOne.weaponProf);
        textTest = (TextView) currentView.findViewById(R.id.armProfString);
        textTest.setText(paladinOne.armorProf);
        textTest = (TextView) currentView.findViewById(R.id.raceView);
        textTest.setText(paladinOne.race);
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(paladinOne.Initiative));
        textTest = (TextView) currentView.findViewById(R.id.specialSkills);
        textTest.setText(paladinOne.SpecialSkills[0]);
        textTest.append(", " + paladinOne.SpecialSkills[1]);

        textTest = (TextView) currentView.findViewById(R.id.SpellsAt0);
        textTest.setText("0");

        textTest = (TextView) currentView.findViewById(R.id.SpellsAt1);
        textTest.setText("0");


        textTest = (TextView) currentView.findViewById(R.id.SpellsAt2);
        textTest.setText("0");

        textTest = (TextView) currentView.findViewById(R.id.SpellsAt3);
        textTest.setText("0");


        textTest = (TextView) currentView.findViewById(R.id.SpellsAt4);
        textTest.setText("0");


        //incomplete*/

    }
    public void levelUpPaladinButton(){
        View currentView = getView();
        paladinOne.levelUpPaladin();
        TextView textTest = (TextView) currentView.findViewById(R.id.firstNameID);
        textTest.setText(paladinOne.firstName);


        textTest = (TextView) currentView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(paladinOne.level));
        textTest = (TextView) currentView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[1]));
        textTest = (TextView) currentView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[2]));
        textTest = (TextView) currentView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[5]));
        textTest = (TextView) currentView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[1]));
        textTest = (TextView) currentView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[2]));
        textTest = (TextView) currentView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(paladinOne.fortSave));
        textTest = (TextView) currentView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(paladinOne.refSave));
        textTest = (TextView) currentView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(paladinOne.willSave));
        textTest = (TextView) currentView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseWillSave));
        textTest = (TextView) currentView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseRefSave));
        textTest = (TextView) currentView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseFortSave));
        textTest = (TextView) currentView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(paladinOne.AC));
        textTest = (TextView) currentView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(paladinOne.FlatFootAC));
        textTest = (TextView) currentView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(paladinOne.touchAC));
        if(paladinOne.AttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[0]));
        }
        if(paladinOne.AttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[1]));
        }
        if(paladinOne.AttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[2]));
        }
        if(paladinOne.AttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[3]));
        }
        if(paladinOne.baseAttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[0]));
        }
        if(paladinOne.baseAttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[1]));
        }
        if(paladinOne.baseAttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[2]));
        }
        if(paladinOne.baseAttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[3]));
        }
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(paladinOne.Initiative));

        textTest = (TextView) currentView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(paladinOne.travelSpeed));
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(paladinOne.Initiative));

        textTest = (TextView) currentView.findViewById(R.id.specialSkills);


        textTest.setText("");
       int c = 0;
        while(c < 100){
            textTest.append(paladinOne.SpecialSkills[c] + ", ");
            c++;
        }

        if(paladinOne.totalPaladinSpells[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.SpellsAt0);
            textTest.setText("");
        }
        if(paladinOne.totalPaladinSpells[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.SpellsAt1);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[1]));

        }
        if(paladinOne.totalPaladinSpells[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.SpellsAt2);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[2]));
        }
        if(paladinOne.totalPaladinSpells[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.SpellsAt3);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[3]));
        }
        if(paladinOne.totalPaladinSpells[4] != -99){
            textTest = (TextView) currentView.findViewById(R.id.SpellsAt4);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[4]));
        }

    }
}