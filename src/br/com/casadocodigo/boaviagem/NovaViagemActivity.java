package br.com.casadocodigo.boaviagem;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class NovaViagemActivity extends Activity {

	private int ano, mes, dia;
	private Button dataSaida;
	private Button dataChegada;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_novaviagem);

		Calendar calendar = Calendar.getInstance();
		ano = calendar.get(Calendar.YEAR);
		mes = calendar.get(Calendar.MONTH);
		dia = calendar.get(Calendar.DAY_OF_MONTH);
		dataSaida = (Button) findViewById(R.id.dataSaida);
		dataSaida.setText(dia + "/" + (mes + 1) + "/" + ano);
		dataChegada = (Button) findViewById(R.id.dataChegada);
		dataChegada.setText(dia + "/" + (mes + 1) + "/" + ano);

	}

	public void selecionarData(View view) {
		onCreateDialog(view.getId()).show();

	}

	@Override
	protected Dialog onCreateDialog(int id) {

		switch (id) {
		case R.id.dataSaida:
			return new DatePickerDialog(this, listenerDataSaida, ano, mes, dia);
		case R.id.dataChegada:
			return new DatePickerDialog(this, listenerDataChegada, ano, mes,dia);
		}
		return null;
	}

	private OnDateSetListener listenerDataSaida = new OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			ano = year;
			mes = monthOfYear;
			dia = dayOfMonth;
			dataSaida.setText(dia + "/" + (mes + 1) + "/" + ano);

		}
	};
	private OnDateSetListener listenerDataChegada = new OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			ano = year;
			mes = monthOfYear;
			dia = dayOfMonth;
			dataChegada.setText(dia + "/" + (mes + 1) + "/" + ano);
		}

	};

}
