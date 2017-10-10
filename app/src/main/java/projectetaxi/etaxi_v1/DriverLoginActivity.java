package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Driver;

public class DriverLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        Button btn_login = (Button) findViewById(R.id.btn_login);
        Button btn_register = (Button) findViewById(R.id.btn_register);

        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginIntent = new Intent(DriverLoginActivity.this, DriverActivity.class);
                DriverLoginActivity.this.startActivity(loginIntent);
            }

        });

        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(DriverLoginActivity.this, DriverRegisterActivity.class);
                DriverLoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}
