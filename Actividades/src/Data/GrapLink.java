package Data;

public class GrapLink <E> {
	
	protected ListaEnlazada<Vertex<E>> listaVertex;//Esto solo es una lista de puntos o vertices...
	protected ListaEnlazada<Edge<E>> listaEdge; //Lista de conecciones que se hicieron...
	protected int sizeVertices;
	
	public GrapLink() {
		this.listaVertex = new ListaEnlazada<Vertex<E>>();
		this.listaEdge = new ListaEnlazada<Edge<E>>();
		
	}
	public void insertVertex(E data) {
		Vertex vertice = new Vertex(data);//Creamos un nuevo vertice...
		this.listaVertex.add(vertice);//Lo annadimos a nuestra lista de vertices...
		this.sizeVertices++;//Le indicamos al sistema que hay uno mas en la lista de vertices
		
	}
	public void insertEdge(Vertex<E> verInicial, Vertex<E>  verFinal) {
		
		Edge coneccion = new Edge(verInicial, verFinal);
	}
	
public void insertEdgeValor(E verInicial, E verFinal, int valor) {
		
		
	}
	public String toString() {
	
		return this.listaVertex.toString();
	}

}
