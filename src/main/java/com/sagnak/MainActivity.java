package com.sagnak;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.sagnak.service.Welcomer;

import javax.inject.Inject;

public class MainActivity extends Activity {

    // dependency
    // setter injection
    @Inject
    Welcomer welcomer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sınıfı objectGraph'e tanıtıyoruz
        ((App)getApplication()).getObjectGraph().inject(this);

        // eğer welcomer bağımlılığı sağlanmazsa NullPointerException almamız gerekli
        String msg = welcomer.sayHello("passenger!");
        ((TextView)findViewById(R.id.tv)).setText(msg);
    }

}

