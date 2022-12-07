package edu.processoseletivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ModoAleatorio {
    public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {
        List<Integer> copia = new ArrayList<>(musicasTocadas);
        List<Integer> musicasOrdenadas = new ArrayList<>();
        int cont= copia.size();
        while (cont>0){
            musicasOrdenadas.add(Collections.max(copia));
            copia.remove(Collections.max(copia));
            if(cont>=2) {
                musicasOrdenadas.add(Collections.min(copia));
                copia.remove(Collections.min(copia));
            }
            cont = copia.size();
        }
        return musicasOrdenadas;
    }
}
