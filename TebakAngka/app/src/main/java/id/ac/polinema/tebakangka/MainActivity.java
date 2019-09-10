package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private Button btnTebak;
	private EditText inputAngka;
	private int randomNumber;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		inputAngka = findViewById(R.id.number_input);
		btnTebak = findViewById(R.id.guess_button);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {

        Random random = new Random();
        int min=1;
        int max=100;
        randomNumber=random.nextInt(max - min) + min;

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
        inputAngka.setText("");
        btnTebak.setEnabled(true);
        initRandomNumber();
	}
}
