/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools   Templates
 * and open the template in the editor.
 */
package lexico;

/**
 *
 * @author Master
 */
public class Token {
        public TiposEspañol getTipoE() {
        return tipoE;
    }

    public void setTipoE(TiposEspañol tipo) {
        this.tipoE = tipo;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }
            public TiposGuna getTipoG() {
        return tipoG;
    }

    public void setTipoG(TiposGuna tipo) {
        this.tipoG = tipo;
    }

    public String getValor() {
        return valor;
    }
    
    private TiposEspañol tipoE;
    private TiposGuna tipoG;
    private String valor;

enum TiposEspañol {
        CLAVEDATOSPERSONALES_E ("^(cuál|dónde)$"),
        CLAVEANTECEDENTES_E ("^(ha)$"),
        CLAVEHABITOSTOXICOS_E ("^(consume)$"),
        CLAVEEMBARAZO_E ("^(cuándo|cuántos)$"),
        CLAVEALIMENTACION_E ("^(come|bebe)$"),
        CLAVEESTADOANIMO_E ("^(posee)$"),
        VERBO_E ("^(es|vive|padecido|sido|fue|hizo|tiene|tenido|pariste)$"),
        ADJETIVO_E ("^(su|tu|arterial|hospitalizado|otra|otras|fritos)$"),
        SUSTANTIVO_E ("^(nombre|cédula|fecha|nacimiento|edad|hipertensión|diabetes|obesidad|asma|tuberculosis|cáncer|vómito|dolor|estómago|cabeza|garganta|huesos|mano|fiebre|nariz|mareo|enfermedad|mandíbula|comezón|diarrea|sangre|cigarrillos|alcohol|drogas|periodo|papanicolaou|casa|hospital|hijos|niños|alimentos|frutas|vegetales|azúcar|vasos|agua|fatiga|depresión|tristeza)$"),
        PREPOSICION_E ("^(de|en|con)$"),
        CONJUNCION_E ("^(o|y)$"),
        ARTICULO_E ("^(la|el)$"),
        PRONOMBRE_E ("^(se)$"),
        NUMERO_E ("^(0|[1-9][0-9]*)$"),
        ADVERBIO_E ("^(último|diariamente|diarios|mucha|menos)$"),
        CONTRACCION_E ("^(al)$"),
        SIGNO_DE_INTERROGACIÓNA_E("[¿]"),
        SIGNO_DE_INTERROGACIÓNC_E("[?]"),
        TOKEN_INVALIDO("Invalido");
        public final String patron;
        TiposEspañol(String s) {
            this.patron = s;
        }
    }
        enum TiposGuna {
        CLAVEDATOSPERSONALES_G ("^(iggi|bia|sana)$"),
        CLAVEANTECEDENTES_G ("^(be)$"),
        CLAVEHABITOSTOXICOS_G ("^(gobed)$"),
        CLAVEEMBARAZO_G ("^(ingu|mimmigan)$"),
        CLAVEALIMENTACION_G ("^(masgunned)$"),
        CLAVEESTADOANIMO_G ("^(niggued)$"),
        VERBO_G ("^(es|gudii|nigga|niggusa|war|arbi|dagsa|imagsa|warabbi|niggusa)$"),
        ADJETIVO_G ("^(ee|abe|baled|gannar|baid|masdibyaled)$"),
        SUSTANTIVO_G ("^(benuga|bigwa|cédula|gwalulesa|birga|abossi|baabag|aged|nunmagge|saban|sagla|uelesa|suusuu|uggaaimagged|sigali|sisa|igar|pap|osbidalgi|neggi|masi|sabbidurba|dulemas|ossi|isbe|sole|geggued)$"),
        ADVERBIO_G ("^(nabbi|banebane|banebane|nagege|issee)$"),
        SIGNO_DE_INTERROGACIÓNA_G("[¿]"),
        SIGNO_DE_INTERROGACIÓNC_G("[?]"),
        TOKEN_INVALIDO("Invalido");
        public final String patron;
        TiposGuna(String s) {
            this.patron = s;
        }
    }
}
