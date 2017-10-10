package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PassengerRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_register);

        final Button btPassengerRegister = (Button) findViewById(R.id.btPassengerRegister);

        btPassengerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent registerIntent = new Intent(PassengerRegisterActivity.this, PassengerLoginActivity.class);
                PassengerRegisterActivity.this.startActivity(registerIntent);
            }

        });
    }
}
