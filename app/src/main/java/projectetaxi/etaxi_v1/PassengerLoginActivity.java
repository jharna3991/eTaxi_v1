package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PassengerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_login);

        final Button btPassengerLogin = (Button) findViewById(R.id.btPassengerLogin);
        final Button btPassengerRegister = (Button) findViewById(R.id.btPassengerRegister);

        btPassengerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(PassengerLoginActivity.this, PassengerActivity.class);
                PassengerLoginActivity.this.startActivity(loginIntent);
            }

        });

        btPassengerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(PassengerLoginActivity.this, PassengerRegisterActivity.class);
                PassengerLoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}