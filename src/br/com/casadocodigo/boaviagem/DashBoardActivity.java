package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;


public class DashBoardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitydashboard);
		
		
	}
	public void selecionarOpcao(View view){
		switch(view.getId()){
		case R.id.novo_gasto:
			startActivity(new Intent(this,GastoActivity.class));
			break;
		case R.id.nova_viagem:
			startActivity(new Intent(this, NovaViagemActivity.class));
			break;	
			
			default:
				break;
				
		}
		
	}	
	

}
