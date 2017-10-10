package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DriverLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        final EditText etDriverEmail = (EditText) findViewById(R.id.etDriverEmail);
        final EditText etDriverPassword = (EditText) findViewById(R.id.etDriverPassword);

        final Button btDriverLogin = (Button) findViewById(R.id.btDriverLogin);
        final Button btDriverRegister = (Button) findViewById(R.id.btDriverRegister);

        btDriverLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent loginIntent = new Intent(DriverLoginActivity.this, DriverActivity.class);
                DriverLoginActivity.this.startActivity(loginIntent);
            }

        });

        btDriverRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(DriverLoginActivity.this, DriverRegisterActivity.class);
                DriverLoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}