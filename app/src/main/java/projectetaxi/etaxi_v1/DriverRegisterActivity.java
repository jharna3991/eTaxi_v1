package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DriverRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_register);

        final Button btDriverRegister = (Button) findViewById(R.id.btDriverRegister);


        btDriverRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(DriverRegisterActivity.this, DriverLoginActivity.class);
                DriverRegisterActivity.this.startActivity(registerIntent);
            }
        });
    }
}
