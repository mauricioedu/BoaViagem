package br.com.casadocodigo.boaviagem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.SimpleAdapter;

public class ViagemListActivity extends ListActivity implements OnItemClickListener{
	
	private List<Map<String,Object>> viagens;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listaviagens);
		
		String[] de = {"imagem","destino","data","total"};
		int[] para = {R.id.tipoViagem,R.id.destino,R.id.data,R.id.valor};
		
		SimpleAdapter adapter = new SimpleAdapter(this,listaViagens(),R.layout.activity_listaviagens, de,para);
	}
	
		private List<Map<String,Object>>listaViagens(){
			viagens = new ArrayList<Map<String,Object>>();
			Map<String,Object> item = new HashMap<String,Object>();
			item.put("imagem",R.drawable.negocios);
			item.put("destino","São Paulo");
			item.put("data","02/02/2012 à 04/02/2012");
			item.put("total","Gasto total R$ 314,98");
			viagens.add(item);	
			
			item.put("imagem",R.drawable.lazer);
			item.put("destino","Maceio");
			item.put("data","14/05/2012 à 03/02/2012");
			item.put("total","Gasto total R$ 2500,98");
			viagens.add(item);
			
			return viagens;
		}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
	
		
}
