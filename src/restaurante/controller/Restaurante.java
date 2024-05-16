package restaurante.controller;


	(nome = "Restaurante Sem Tloca")
	public class Restaurante {

		
	@Id
	private Long id;

	private String prato;
	private String pedido;
	private String cliente;


	public Restaurante(String prato, String pedido, String cliente) {
		
		this.prato = prato;
		this.pedido = pedido;
		this.cliente = cliente;
	}
	@SuppressWarnings("unused")
	private Restaurante() {
		// TODO Auto-generated constructor stub
	}

	public String getPrato() {
		return prato;
	}
	public void setPrato(String prato) {
		this.prato = prato;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	}

}
