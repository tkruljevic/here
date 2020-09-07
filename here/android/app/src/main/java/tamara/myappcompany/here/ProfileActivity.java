package tamara.myappcompany.here;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.tensorflow.lite.examples.detection.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(null);
        setContentView(R.layout.profile_activity);

        androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        //toolbar.inflateMenu(R.menu.toolbar_menu);


        toolbar.setNavigationOnClickListener(new NavigationIconClickListener(
                ProfileActivity.this,
                findViewById(R.id.c1_container2),
                new AccelerateDecelerateInterpolator()));

        TextView nameTxt = findViewById(R.id.label_1);
        TextView nameTxt2 = findViewById(R.id.label_2);
        ImageView nameImg = findViewById(R.id.label_3);

        String StudentName = "Student name not set";
        String StudentNumber = "Student number not set";
        int StudentImageID = 0;

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            StudentName = extras.getString("StudentName");
            StudentNumber = extras.getString("StudentNumber");
            StudentImageID = extras.getInt("StudentImageID");
        }

        nameTxt.setText(StudentName);
        nameTxt2.setText(StudentNumber);
        nameImg.setImageResource(StudentImageID);


    }


}
