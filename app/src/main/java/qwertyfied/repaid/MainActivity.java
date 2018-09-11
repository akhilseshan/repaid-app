package qwertyfied.repaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText upi_id, amount;
    Button pay_button;
    TextView charges, sum_amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upi_id = findViewById(R.id.vpa_field);
        amount = findViewById(R.id.amount_field);

        pay_button = findViewById(R.id.button_submit);

        charges = findViewById(R.id.charges);
        sum_amount = findViewById(R.id.effective_amount);


    }
}
