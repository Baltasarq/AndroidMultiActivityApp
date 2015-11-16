package com.devbaltasarq.Multiactividad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by pcmorales on 16/11/15.
 */
public class Subactivity1 extends Activity {
    @Override
    public void onCreate(Bundle data)
    {
        super.onCreate(data);
        this.setContentView( R.layout.subactivity1 );

        String x = (String) this.getIntent().getExtras().get( "x" );
        String data1 = ( (MultiActivityApp) this.getApplication() ).getData();

        TextView lblSalute = (TextView) this.findViewById( R.id.lblSalute );
        lblSalute.setText( x + "\n" + data1 );

        Button btFinish = (Button) this.findViewById( R.id.btFinish );
        btFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subactivity1.this.finish();
            }
        });
    }
}
