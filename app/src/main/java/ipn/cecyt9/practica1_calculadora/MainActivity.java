package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1,numero2,resultado;
    String operator;


    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickOperacionCapturaNum1(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView){
        operator="+";
        onClickOperacionCapturaNum1(miView);
    }

    public void onClickResta(View miView){
        operator="-";
        onClickOperacionCapturaNum1(miView);
    }

    public void onClickMultiplicacion(View miView){
        operator="*";
        onClickOperacionCapturaNum1(miView);
    }

    public void onClickDivision(View miView){
        operator="/";
        onClickOperacionCapturaNum1(miView);
    }

    public void onClickCos(View miView){
        operator ="COS";
        onClickIgual(miView);
    }

    public void onClickSin(View miView){
        operator ="SIN";
        onClickIgual(miView);
    }

    public void onClickTan(View miView){
        operator ="Cos";
        onClickIgual(miView);
    }

    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operator.equals("+")) {
                resultado = numero1 + numero2;
            } else if (operator.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operator.equals("*")) {
                resultado = numero1 * numero2;
            } else if (operator.equals("/")) {
                resultado = numero1 / numero2;
            } else if (operator.equals("COS") ) {
                resultado = Math.cos(numero2);
            } else if (operator.equals("SIN")) {
                resultado = Math.sin(numero2);
            } else if (operator.equals("TAN")) {
                resultado = Math.tan(numero2);
            }
            tv.setText(resultado.toString());
        }catch (NumberFormatException nfe){
            Toast.makeText( this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickBorrar(View miView) {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText("");
    }

}