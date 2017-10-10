package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PassengerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_login);

        Button btn_plogin= (Button) findViewById(R.id.btn_plogin);
        Button btn_pregister= (Button) findViewById(R.id.btn_pregister);

        btn_plogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(PassengerLoginActivity.this, PassengerActivity.class);
                PassengerLoginActivity.this.startActivity(loginIntent);
            }

        });

        btn_pregister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(PassengerLoginActivity.this, PassengerRegisterActivity.class);
                PassengerLoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}
