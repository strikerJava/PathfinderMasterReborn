package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.ClericMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentClericMake extends Fragment implements View.OnClickListener {
    ClericMake clericOne;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View returningView = inflater.inflate(
                R.layout.cleric_make, container, false);
        Button makeCleric = (Button) returningView.findViewById(R.id.ClericSpwn);
        Button levelUpCleric = (Button) returningView.findViewById(R.id.ClericLevelUp);
        makeCleric.setOnClickListener(this);
        levelUpCleric.setOnClickListener(this);
        return returningView;
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.ClericSpwn:
                spawnCleric(view);
                break;
            case R.id.ClericLevelUp:
                levelUpCleric(view);
                break;
            default:
                //do nothing
        }
    }

    public void spawnCleric(View view){

        clericOne = new ClericMake();
        clericOne.spawnLV1Cleric();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(clericOne.firstName);
        textTest = (TextView) view.findViewById(R.id.lastNameID);
        textTest.setText(clericOne.lastName);
        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(clericOne.level));
        textTest = (TextView) view.findViewById(R.id.genderID);
        textTest.setText(clericOne.gender);
        textTest = (TextView) view.findViewById(R.id.alignmentView);
        textTest.setText(clericOne.alignment);
        textTest = (TextView) view.findViewById(R.id.sizeClassView);
        textTest.setText(clericOne.sizeClass);
        textTest = (TextView) view.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(clericOne.sizeFeet) + "' "  + Integer.toString(clericOne.sizeInches) + "''");
        textTest = (TextView) view.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(clericOne.weight) + "lbs");
        textTest = (TextView) view.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(clericOne.age));
        textTest = (TextView) view.findViewById(R.id.hairView);
        textTest.setText("hair: " + clericOne.hair);
        textTest = (TextView) view.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +clericOne.eyes);
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(clericOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(clericOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(clericOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(clericOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(clericOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(clericOne.touchAC));
        if(clericOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(clericOne.AttackBonus[0]));
        }
        if(clericOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(clericOne.AttackBonus[1]));
        }
        if(clericOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(clericOne.AttackBonus[2]));
        }
        if(clericOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(clericOne.AttackBonus[3]));
        }
        if(clericOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[0]));
        }
        if(clericOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[1]));
        }
        if(clericOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[2]));
        }
        if(clericOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(clericOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(clericOne.hitDie1D));
        textTest = (TextView) view.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(clericOne.ranksPerLevelBase));
        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(clericOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.weaponProfString);
        textTest.setText(clericOne.weaponProf);
        textTest = (TextView) view.findViewById(R.id.armProfString);
        textTest.setText(clericOne.armorProf);
        textTest = (TextView) view.findViewById(R.id.raceView);
        textTest.setText(clericOne.race);
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(clericOne.Initiative));
        textTest = (TextView) view.findViewById(R.id.specialSkills);
        textTest.setText(clericOne.SpecialSkills[0]);
        textTest.append(", " + clericOne.SpecialSkills[1]);

        textTest = (TextView) view.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[0]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[1]) + " + " + Integer.toString(clericOne.domainSpell[1]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[2]) + " + " + Integer.toString(clericOne.domainSpell[2]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[3]) + " + " + Integer.toString(clericOne.domainSpell[3]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[4]) + " + " + Integer.toString(clericOne.domainSpell[4]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[5]) + " + " + Integer.toString(clericOne.domainSpell[5]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[6]) + " + " + Integer.toString(clericOne.domainSpell[6]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[7]) + " + " + Integer.toString(clericOne.domainSpell[7]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[8]) + " + " + Integer.toString(clericOne.domainSpell[8]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[9]) + " + " + Integer.toString(clericOne.domainSpell[9]));
        //incomplete

    }
    public void levelUpCleric(View view){

        clericOne.levelUpCleric();
        TextView textTest = (TextView) view.findViewById(R.id.firstNameID);
        textTest.setText(clericOne.firstName);


        textTest = (TextView) view.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(clericOne.level));
        textTest = (TextView) view.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[0]));
        textTest = (TextView) view.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[1]));
        textTest = (TextView) view.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[2]));
        textTest = (TextView) view.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[3]));
        textTest = (TextView) view.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[4]));
        textTest = (TextView) view.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[5]));
        textTest = (TextView) view.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[0]));
        textTest = (TextView) view.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[1]));
        textTest = (TextView) view.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[2]));
        textTest = (TextView) view.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[3]));
        textTest = (TextView) view.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[4]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) view.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(clericOne.fortSave));
        textTest = (TextView) view.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(clericOne.refSave));
        textTest = (TextView) view.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(clericOne.willSave));
        textTest = (TextView) view.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseWillSave));
        textTest = (TextView) view.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseRefSave));
        textTest = (TextView) view.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseFortSave));
        textTest = (TextView) view.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(clericOne.AC));
        textTest = (TextView) view.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(clericOne.FlatFootAC));
        textTest = (TextView) view.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(clericOne.touchAC));
        if(clericOne.AttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(clericOne.AttackBonus[0]));
        }
        if(clericOne.AttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(clericOne.AttackBonus[1]));
        }
        if(clericOne.AttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(clericOne.AttackBonus[2]));
        }
        if(clericOne.AttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(clericOne.AttackBonus[3]));
        }
        if(clericOne.baseAttackBonus[0] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[0]));
        }
        if(clericOne.baseAttackBonus[1] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[1]));
        }
        if(clericOne.baseAttackBonus[2] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[2]));
        }
        if(clericOne.baseAttackBonus[3] != -99){
            textTest = (TextView) view.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[3]));
        }
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(clericOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(clericOne.travelSpeed));
        textTest = (TextView) view.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(clericOne.Initiative));

        textTest = (TextView) view.findViewById(R.id.specialSkills);


        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(clericOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) view.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[0]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[1]) + " + " + Integer.toString(clericOne.domainSpell[1]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[2]) + " + " + Integer.toString(clericOne.domainSpell[2]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[3]) + " + " + Integer.toString(clericOne.domainSpell[3]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[4]) + " + " + Integer.toString(clericOne.domainSpell[4]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[5]) + " + " + Integer.toString(clericOne.domainSpell[5]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[6]) + " + " + Integer.toString(clericOne.domainSpell[6]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[7]) + " + " + Integer.toString(clericOne.domainSpell[7]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[8]) + " + " + Integer.toString(clericOne.domainSpell[8]));
        textTest = (TextView) view.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[9]) + " + " + Integer.toString(clericOne.domainSpell[9]));
    }
}