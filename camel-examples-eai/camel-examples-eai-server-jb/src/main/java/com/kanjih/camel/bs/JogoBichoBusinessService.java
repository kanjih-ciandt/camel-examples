package com.kanjih.camel.bs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.kanjih.camel.to.Animais;
import com.kanjih.camel.to.Aposta;
import com.kanjih.camel.to.Sorteio;

@Service
@Scope(value="singleton")
public class JogoBichoBusinessService {
	private List<Sorteio> listSorteios = new ArrayList<Sorteio>();
	
	public List<Animais> listarJogos(){
		ArrayList<Animais> listAnimais = new ArrayList<Animais>();
		listAnimais.add(new Animais(1,"Avestruz",1,2,3,4));
		listAnimais.add(new Animais(2,"Aguia",5,6,7,8));
		listAnimais.add(new Animais(3,"Burro",9,10,11,12));
		listAnimais.add(new Animais(4,"Borboleta",13,14,15,16));
		listAnimais.add(new Animais(5,"Cachorro",17,18,19,20));
		listAnimais.add(new Animais(6,"Cabra",21,22,23,24));
		listAnimais.add(new Animais(7,"Carneiro",25,26,27,28));
		listAnimais.add(new Animais(8,"Camelo",29,30,31,32));
		listAnimais.add(new Animais(9,"Cobra",33,34,35,36));
		listAnimais.add(new Animais(10,"Coelho",37,38,39,40));
		listAnimais.add(new Animais(11,"Cavalo",41,42,43,44));
		listAnimais.add(new Animais(12,"Elefante",45,46,47,48));
		listAnimais.add(new Animais(13,"Galo",49,50,51,52));
		listAnimais.add(new Animais(14,"Gato",53,54,55,56));
		listAnimais.add(new Animais(15,"Jacare",57,58,59,60));
		listAnimais.add(new Animais(16,"Leão",61,62,63,64));
		listAnimais.add(new Animais(17,"Macaco",65,66,67,68));
		listAnimais.add(new Animais(18,"Porco",69,70,71,72));
		listAnimais.add(new Animais(19,"Pavão",73,74,75,76));
		listAnimais.add(new Animais(20,"Peru",77,78,79,80));
		listAnimais.add(new Animais(21,"Touro",81,82,83,84));
		listAnimais.add(new Animais(22,"Tigre",85,86,87,88));
		listAnimais.add(new Animais(23,"Urso",89,90,91,92));
		listAnimais.add(new Animais(24,"Veado",93,94,95,96));
		listAnimais.add(new Animais(25,"Vaca",97,98,99,00));		
		
		return listAnimais;
	}

	/**
	 * 
	 * @param dataInicial
	 * @param dataFinal
	 * @return
	 */
	public List<Sorteio> listarSorteios(Date dataInicial, Date dataFinal){
		List<Sorteio> list = null;
		if(dataInicial == null && dataFinal == null ){
			list = listSorteios;
		}
		
		return list;		
		
	}
	
	/**
	 * 
	 * @param nomeAnimal
	 * @return
	 */
	public Animais acharAnimal(String nomeAnimal){
		Animais animaisRetorno = null;
		
		List<Animais> list = this.listarJogos();
		for(Animais animais : list){
			if(nomeAnimal.equals(animais.getNomeAnimal())){
				animaisRetorno = animais;
			}
		}
		
		return animaisRetorno;
	}

}
