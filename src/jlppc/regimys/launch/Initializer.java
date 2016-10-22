package jlppc.regimys.launch;

import jlppc.regimys.enums.Caractere.Stats;
import jlppc.regimys.enums.Type;
import jlppc.regimys.objects.Espece;
import jlppc.regimys.objects.Typedef;
import jlppc.regimys.objects.Typedef.Null;
import jlppc.regimys.util.text.StringKey;

/**
 * Permet d'initialiser des choses.
 * @author Jlppc
 *
 */
public class Initializer {
	public static Espece[] listePoke = new Espece[152];
	public static Object[] TODO = {null};
	/***
	 * Initialise les pokemon (espèces)
	 */
	 public static void initPokemons(){
		 listePoke[0] = new Espece(136, 0, 1, 1, 29, 33, "MissingNo.", Type.NORMAL, Type.VOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK}, 0f, 0f, "ERROR : MISSINGNO.", 0);
		 listePoke[1] = new Espece(49, 49, 65, 65, 45, 45, "Bulbizarre", Type.PLANTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[2], null, null, new Stats[]{Stats.ATKSPE}, 0.7f, 6.9f, "Il a une étrange graine plantée sur son dos. Elle grandit avec lui depuis sa naissance.", 64);
		 listePoke[2] = new Espece(62, 63, 80, 80, 60, 60, "Herbizarre",Type.PLANTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 32, listePoke[3], null, null, new Stats[]{Stats.ATKSPE, Stats.DEFSPE}, 1f, 13f, "Lorsque le bourgeon sur son dos éclot, il répand un doux parfum pour célébrer sa floraison.", 141);
		 listePoke[3] = new Espece(82, 83, 100, 100, 80, 80, "Florizarre", Type.PLANTE, Type.POISON, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.DEFSPE}, 2f, 100f, "Ses pétales lui servent à capter la lumière du soleil. Il peut ainsi en canaliser l'énergie.", 236);
		 listePoke[4] = new Espece(52, 43, 60, 50, 65, 39, "Salamèche", Type.FEU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[5], null, null, new Stats[]{Stats.VIT}, 0.6f, 8.5f, "La flamme sur sa queue représente l'énergie vitale de Salamèche. Quand il est vigoureux, elle brûle plus fort.", 65);
		 listePoke[5] = new Espece(64, 58, 80, 65, 80, 58, "Reptincel", Type.FEU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 36, listePoke[6], null, null, new Stats[]{Stats.VIT, Stats.ATKSPE}, 1.1f, 19f, "En agitant sa gueue, il peut élever la température à un niveau incroyable", 142);
		 listePoke[6] = new Espece(84, 78, 109, 85, 100, 78, "Dracaufeu", Type.FEU, Type.VOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.ATKSPE}, 1.7f, 90.5f, "Quand il crache son souffle brûlant, la flamme au bout de sa queue s'embrase.", 209);
		 listePoke[7] = new Espece(48, 65, 50, 64, 43, 44, "Carapuce", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[8], null, null, new Stats[]{Stats.DEF}, 0.5f, 9f, "Caché sous l'eau, il crache un jet d'eau sur sa proie et se cache à l'intérieur de sa carapace.", 66);
		 listePoke[8] = new Espece(63, 80, 65, 80, 58, 59, "Carabaffe", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 36, listePoke[9],null, null, new Stats[]{Stats.DEF, Stats.DEFSPE}, 1f, 22.5f,"On prétend qu'il vit 10 000 ans. Sa queue duveteuse est un symbole de longévité populaire.", 143 );
		 listePoke[9] = new Espece(83, 100, 85, 105, 78, 79, "Tortank", Type.EAU, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.DEFSPE, Stats.DEFSPE, Stats.DEFSPE}, 1.6f, 85.5f, "Il écrase ses adversaires de tout son poids pour leur faire perdre connaissance. Il rentre dans sa carapace s'il se sent en danger.", 210);
	 }
	 /**
	  * Initialise les sprites
	  */
	 public static void initSprites(){
		 
	 }
	 
	 public static void initKeys(){
		 StringKey.initialisateKeys();
	 }
	 
	 
}
