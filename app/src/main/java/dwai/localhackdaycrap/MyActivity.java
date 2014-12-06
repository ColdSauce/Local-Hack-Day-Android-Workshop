package dwai.localhackdaycrap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }
    public void clickedButton(View v){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        String firstNumText = firstNum.getText().toString();

        EditText secondNum = (EditText)findViewById(R.id.secondNum);
        String secondNumText = secondNum.getText().toString();


        int biggerNumber = Math.max(Integer.parseInt(firstNumText), Integer.parseInt(secondNumText));

        TextView textView = (TextView)findViewById(R.id.textView);

        textView.setText("bigger is : " + biggerNumber);


    }


}
