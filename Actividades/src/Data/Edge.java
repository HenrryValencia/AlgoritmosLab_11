package Data;

public class Edge <E>{

	private Vertex<E> refInicial;//Vertice inicial
	private Vertex<E> refDestino;//vertice final
	private int weight;//valor si es que es necesario...
	
	public Edge(Vertex<E> verInicial ,Vertex<E>  verFinal) { //Metodo en el caso de que no se use una arista con peso...
		this.refDestino = verFinal;
		this.refInicial = verInicial;
		this.weight = -1;
	}

	public Edge(Vertex<E> refIncial, Vertex<E> refDestino, int weight) {//Metodo contrario al anterior...
		
		this.refDestino = refDestino;
		this.refInicial = refIncial;
		this.weight = weight;
	}
	
	public boolean equals(Object o) {//Este metodo sirve para verificar si los dos vertices que tenemos definido son iguale o no...
		if(o instanceof Edge <?>) {
			Edge<E> v = (Edge<E>) o;
			return this.refDestino.equals(this.refInicial);
		}//Esto se puede usar despues para determinar si hay redundancia o no, tambien depende para q lo usemos...
		return false;
	}
}
