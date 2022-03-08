package gabriela.aprendizado.estruturadados.vetorTamanhoEimpressao;

import java.util.ArrayList;

public class ClasseArrayList {

	public static void main(String[] args) {
		//CRESCE A MEDIDA QUE FOR NECESSARIO
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//ADICIONA UM ELEMENTO A LISTA
		arrayList.add("a");
		arrayList.add("0");
		
		System.out.println(arrayList);
		
		
		//ADICIONA UM ELEMENTO A LISTA,INFORMANDO A POSIÇÃO E SE FOR O CASO JA "EMPURRANDO" OS DEMAIS
		 arrayList.add(0,"b");
		 System.out.println(arrayList);
		 
		 
		 // VERIFICA SE UM ELEMENTO EXISTE NO ARRAY
		 boolean existe = arrayList.contains("a");
		 if(existe) {
			 System.out.println("item existe");
		 }else {
			 System.out.println("item não existe");
		 }
		 
		 //VERIFICA A POSIÇÃO DE UM UM ARRAY
		 int pos = arrayList.indexOf("0");
		 if(existe) {
			 System.out.println("item existe na  POSIÇÃO : " + pos);
		 }else {
			 System.out.println("item não existe em NENHUMA POSIÇÃO" + -1);
		 }
		 
		 //BUSCA RETORNANDO UM OBJETO, PASSANDO A POSIÇÃO
		 System.out.println(arrayList.get(2));
		 
		 //REMOVENDO UM ITEM DA LISTA
		 //*pelo indice
		 arrayList.remove(0);
		 //*pelo objeto
		 arrayList.remove("a");
		 System.out.println(arrayList);
		 
		 //TAMANHO DO ARRAY
		 System.out.println(arrayList.size());
		}
	
	

}
