package np.com.cbikas.quizapp2020dma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Gk extends AppCompatActivity {

    private Button btnsubmit;
    private EditText etans;
    private RadioGroup num_one_radio_group1,num_one_radio_group2,num_one_radio_group3;
    // private CheckBox a,b,c,d;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);
        btnsubmit=findViewById(R.id.btnsubmit);
        etans=findViewById(R.id.etans);
        num_one_radio_group1=findViewById(R.id.num_one_radio_group);
        num_one_radio_group2=findViewById(R.id.num_one_radio_group2);
        num_one_radio_group3=findViewById(R.id.num_one_radio_group3);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(num_one_radio_group1.getCheckedRadioButtonId() == R.id.transition){
                    score ++;
                }
                if(num_one_radio_group1.getCheckedRadioButtonId() == R.id.transition2){
                    score ++;
                }
                if(num_one_radio_group1.getCheckedRadioButtonId() == R.id.transition3){
                    score ++;
                }
                String s=etans.getText().toString();
                if(s.equals("40")){
                    score ++;
                }
//                if(a.isChecked() && !b.isChecked() && !c.isChecked() &&  !d.isChecked()){
//                    score++;
//                }

                Intent intent=new Intent(Gk.this,ScoreActivity.class);
                intent.putExtra("np.com.cbikas.quizapp2020dma",score+"/5");
                startActivity(intent);

            }
        });


    }
}
