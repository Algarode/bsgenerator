package litetech.com.bsgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<String> array1, array2, array3;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        setArrays();
        final Button button = (Button) findViewById(R.id.btnGenerate);
        final TextView textView = (TextView) findViewById(R.id.tvWords);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getResult());
                count++;
                if (count == 10) {
                    button.setText("Generate more!");
                }
                if (count == 25) {
                    button.setText("Generate even more!");
                }
                if (count == 50) {
                    Toast.makeText(MainActivity.this, "Jesus.. you're really going at it, huh?", Toast.LENGTH_LONG).show();
                    button.setText("Keep 'em coming! GENERATE!!!");
                }
            }
        });
    }

    public String getResult() {
        Random random = new Random();
        String s1 = array1.get(random.nextInt(array1.size()));
        String s2 = array2.get(random.nextInt(array2.size()));
        String s3 = array3.get(random.nextInt(array3.size()));
        return s1 + " " + s2 + " " + s3;
    }

    private void setArrays() {
        if (array1 == null || array2 == null || array3 == null ||
                array1.isEmpty() || array2.isEmpty() || array3.isEmpty()) {
            array1 = new ArrayList<>();
            array2 = new ArrayList<>();
            array3 = new ArrayList<>();

            array1.clear();
            array2.clear();
            array3.clear();

            array1.addAll(Arrays.asList("implement", "utilize", "integrate", "streamline", "optimize", "evolve", "transform", "embrace",
                    "enable", "orchestrate", "leverage", "reinvent", "aggregate", "architect", "enhance", "incentivize", "morph", "empower",
                    "envisioneer", "monetize", "harness", "facilitate", "seize", "disintermediate", "synergize", "strategize", "deploy",
                    "brand", "grow", "target", "syndicate", "synthesize", "deliver", "mesh", "incubate", "engage", "maximize", "benchmark",
                    "expedite", "reintermediate", "whiteboard", "visualize", "repurpose", "innovate", "scale", "unleash", "drive", "extend",
                    "engineer", "revolutionize", "generate", "exploit", "transition", "e-enable", "iterate", "cultivate", "matrix",
                    "productize", "redefine", "recontextualize"));

            array2.addAll(Arrays.asList("clicks-and-mortar", "value-added", "vertical", "proactive", "robust", "revolutionary", "scalable",
                    "leading-edge", "innovative", "intuitive", "strategic", "e-business", "mission-critical", "sticky", "one-to-one",
                    "24/7", "end-to-end", "global", "B2B", "B2C", "granular", "frictionless", "virtual", "viral", "dynamic", "24/365",
                    "best-of-breed", "killer", "magnetic", "bleeding-edge", "web-enabled", "interactive", "dot-com", "sexy", "back-end",
                    "real-time", "efficient", "front-end", "distributed", "seamless", "extensible", "turn-key", "world-class",
                    "open-source", "cross-platform", "cross-media", "synergistic", "bricks-and-clicks", "out-of-the-box", "enterprise",
                    "integrated", "impactful", "wireless", "transparent", "next-generation", "cutting-edge", "user-centric", "visionary",
                    "customized", "ubiquitous", "plug-and-play", "collaborative", "compelling", "holistic", "rich"));

            array3.addAll(Arrays.asList("synergies", "web-readiness", "paradigms", "markets", "partnerships", "infrastructures", "platforms",
                    "initiatives", "channels", "eyeballs", "communities", "ROI", "solutions", "e-tailers", "e-services", "action-items",
                    "portals", "niches", "technologies", "content", "vortals", "supply-chains", "convergence", "relationships",
                    "architectures", "interfaces", "e-markets", "e-commerce", "systems", "bandwidth", "infomediaries", "models",
                    "mindshare", "deliverables", "users", "schemas", "networks", "applications", "metrics", "e-business", "functionalities",
                    "experiences", "web services", "methodologies", "photosynthesis"));
        }
    }

}
