package com.devbaltasarq.Multiactividad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
    public final int REQUEST_CODE1 = 0;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btLaunch1 = (Button) this.findViewById( R.id.btLaunch1 );
        Button btLaunch2 = (Button) this.findViewById( R.id.btLaunch2 );

        btLaunch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Main.this, Subactivity1.class );
                intent.putExtra( "x", "Ppal lanza Subactividad1" );
                Main.this.startActivity( intent );
            }
        });

        btLaunch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Main.this, Subactivity2.class );
                Main.this.startActivityForResult( intent, REQUEST_CODE1 );
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        TextView lblResult = (TextView) this.findViewById( R.id.lblResult );

        if ( requestCode == REQUEST_CODE1 ) {
            lblResult.setText( Integer.toString( resultCode ) );
        }

        return;
    }
}
