package com.puseletsomaraba.kidsmusicxylophone;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {




        Button buttonA,buttonB,buttonC,buttonD,buttonE,buttonF,buttonG;
        final private  int maxSounds=7;
    SoundPool mSoundPool = new SoundPool(maxSounds, AudioManager.STREAM_MUSIC, 0);
    int[] arrSound =new int[maxSounds];



        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initialiseViews();
            soundInitialise ();
      setLinsernerButton();







    }


 public void soundInitialise () {

     arrSound[0] = mSoundPool.load(this,R.raw.note6_a,1);
     arrSound[1] = mSoundPool.load(this,R.raw.note7_b,1);
     arrSound[2] = mSoundPool.load(this,R.raw.note1_c,1);
     arrSound[3] = mSoundPool.load(this,R.raw.note2_d,1);
     arrSound[4] = mSoundPool.load(this,R.raw.note3_e,1);
     arrSound[5] = mSoundPool.load(this,R.raw.note4_f,1);
     arrSound[6] = mSoundPool.load(this,R.raw.note5_g,1);


    }

    public void initialiseViews () {

        buttonA = findViewById(R.id.a_key);
        buttonB = findViewById(R.id.b_key);
        buttonC = findViewById(R.id.c_key);
        buttonD = findViewById(R.id.d_key);
        buttonE = findViewById(R.id.e_key);
        buttonF = findViewById(R.id.f_key);
        buttonG = findViewById(R.id.g_key);



    }

    public void setLinsernerButton()
    {
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.a_key:
                Toast.makeText(getApplicationContext(),"Love",Toast.LENGTH_LONG).show();

                mSoundPool.play(  arrSound[0], 1, 1, 0, 0, 1);
                break;

            case R.id.b_key:
                Toast.makeText(getApplicationContext(),"Peace",Toast.LENGTH_LONG).show();
                mSoundPool.play(  arrSound[1], 1, 1, 0, 0, 1);

                break;
            case R.id.c_key:
                Toast.makeText(getApplicationContext(),"Patience",Toast.LENGTH_LONG).show();
                mSoundPool.play(  arrSound[2], 1, 1, 0, 0, 1);

                break;
            case R.id.d_key:
                Toast.makeText(getApplicationContext(),"Happiness",Toast.LENGTH_LONG).show();
                mSoundPool.play(  arrSound[3], 1, 1, 0, 0, 1);

                break;
            case R.id.e_key:
                Toast.makeText(getApplicationContext(),"Dream",Toast.LENGTH_LONG).show();
                mSoundPool.play(  arrSound[4], 1, 1, 0, 0, 1);

                break;
            case R.id.f_key:
                Toast.makeText(getApplicationContext(),"Appreciation",Toast.LENGTH_LONG).show();
                mSoundPool.play(  arrSound[5], 1, 1, 0, 0, 1);

                break;
            case R.id.g_key:
                Toast.makeText(getApplicationContext(),"Joyfulness",Toast.LENGTH_LONG).show();
                mSoundPool.play(  arrSound[6], 1, 1, 0, 0, 1);

                break;

        }



    }
}


