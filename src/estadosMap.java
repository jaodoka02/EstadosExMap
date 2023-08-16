import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;



public class estadosMap {
    public static void main(String[] args) {
        System.out.println("\nDicionário com estados e populações: ");
        Map<String,Integer> populaEstados = new HashMap<>(){{

            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populaEstados);

        System.out.println("\nSubstituindo a população do RN por : 3.534.165 ");
        populaEstados.put("RN", 3534165);
        System.out.println(populaEstados);

        System.out.println("\nConfindo se o estado da Paraíba esta no dicionário, caso não, adicione  PB - 4.039.277");
        populaEstados.put("PB", 4039277);
        System.out.println(populaEstados);

        System.out.println("\nExiba a população de PE");
        System.out.println(populaEstados.get("PE"));

        System.out.println("\nMostrando os estados na ordem que fora informados ");
        Map<String,Integer> populaEstados2 = new LinkedHashMap<>(){{
             
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
            put("PB",4039277);

        }};

        System.out.println(populaEstados2);

        System.out.println("\nMostrando em ordem alfabética: ");
        Map<String, Integer> populaEstados3 = new TreeMap<>(populaEstados);
        System.out.println(populaEstados3);

        Collection<Integer> populacao = populaEstados.values();
        String EstMaiorPop = "";
        String EstMenorPop = "";
         for(Map.Entry<String,Integer> entry : populaEstados.entrySet() ){
        if (entry.getValue().equals(Collections.max(populacao))) EstMaiorPop = entry.getKey();
        if (entry.getValue().equals(Collections.min(populacao))) EstMenorPop = entry.getKey();                
            }

        System.out.printf("\nExibindo o estado com menor população (%s) e seu respectivo valor (%d)\n",
                EstMenorPop, Collections.min(populacao));     
        System.out.printf("\nExibindo o estado com maior população (%s) e seu respectivo valor (%d)\n",
                EstMaiorPop,Collections.max(populacao));

                int soma = 0;
                Iterator<Integer> iterator = populaEstados.values().iterator();
                while (iterator.hasNext()) {
                    soma += iterator.next();
                }
                System.out.println("\nExiba a soma da pop dos estados " + soma);

                System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populaEstados.size()));
        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populaEstados.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populaEstados);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populaEstados.clear();
        System.out.println(populaEstados);

        System.out.println("\nConfira se a lista está vazia: " + populaEstados.isEmpty());





     }
    }
