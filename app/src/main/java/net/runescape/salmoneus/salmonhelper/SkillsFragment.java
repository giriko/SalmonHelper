package net.runescape.salmoneus.salmonhelper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class SkillsFragment extends Fragment {

    public SkillsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] skills = {"Overall","Attack","Defence","Strength","Constitution","Ranged",
                            "Prayer","Magic","Cooking","Woodcutting","Fletching","Firemaking",
                            "Crafting","Smithing","Mining","Herblore","Agility","Theiving",
                            "Slayer","Farming","Runecrafting","Hunter","Construction","Summoning",
                            "Dungeoneering","Divination"};
        ArrayList<String> skillList = new ArrayList<>(Arrays.asList(skills));

       ArrayAdapter<String> mSkillsAdapter = new ArrayAdapter<>( getActivity(),
                R.layout.list_item_skills,
                R.id.list_item_skills_textview,
                skillList);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_skills);
        listView.setAdapter(mSkillsAdapter);
        return rootView;
    }
}
