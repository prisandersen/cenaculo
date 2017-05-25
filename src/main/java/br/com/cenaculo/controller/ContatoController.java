/**
 * 
 */
package br.com.cenaculo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.cenaculo.model.Contato;
import br.com.cenaculo.model.Operadora;

/**
 * @author wande
 *
 */
@Controller
public class ContatoController {
	/**
	 * Busca todos os Pagamentos cadastrados, se for informado o auth-code,
	 * será feito o filtro pelo informado
	 * 
	 * @param jsonEntrada
	 * @return
	 */
	@RequestMapping(value = "/contatos", method = RequestMethod.GET)
	@ResponseBody
	public String searchContatos() {
		Contato contato1 = new Contato("Julia", "99992-5678", "2015-04-12T12:53:46.204Z", new Operadora("Oi", 14, "Celular"));
		Contato contato2 = new Contato("Giovanna", "99993-3579", "2015-04-12T12:53:46.204Z", new Operadora("Tim", 41, "Celular"));
		Contato contato3 = new Contato("Priscila", "99995-9514", "2015-04-12T12:53:46.204Z", new Operadora("Vivo", 15, "Celular"));
		
		List<Contato> list = new ArrayList<Contato>();
		list.add(contato1);
		list.add(contato2);
		list.add(contato3);
		
		Gson gson = new Gson();
		String json = null;
		try {
			json = gson.toJson(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	
	@RequestMapping(value = "/operadoras", method = RequestMethod.GET)
	@ResponseBody
	public String searchOperadors() {
		Operadora op1 =  new Operadora("Oi", 14, "Celular", 2);
		Operadora op2  =  new Operadora("Tim", 41, "Celular",3);
		Operadora op3 =  new Operadora("Vivo", 15, "Celular",1);
		Operadora op4 =  new Operadora("GVT", 25, "Fixo",1);
		Operadora op5 =  new Operadora("Claro", 21, "Fixo", 2);
		
		List<Operadora> list = new ArrayList<Operadora>();
		list.add(op1);
		list.add(op2);
		list.add(op3);
		list.add(op4);
		list.add(op5);
		
		Gson gson = new Gson();
		String json = null;
		try {
			json = gson.toJson(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	
	
}
