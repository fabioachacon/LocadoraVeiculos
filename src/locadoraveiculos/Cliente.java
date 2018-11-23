package locadoraveiculos;

public class Cliente {
	
	private String nome;
	private int ID;
	private String endereco;
	private String tel;
	
	public Cliente(String name, String id, String end, String tel) {
		
		setNome(name);
		setID(id);
		setEndereco(end);
		setTel(tel);
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public void setID(String ID) {
		
            try{
                int IdConvertido = Integer.parseInt(ID);
		this.ID = IdConvertido;
            }catch(java.lang.NumberFormatException e){
                throw new IllegalArgumentException("O ID informadodeve conter apenas números");
            }
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
	}
	
	public void setTel(String tel) {
		
                
		this.tel = tel;
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public int getID() {
		
		return ID;
	}
	
	public String getTel() {
		
		return tel;
	}
	
	public String getEndereco() {
		
		return endereco;
	}
	
	public String toString()
	{
		return String.format("Nome: %s\n"
				          + "Identidade: %s\n"
				          + "Endere�o: %s\n"
				          + "Telefone: %s\n", getNome(), getID(), getEndereco(), getTel());
	}

}