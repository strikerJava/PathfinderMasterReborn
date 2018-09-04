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
    Button makeCleric;
    Button levelUpCleric;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View returningView = inflater.inflate(
                R.layout.cleric_make, container, false);
         makeCleric = (Button) returningView.findViewById(R.id.ClericSpwn);
         levelUpCleric = (Button) returningView.findViewById(R.id.ClericLevelUp);
        makeCleric.setOnClickListener(this);
        levelUpCleric.setOnClickListener(this);
        levelUpCleric.setEnabled(false);
        return returningView;
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.ClericSpwn:
                spawnCleric();
                levelUpCleric.setEnabled(true);
                break;
            case R.id.ClericLevelUp:
                levelUpCleric();
                break;
            default:
                //do nothing
        }
    }

    public void spawnCleric(){
        View thisView = getView();
        clericOne = new ClericMake();
        clericOne.spawnLV1Cleric();
        TextView textTest = (TextView) thisView.findViewById(R.id.firstNameID);
        textTest.setText(clericOne.firstName);
        textTest = (TextView) thisView.findViewById(R.id.lastNameID);
        textTest.setText(clericOne.lastName);
        textTest = (TextView) thisView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(clericOne.level));
        textTest = (TextView) thisView.findViewById(R.id.genderID);
        textTest.setText(clericOne.gender);
        textTest = (TextView) thisView.findViewById(R.id.alignmentView);
        textTest.setText(clericOne.alignment);
        textTest = (TextView) thisView.findViewById(R.id.sizeClassView);
        textTest.setText(clericOne.sizeClass);
        textTest = (TextView) thisView.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(clericOne.sizeFeet) + "' "  + Integer.toString(clericOne.sizeInches) + "''");
        textTest = (TextView) thisView.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(clericOne.weight) + "lbs");
        textTest = (TextView) thisView.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(clericOne.age));
        textTest = (TextView) thisView.findViewById(R.id.hairView);
        textTest.setText("hair: " + clericOne.hair);
        textTest = (TextView) thisView.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +clericOne.eyes);
        textTest = (TextView) thisView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[1]));
        textTest = (TextView) thisView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[2]));
        textTest = (TextView) thisView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[5]));
        textTest = (TextView) thisView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[1]));
        textTest = (TextView) thisView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[2]));
        textTest = (TextView) thisView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(clericOne.fortSave));
        textTest = (TextView) thisView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(clericOne.refSave));
        textTest = (TextView) thisView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(clericOne.willSave));
        textTest = (TextView) thisView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseWillSave));
        textTest = (TextView) thisView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseRefSave));
        textTest = (TextView) thisView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseFortSave));
        textTest = (TextView) thisView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(clericOne.AC));
        textTest = (TextView) thisView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(clericOne.FlatFootAC));
        textTest = (TextView) thisView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(clericOne.touchAC));
        if(clericOne.AttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(clericOne.AttackBonus[0]));
        }
        if(clericOne.AttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(clericOne.AttackBonus[1]));
        }
        if(clericOne.AttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(clericOne.AttackBonus[2]));
        }
        if(clericOne.AttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(clericOne.AttackBonus[3]));
        }
        if(clericOne.baseAttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[0]));
        }
        if(clericOne.baseAttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[1]));
        }
        if(clericOne.baseAttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[2]));
        }
        if(clericOne.baseAttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[3]));
        }
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(clericOne.Initiative));
        textTest = (TextView) thisView.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(clericOne.hitDie1D));
        textTest = (TextView) thisView.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(clericOne.ranksPerLevelBase));
        textTest = (TextView) thisView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(clericOne.travelSpeed));
        textTest = (TextView) thisView.findViewById(R.id.weaponProfString);
        textTest.setText(clericOne.weaponProf);
        textTest = (TextView) thisView.findViewById(R.id.armProfString);
        textTest.setText(clericOne.armorProf);
        textTest = (TextView) thisView.findViewById(R.id.raceView);
        textTest.setText(clericOne.race);
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(clericOne.Initiative));
        textTest = (TextView) thisView.findViewById(R.id.specialSkills);
        textTest.setText(clericOne.SpecialSkills[0]);
        textTest.append(", " + clericOne.SpecialSkills[1]);

        textTest = (TextView) thisView.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[0]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[1]) + " + " + Integer.toString(clericOne.domainSpell[1]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[2]) + " + " + Integer.toString(clericOne.domainSpell[2]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[3]) + " + " + Integer.toString(clericOne.domainSpell[3]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[4]) + " + " + Integer.toString(clericOne.domainSpell[4]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[5]) + " + " + Integer.toString(clericOne.domainSpell[5]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[6]) + " + " + Integer.toString(clericOne.domainSpell[6]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[7]) + " + " + Integer.toString(clericOne.domainSpell[7]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[8]) + " + " + Integer.toString(clericOne.domainSpell[8]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[9]) + " + " + Integer.toString(clericOne.domainSpell[9]));
        //incomplete

    }
    public void levelUpCleric(){
        View currentView = getView();
        clericOne.levelUpCleric();
        TextView textTest = (TextView) currentView.findViewById(R.id.firstNameID);
        textTest.setText(clericOne.firstName);


        textTest = (TextView) currentView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(clericOne.level));
        textTest = (TextView) currentView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[1]));
        textTest = (TextView) currentView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[2]));
        textTest = (TextView) currentView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[5]));
        textTest = (TextView) currentView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[0]));
        textTest = (TextView) currentView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[1]));
        textTest = (TextView) currentView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[2]));
        textTest = (TextView) currentView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[3]));
        textTest = (TextView) currentView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[4]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) currentView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(clericOne.fortSave));
        textTest = (TextView) currentView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(clericOne.refSave));
        textTest = (TextView) currentView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(clericOne.willSave));
        textTest = (TextView) currentView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseWillSave));
        textTest = (TextView) currentView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseRefSave));
        textTest = (TextView) currentView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseFortSave));
        textTest = (TextView) currentView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(clericOne.AC));
        textTest = (TextView) currentView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(clericOne.FlatFootAC));
        textTest = (TextView) currentView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(clericOne.touchAC));
        if(clericOne.AttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(clericOne.AttackBonus[0]));
        }
        if(clericOne.AttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(clericOne.AttackBonus[1]));
        }
        if(clericOne.AttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(clericOne.AttackBonus[2]));
        }
        if(clericOne.AttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(clericOne.AttackBonus[3]));
        }
        if(clericOne.baseAttackBonus[0] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[0]));
        }
        if(clericOne.baseAttackBonus[1] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[1]));
        }
        if(clericOne.baseAttackBonus[2] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[2]));
        }
        if(clericOne.baseAttackBonus[3] != -99){
            textTest = (TextView) currentView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[3]));
        }
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(clericOne.Initiative));

        textTest = (TextView) currentView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(clericOne.travelSpeed));
        textTest = (TextView) currentView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(clericOne.Initiative));

        textTest = (TextView) currentView.findViewById(R.id.specialSkills);


        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(clericOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) currentView.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[0]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[1]) + " + " + Integer.toString(clericOne.domainSpell[1]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[2]) + " + " + Integer.toString(clericOne.domainSpell[2]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[3]) + " + " + Integer.toString(clericOne.domainSpell[3]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[4]) + " + " + Integer.toString(clericOne.domainSpell[4]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[5]) + " + " + Integer.toString(clericOne.domainSpell[5]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[6]) + " + " + Integer.toString(clericOne.domainSpell[6]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[7]) + " + " + Integer.toString(clericOne.domainSpell[7]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[8]) + " + " + Integer.toString(clericOne.domainSpell[8]));
        textTest = (TextView) currentView.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[9]) + " + " + Integer.toString(clericOne.domainSpell[9]));
    }
}