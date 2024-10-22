package mariapiabaldoin.giorno_1_17.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Elemento {

    private String nome;
    private int informazioniNutrizionali;
    private double prezzo;


}
