package com.devbaltasarq.Multiactividad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by pcmorales on 16/11/15.
 */
public class Subactivity2 extends Activity {
    @Override
    public void onCreate(Bundle data)
    {
        super.onCreate(data);
        this.setContentView( R.layout.subactivity2 );

        Button btResult1 = (Button) this.findViewById( R.id.btResult1 );
        Button btResult2 = (Button) this.findViewById( R.id.btResult2 );

        btResult1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subactivity2.this.setResult( 1 );
                Subactivity2.this.finish();
            }
        });

        btResult2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subactivity2.this.setResult( 2 );
                Subactivity2.this.finish();
            }
        });
    }
}
