package np.com.cbikas.quizapp2020dma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        result=findViewById(R.id.result);

        Intent intent=getIntent();
        String res=intent.getStringExtra("np.com.cbikas.quizapp2020dma");
        result.setText(""+res);

    }
}
