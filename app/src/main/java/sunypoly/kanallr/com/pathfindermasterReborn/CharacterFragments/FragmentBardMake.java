package sunypoly.kanallr.com.pathfindermasterReborn.CharacterFragments;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sunypoly.kanallr.com.pathfindermasterReborn.PCMakerLogic.BardMake;
import sunypoly.kanallr.com.pathfindermasterReborn.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentBardMake extends Fragment implements View.OnClickListener {
    BardMake bardOne;
    Button spawnButton;
    Button levelUpButton;
    public void spawnBard(View view){
        View thisView = getView();
        bardOne = new BardMake();
        bardOne.spawnLV1Bard();
        TextView textTest = (TextView) thisView.findViewById(R.id.firstNameID);
        textTest.setText(bardOne.firstName);

        textTest = (TextView) thisView.findViewById(R.id.lastNameID);
        textTest.setText(bardOne.lastName);
        textTest = (TextView) thisView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(bardOne.level));
        textTest = (TextView) thisView.findViewById(R.id.genderID);
        textTest.setText(bardOne.gender);
        textTest = (TextView) thisView.findViewById(R.id.alignmentView);
        textTest.setText(bardOne.alignment);
        textTest = (TextView) thisView.findViewById(R.id.sizeClassView);
        textTest.setText(bardOne.sizeClass);
        textTest = (TextView) thisView.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(bardOne.sizeFeet) + "' "  + Integer.toString(bardOne.sizeInches) + "''");
        textTest = (TextView) thisView.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(bardOne.weight) + "lbs");
        textTest = (TextView) thisView.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(bardOne.age));
        textTest = (TextView) thisView.findViewById(R.id.hairView);
        textTest.setText("hair: " + bardOne.hair);
        textTest = (TextView) thisView.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +bardOne.eyes);
        textTest = (TextView) thisView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[1]));
        textTest = (TextView) thisView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[2]));
        textTest = (TextView) thisView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[5]));
        textTest = (TextView) thisView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[1]));
        textTest = (TextView) thisView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[2]));
        textTest = (TextView) thisView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(bardOne.fortSave));
        textTest = (TextView) thisView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(bardOne.refSave));
        textTest = (TextView) thisView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(bardOne.willSave));
        textTest = (TextView) thisView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseWillSave));
        textTest = (TextView) thisView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseRefSave));
        textTest = (TextView) thisView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseFortSave));
        textTest = (TextView) thisView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(bardOne.AC));
        textTest = (TextView) thisView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(bardOne.FlatFootAC));
        textTest = (TextView) thisView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(bardOne.touchAC));
        if(bardOne.AttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(bardOne.AttackBonus[0]));
        }
        if(bardOne.AttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(bardOne.AttackBonus[1]));
        }
        if(bardOne.AttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(bardOne.AttackBonus[2]));
        }
        if(bardOne.AttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(bardOne.AttackBonus[3]));
        }
        if(bardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[0]));
        }
        if(bardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[1]));
        }
        if(bardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[2]));
        }
        if(bardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(bardOne.Initiative));
        textTest = (TextView) thisView.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(bardOne.hitDie1D));
        textTest = (TextView) thisView.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(bardOne.ranksPerLevelBase));
        textTest = (TextView) thisView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(bardOne.travelSpeed));
        textTest = (TextView) thisView.findViewById(R.id.weaponProfString);
        textTest.setText(bardOne.weaponProf);
        textTest = (TextView) thisView.findViewById(R.id.armProfString);
        textTest.setText(bardOne.armorProf);
        textTest = (TextView) thisView.findViewById(R.id.raceView);
        textTest.setText(bardOne.race);
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(bardOne.Initiative));
        textTest = (TextView) thisView.findViewById(R.id.specialSkills);
        textTest.setText(bardOne.SpecialSkills[0]);
        textTest.append(", " + bardOne.SpecialSkills[1]);
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[1]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[2]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[3]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[4]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[5]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[6]));

        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt0);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[0]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt1);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[1]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt2);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[2]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt3);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[3]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt4);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[4]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt5);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[5]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt6);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[6]));
        //incomplete

    }
    public void levelUpBardButton(View view){
        View thisView = getView();
        bardOne.levelUpBard();
        TextView textTest = (TextView) thisView.findViewById(R.id.firstNameID);
        textTest.setText(bardOne.firstName);


        textTest = (TextView) thisView.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(bardOne.level));
        textTest = (TextView) thisView.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[1]));
        textTest = (TextView) thisView.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[2]));
        textTest = (TextView) thisView.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[5]));
        textTest = (TextView) thisView.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[0]));
        textTest = (TextView) thisView.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[1]));
        textTest = (TextView) thisView.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[2]));
        textTest = (TextView) thisView.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[3]));
        textTest = (TextView) thisView.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[4]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) thisView.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(bardOne.fortSave));
        textTest = (TextView) thisView.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(bardOne.refSave));
        textTest = (TextView) thisView.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(bardOne.willSave));
        textTest = (TextView) thisView.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseWillSave));
        textTest = (TextView) thisView.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseRefSave));
        textTest = (TextView) thisView.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseFortSave));
        textTest = (TextView) thisView.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(bardOne.AC));
        textTest = (TextView) thisView.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(bardOne.FlatFootAC));
        textTest = (TextView) thisView.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(bardOne.touchAC));
        if(bardOne.AttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(bardOne.AttackBonus[0]));
        }
        if(bardOne.AttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(bardOne.AttackBonus[1]));
        }
        if(bardOne.AttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(bardOne.AttackBonus[2]));
        }
        if(bardOne.AttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(bardOne.AttackBonus[3]));
        }
        if(bardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[0]));
        }
        if(bardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[1]));
        }
        if(bardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[2]));
        }
        if(bardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) thisView.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(bardOne.Initiative));

        textTest = (TextView) thisView.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(bardOne.travelSpeed));
        textTest = (TextView) thisView.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(bardOne.Initiative));

        textTest = (TextView) thisView.findViewById(R.id.specialSkills);


        textTest.setText("");
        int c = 0;
        while(c < 100){
            textTest.append(bardOne.SpecialSkills[c] + ", ");
            c++;
        }
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[1]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[2]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[3]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[4]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[5]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[6]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt0);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[0]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt1);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[1]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt2);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[2]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt3);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[3]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt4);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[4]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt5);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[5]));
        textTest = (TextView) thisView.findViewById(R.id.SpellsKnownAt6);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[6]));

    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View returningView =inflater.inflate(
                R.layout.bard_make, container, false);

         spawnButton = (Button) returningView.findViewById(R.id.spawnBardButton);
         levelUpButton = (Button) returningView.findViewById(R.id.levelBard);
        spawnButton.setOnClickListener(this);
        levelUpButton.setOnClickListener(this);
        levelUpButton.setEnabled(false);

        return returningView;
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.spawnBardButton:
                spawnBard(view);
                levelUpButton.setEnabled(true);
                break;
            case R.id.levelBard:
                levelUpBardButton(view);
                break;
            default:
                //do nothing

        }
    }

}