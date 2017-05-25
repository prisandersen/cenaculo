/**
 * 
 */
package br.com.cenaculo.model;

/**
 * @author wande
 *
 */
public class Operadora {

	private String nome;
	private Integer codigo;
	private String categoria;
	private Integer preco;
	
	public Operadora() {
		super();
	}
	
	public Operadora(String nome, Integer codigo, String categoria) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
	}
	public Operadora(String nome, Integer codigo, String categoria, Integer preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Operadora [nome=" + nome + ", codigo=" + codigo + ", categoria=" + categoria + ", preco=" + preco + "]";
	}
	
}
