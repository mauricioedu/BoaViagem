package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText usuario;
	private EditText senha;
	private String erroLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.usuario = (EditText) findViewById(R.id.usuario);
		this.senha = (EditText) findViewById(R.id.senha);
		this.erroLogin = getResources().getString(R.string.erro_Login);
	}

	public void Login(View v) {
		String usuarioInformado = this.usuario.getText().toString();
		String senhaInformada = this.senha.getText().toString();

		if ("mauricio".equals(usuarioInformado) && "123".equals(senhaInformada)) {
			startActivity(new Intent(this, DashBoardActivity.class));
		} else {
			Toast.makeText(this, erroLogin, Toast.LENGTH_SHORT).show();
		}

	}
}
