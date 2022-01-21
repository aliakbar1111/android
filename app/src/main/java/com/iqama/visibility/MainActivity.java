package com.iqama.visibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

Button colum11,colum12,colum13,colum14,colum15;
Button colum21,colum22,colum23,colum24,colum25;
Button colum31,colum32,colum33,colum34,colum35;
Button colum41,colum42,colum43,colum44,colum45;
Button colum51,colum52,colum53,colum54,colum55;
Button colum61,colum62,colum63,colum64,colum65;
Button colum71,colum72,colum73,colum74,colum75;
Button colum81,colum82,colum83,colum84,colum85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1st line...............................


        colum11=findViewById(R.id.colum11);
        colum12=findViewById(R.id.colum12);
        colum13=findViewById(R.id.colum13);
        colum14=findViewById(R.id.colum14);
        colum15=findViewById(R.id.colum15);


        //2nd line .............................

        colum21=findViewById(R.id.colum21);
        colum22=findViewById(R.id.colum22);
        colum23=findViewById(R.id.colum23);
        colum24=findViewById(R.id.colum24);
        colum25=findViewById(R.id.colum25);

        //3rd line................................

        colum31=findViewById(R.id.colum31);
        colum32=findViewById(R.id.colum32);
        colum33=findViewById(R.id.colum33);
        colum34=findViewById(R.id.colum34);
        colum35=findViewById(R.id.colum35);


        //4th line...............................


        colum41=findViewById(R.id.colum41);
        colum42=findViewById(R.id.colum42);
        colum43=findViewById(R.id.colum43);
        colum44=findViewById(R.id.colum44);
        colum45=findViewById(R.id.colum45);

        //5th line...................................

        colum51=findViewById(R.id.colum51);
        colum52=findViewById(R.id.colum52);
        colum53=findViewById(R.id.colum53);
        colum54=findViewById(R.id.colum54);
        colum55=findViewById(R.id.colum55);

        //6th line ...............................

        colum61=findViewById(R.id.colum61);
        colum62=findViewById(R.id.colum62);
        colum63=findViewById(R.id.colum63);
        colum64=findViewById(R.id.colum64);
        colum65=findViewById(R.id.colum65);

        //7th line.................................

        colum71=findViewById(R.id.colum71);
        colum72=findViewById(R.id.colum72);
        colum73=findViewById(R.id.colum73);
        colum74=findViewById(R.id.colum74);
        colum75=findViewById(R.id.colum75);
        //8th line...................................

        colum81=findViewById(R.id.colum81);
        colum82=findViewById(R.id.colum82);
        colum83=findViewById(R.id.colum83);
        colum84=findViewById(R.id.colum84);
        colum85=findViewById(R.id.colum85);
        //------------------------------------------

        colum73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum73.setVisibility(View.INVISIBLE);
                colum52.setVisibility(View.VISIBLE);

            }
        });


        colum52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum52.setVisibility(View.INVISIBLE);
                colum44.setVisibility(View.VISIBLE);
            }
        });

        colum44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum44.setVisibility(View.INVISIBLE);
                colum81.setVisibility(View.VISIBLE);

            }
        });


        colum81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum81.setVisibility(View.INVISIBLE);
                colum32.setVisibility(View.VISIBLE);

            }
        });


        colum32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum32.setVisibility(View.INVISIBLE);
                colum24.setVisibility(View.VISIBLE);

            }
        });




        colum24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum24.setVisibility(View.INVISIBLE);
                colum12.setVisibility(View.VISIBLE);

            }
        });



        colum12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum12.setVisibility(View.INVISIBLE);
                colum65.setVisibility(View.VISIBLE);

            }
        });

        colum65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum65.setVisibility(View.INVISIBLE);
                colum72.setVisibility(View.VISIBLE);

            }
        });


        colum72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum72.setVisibility(View.INVISIBLE);
                colum41.setVisibility(View.VISIBLE);

            }
        });


        colum41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum41.setVisibility(View.INVISIBLE);
                colum74.setVisibility(View.VISIBLE);

            }
        });

        colum74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum74.setVisibility(View.INVISIBLE);
                colum61.setVisibility(View.VISIBLE);

            }
        });


        colum61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum61.setVisibility(View.INVISIBLE);
                colum23.setVisibility(View.VISIBLE);

            }
        });



        colum23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum23.setVisibility(View.INVISIBLE);
                colum54.setVisibility(View.VISIBLE);

            }
        });


        colum54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum54.setVisibility(View.INVISIBLE);
                colum82.setVisibility(View.VISIBLE);

            }
        });

        colum82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum82.setVisibility(View.INVISIBLE);
                colum45.setVisibility(View.VISIBLE);

            }
        });



        colum45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum45.setVisibility(View.INVISIBLE);
                colum22.setVisibility(View.VISIBLE);

            }
        });



        colum22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum22.setVisibility(View.INVISIBLE);
                colum85.setVisibility(View.VISIBLE);

            }
        });



        colum85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum85.setVisibility(View.INVISIBLE);
                colum62.setVisibility(View.VISIBLE);

            }
        });
        colum62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum62.setVisibility(View.INVISIBLE);
                colum25.setVisibility(View.VISIBLE);

            }
        });

         colum25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum25.setVisibility(View.INVISIBLE);
                colum21.setVisibility(View.VISIBLE);

            }
        });


         colum21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum21.setVisibility(View.INVISIBLE);
                colum43.setVisibility(View.VISIBLE);

            }
        });


        colum43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum43.setVisibility(View.INVISIBLE);
                colum83.setVisibility(View.VISIBLE);

            }
        });

        colum83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum83.setVisibility(View.INVISIBLE);
                colum63.setVisibility(View.VISIBLE);

            }
        });


       colum63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum63.setVisibility(View.INVISIBLE);
                colum55.setVisibility(View.VISIBLE);

            }
        });

        colum55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum55.setVisibility(View.INVISIBLE);
                colum42.setVisibility(View.VISIBLE);

            }
        });

      colum42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum42.setVisibility(View.INVISIBLE);
                colum15.setVisibility(View.VISIBLE);

            }
        });

     colum15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum15.setVisibility(View.INVISIBLE);
                colum75.setVisibility(View.VISIBLE);

            }
        });

   colum75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum75.setVisibility(View.INVISIBLE);
                colum35.setVisibility(View.VISIBLE);

            }
        });

 colum35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum35.setVisibility(View.INVISIBLE);
                colum13.setVisibility(View.VISIBLE);

            }
        });


 colum13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum13.setVisibility(View.INVISIBLE);
                colum64.setVisibility(View.VISIBLE);

            }
        });

