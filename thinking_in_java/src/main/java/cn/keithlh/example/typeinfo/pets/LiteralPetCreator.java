package cn.keithlh.example.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator{

	@SuppressWarnings("unchecked")
	public static final List<Class<? extends Pet>> allTypes = 
			Collections.unmodifiableList(Arrays.asList(Pet.class,Cat.class,Mutt.class,Cymric.class,
					Dog.class,EgyptianMau.class,Hamster.class));
	public static final List<Class<? extends Pet>> types = 
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}
}
