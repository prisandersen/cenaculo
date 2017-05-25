/**
 * 
 */
package br.com.cenaculo.model;

/**
 * @author wande
 *
 */
public class Contato {
	private String nome;
	private String telefone;
	private String data;
	private Operadora operadora;
	
	public Contato() {
		super();

	}

	public Contato(String nome, String telefone, String data, Operadora operadora) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.operadora = operadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", data=" + data + ", operadora=" + operadora + "]";
	}
	
	
}
