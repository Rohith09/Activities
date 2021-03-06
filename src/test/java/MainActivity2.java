import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.chandrassekhar.activities.R;



public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    String color="";
    Intent selectColor;
    Button btnok;
    RadioGroup rgcolor;
    int checkid;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
     call();

    }

    private void call() {
        rgcolor=(RadioGroup)findViewById(R.id.radio);
        btnok=(Button)findViewById(R.id.button);
        btnok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

      int ckeckid=rgcolor.getCheckedRadioButtonId();
        switch(checkid){
            case R.id.red:
                color="#FF0000";
                break;
            case R.id.blue:
                color="#0000FF";
            case R.id.yellow:
                color="FFFF00";
            case R.id.green:
                color="#228B22";
        }
        selectColor =new Intent();
        selectColor.putExtra("Selected",color);
        setResult(RESULT_OK,selectColor);
        finish();
    }
}
