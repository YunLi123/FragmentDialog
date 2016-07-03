package com.example.pakar.fragmentdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.oncreate_dialog);
        button2 = (Button) findViewById(R.id.bt_create_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginDialogFragment dialogFragment = new LoginDialogFragment();
                dialogFragment.show(getFragmentManager(), "logon");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareDialog shareDialog = new ShareDialog();
                shareDialog.show(getFragmentManager(), "share");
            }
        });
    }


}
