package np.com.cbikas.quizapp2020dma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void math(View view){
        Intent intent=new Intent(MainActivity.this,MathQuiz.class);
        startActivity(intent);
    }
    public void sc(View view){
        Intent intent=new Intent(MainActivity.this,Main2ActivityScience.class);
        startActivity(intent);
    }
    public void computer(View view){
        Intent intent=new Intent(MainActivity.this,QuizActivity.class);
        startActivity(intent);
    }
    public void gk(View view){
        Intent intent=new Intent(MainActivity.this,Gk.class);
        startActivity(intent);
    }
}