colum64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum64.setVisibility(View.INVISIBLE);
                colum34.setVisibility(View.VISIBLE);

            }
        });

colum34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum34.setVisibility(View.INVISIBLE);
                colum51.setVisibility(View.VISIBLE);

            }
        });

colum51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum51.setVisibility(View.INVISIBLE);
                colum33.setVisibility(View.VISIBLE);

            }
        });


colum33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum33.setVisibility(View.INVISIBLE);
                colum71.setVisibility(View.VISIBLE);

            }
        });

colum71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum71.setVisibility(View.INVISIBLE);
                colum53.setVisibility(View.VISIBLE);

            }
        });

colum53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum53.setVisibility(View.INVISIBLE);
                colum84.setVisibility(View.VISIBLE);

            }
        });

colum84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum84.setVisibility(View.INVISIBLE);
                colum14.setVisibility(View.VISIBLE);

            }
        });

colum14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum14.setVisibility(View.INVISIBLE);
                colum11.setVisibility(View.VISIBLE);

            }
        });


colum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colum11.setVisibility(View.INVISIBLE);
                colum31.setVisibility(View.VISIBLE);

            }
        });

colum31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               colum11.setVisibility(View.VISIBLE);
               colum12.setVisibility(View.VISIBLE);
               colum13.setVisibility(View.VISIBLE);
               colum14.setVisibility(View.VISIBLE);
               colum15.setVisibility(View.VISIBLE);
               colum21.setVisibility(View.VISIBLE);

               colum22.setVisibility(View.VISIBLE);
               colum23.setVisibility(View.VISIBLE);
               colum24.setVisibility(View.VISIBLE);
               colum25.setVisibility(View.VISIBLE);

               colum31.setVisibility(View.VISIBLE);
               colum32.setVisibility(View.VISIBLE);
               colum33.setVisibility(View.VISIBLE);
               colum34.setVisibility(View.VISIBLE);
               colum35.setVisibility(View.VISIBLE);

               colum41.setVisibility(View.VISIBLE);
               colum42.setVisibility(View.VISIBLE);
               colum43.setVisibility(View.VISIBLE);
               colum44.setVisibility(View.VISIBLE);
               colum45.setVisibility(View.VISIBLE);

               colum51.setVisibility(View.VISIBLE);
               colum52.setVisibility(View.VISIBLE);
               colum53.setVisibility(View.VISIBLE);
               colum54.setVisibility(View.VISIBLE);
               colum55.setVisibility(View.VISIBLE);

               colum61.setVisibility(View.VISIBLE);
               colum62.setVisibility(View.VISIBLE);
               colum63.setVisibility(View.VISIBLE);
               colum64.setVisibility(View.VISIBLE);
               colum65.setVisibility(View.VISIBLE);

               colum71.setVisibility(View.VISIBLE);
               colum72.setVisibility(View.VISIBLE);
               colum73.setVisibility(View.VISIBLE);
               colum74.setVisibility(View.VISIBLE);
               colum75.setVisibility(View.VISIBLE);


               colum81.setVisibility(View.VISIBLE);
               colum82.setVisibility(View.VISIBLE);
               colum83.setVisibility(View.VISIBLE);
               colum84.setVisibility(View.VISIBLE);
               colum85.setVisibility(View.VISIBLE);



            }
        });















    }
}