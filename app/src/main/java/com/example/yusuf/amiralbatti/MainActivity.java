package com.example.yusuf.amiralbatti;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tw00,tw01,tw02,tw03,tw04,tw10,tw11,tw12,tw13,tw14,tw20,tw21,tw22,tw23,tw24,tw30,tw31,tw32,tw33,tw34,tw40,tw41,tw42,tw43,tw44,tw_zar;
    Button btn1;
    int zar,i;
    Boolean full00=false,full01=false,full02=false,full03=false,full04=false,full10=false,full11=false,full12=false,full13=false,full14=false,full20=false,full21=false,full22=false,full23=false,full24=false,full30=false,full31=false,full32=false,full33=false,full34=false,full40=false,full41=false,full42=false,full43=false,full44=false;
    Boolean fullk00=false,fullk01=false,fullk02=false,fullk03=false,fullk04=false,fullk10=false,fullk11=false,fullk12=false,fullk13=false,fullk14=false,fullk20=false,fullk21=false,fullk22=false,fullk23=false,fullk24=false,fullk30=false,fullk31=false,fullk32=false,full3k3=false,fullk34=false,fullk40=false,fullk41=false,fullk42=false,fullk43=false,fullk44=false;

    Random rnd = new Random();
    int[][] array = new int[5][5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tw00 = (TextView)findViewById(R.id.tw00);
        tw01 = (TextView)findViewById(R.id.tw01);
        tw02 = (TextView)findViewById(R.id.tw02);
        tw03 = (TextView)findViewById(R.id.tw03);
        tw04 = (TextView)findViewById(R.id.tw04);
        tw10 = (TextView)findViewById(R.id.tw10);
        tw11 = (TextView)findViewById(R.id.tw11);
        tw12 = (TextView)findViewById(R.id.tw12);
        tw13 = (TextView)findViewById(R.id.tw13);
        tw14 = (TextView)findViewById(R.id.tw14);
        tw20 = (TextView)findViewById(R.id.tw20);
        tw21 = (TextView)findViewById(R.id.tw21);
        tw22 = (TextView)findViewById(R.id.tw22);
        tw23 = (TextView)findViewById(R.id.tw23);
        tw24 = (TextView)findViewById(R.id.tw24);
        tw30 = (TextView)findViewById(R.id.tw30);
        tw31 = (TextView)findViewById(R.id.tw31);
        tw32 = (TextView)findViewById(R.id.tw32);
        tw33 = (TextView)findViewById(R.id.tw33);
        tw34 = (TextView)findViewById(R.id.tw34);
        tw40 = (TextView)findViewById(R.id.tw40);
        tw41 = (TextView)findViewById(R.id.tw41);
        tw42 = (TextView)findViewById(R.id.tw42);
        tw43 = (TextView)findViewById(R.id.tw43);
        tw44 = (TextView)findViewById(R.id.tw44);
        tw_zar = (TextView)findViewById(R.id.tw_zar);
        btn1 = (Button)findViewById(R.id.btn1);

        //zar atıp değer al
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zar =(rnd.nextInt(3)+1);
                tw_zar.setText(String.valueOf(zar));
                i++;
            }
        });




        tw00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk01 ||fullk10))
                {
                    tw00.setBackgroundColor(Color.RED);
                    fullk00=true;
                }
                    else if(i%2==1 && full10)
                {
                    tw00.setBackgroundColor(Color.BLUE);
                    full00=true;
                }
            }
        });



        tw01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk00 || fullk02 || fullk11))
                {
                    tw01.setBackgroundColor(Color.RED);
                    fullk01=true;
                }
                else if(i%2==1 && (full00 || full11 || full02))
                {
                    tw01.setBackgroundColor(Color.BLUE);
                    full01=true;
                }
            }
        });


        tw02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                {
                    tw02.setBackgroundColor(Color.RED);
                    fullk02=true;
                }
                else if(i%2==1 && (full01 || full12 || full03))
                {
                    tw02.setBackgroundColor(Color.BLUE);
                    full02=true;
                }
            }
        });


        tw03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk02 || fullk04 || fullk13))
                {
                    tw03.setBackgroundColor(Color.RED);
                    fullk03=true;
                }
                else if(i%2 == 1 && (full02 || full04 || full13))
                {
                    tw03.setBackgroundColor(Color.BLUE);
                    full03=true;
                }
            }
        });

        tw04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk03 || fullk14))
                {
                    tw04.setBackgroundColor(Color.RED);
                    fullk04=true;
                }
                else if(i%2 ==1 && (full03 || full14))
                {
                    tw04.setBackgroundColor(Color.BLUE);
                    full04=true;
                }
            }
        });

        tw10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk00 || fullk11))
                {
                    tw10.setBackgroundColor(Color.RED);
                    fullk10=true;
                }
                else if(i%2==1 && (full20 || full11))
                {
                    tw10.setBackgroundColor(Color.BLUE);
                    full10=true;
                }
            }
        });

        tw11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk01 || fullk10 || fullk12))
                {
                    tw11.setBackgroundColor(Color.RED);
                    fullk11=true;
                }
                else if(i%2==1 && (full21 || full10 || full12))
                {
                    tw11.setBackgroundColor(Color.BLUE);
                    full11=true;
                }
            }
        });

        tw12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk02 || fullk11 |fullk13))
                {
                    tw12.setBackgroundColor(Color.RED);
                    fullk12=true;
                }
                else if(i%2==1 && (full22 || full11 || full13))
                {
                    tw12.setBackgroundColor(Color.BLUE);
                    full12=true;
                }
            }
        });

        tw13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk12 || fullk03 || fullk14))
                {
                    tw13.setBackgroundColor(Color.RED);
                    fullk13=true;
                }
                else if(i%2 == 1 && (full23 ||full12 || full14))
                {
                    tw13.setBackgroundColor(Color.BLUE);
                    full13=true;
                }
            }
        });

        tw14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0 && (fullk04 || fullk13 ))
                {
                    tw14.setBackgroundColor(Color.RED);
                    fullk14=true;
                }
                else if (i%2 == 1 && (full13 || full24))
                {
                    tw14.setBackgroundColor(Color.BLUE);
                    full14=true;
                }
            }
        });


        tw20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw20.setBackgroundColor(Color.RED);
                else
                    tw20.setBackgroundColor(Color.BLUE);

                full20=true;
            }
        });

        tw21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw21.setBackgroundColor(Color.RED);
                else
                    tw21.setBackgroundColor(Color.BLUE);

                full21=true;
            }
        });

        tw22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw22.setBackgroundColor(Color.RED);
                else
                    tw22.setBackgroundColor(Color.BLUE);

                full22=true;
            }
        });

        tw23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw23.setBackgroundColor(Color.RED);
                else
                    tw23.setBackgroundColor(Color.BLUE);

                full23=true;
            }
        });

        tw24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw24.setBackgroundColor(Color.RED);
                else
                    tw24.setBackgroundColor(Color.BLUE);

                full24=true;
            }
        });

        tw30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw30.setBackgroundColor(Color.RED);
                else
                    tw30.setBackgroundColor(Color.BLUE);

                full30=true;
            }
        });

        tw31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw31.setBackgroundColor(Color.RED);
                else
                    tw31.setBackgroundColor(Color.BLUE);

                full31=true;
            }
        });

        tw32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw32.setBackgroundColor(Color.RED);
                else
                    tw32.setBackgroundColor(Color.BLUE);

                full32=true;
            }
        });

        tw33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw33.setBackgroundColor(Color.RED);
                else
                    tw33.setBackgroundColor(Color.BLUE);

                full33=true;
            }
        });

        tw34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw34.setBackgroundColor(Color.RED);
                else
                    tw34.setBackgroundColor(Color.BLUE);

                full34=true;
            }
        });

        tw40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw40.setBackgroundColor(Color.RED);
                else
                    tw40.setBackgroundColor(Color.BLUE);

                full40=true;
            }
        });

        tw41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw41.setBackgroundColor(Color.RED);
                else
                    tw41.setBackgroundColor(Color.BLUE);

                full41=true;
            }
        });

        tw42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw42.setBackgroundColor(Color.RED);
                else
                    tw42.setBackgroundColor(Color.BLUE);

                full42=true;
            }
        });

        tw43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw43.setBackgroundColor(Color.RED);
                else
                    tw43.setBackgroundColor(Color.BLUE);

                full43=true;
            }
        });

        tw44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i%2==0)
                    tw44.setBackgroundColor(Color.RED);
                else
                    tw44.setBackgroundColor(Color.BLUE);

                full44=true;
            }
        });


    }
}
