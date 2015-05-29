package oleboys.ucla_cftm_app.View;

/**
 * Created by Student on 5/19/2015.
 */

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageButton;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import oleboys.ucla_cftm_app.MainActivity;
import oleboys.ucla_cftm_app.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DashboardFragment extends Fragment {
    private  ImageButton btnWater;
    private  ImageButton btnEnergy;
    private  ImageButton btnCarbonEmission;
    private  ImageButton btnRecycle;
    private  ImageButton btnFood;
    private  ImageButton btnPolitics;
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static DashboardFragment newInstance(int sectionNumber) {
        DashboardFragment fragment = new DashboardFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public DashboardFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        GraphView graph = (GraphView)rootView.findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0,1),
                new DataPoint(1,5),
                new DataPoint(2,3),
                new DataPoint(3,2),
                new DataPoint(4,6)
        });
        graph.addSeries(series);
        ListenerOnButton(rootView);
        return rootView;

    }

    private void ListenerOnButton(View view){
        //water
        btnWater = (ImageButton) view.findViewById(R.id.water);
        btnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animate button to position to the top button on the dial.
            }
        });
        //energy
        btnEnergy = (ImageButton)view.findViewById(R.id.energy);
        btnEnergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animate button to position to the top button on the dial.
            }
        });
        //carbon emission
        btnCarbonEmission = (ImageButton)view.findViewById(R.id.carbonEmission);
        btnCarbonEmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animate button to position to the top button on the dial.
            }
        });
        //waste and recycle
        btnRecycle = (ImageButton)view.findViewById(R.id.recycle);
        btnRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animate button to position to the top button on the dial.
            }
        });
        //food
        btnFood = (ImageButton)view.findViewById(R.id.food);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animate button to position to the top button on the dial.
            }
        });
        //politics
        btnPolitics = (ImageButton)view.findViewById(R.id.politics);
        btnPolitics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Animate button to position to the top button on the dial.
            }
        });

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
}

