package be.vdab.goededoel.domain;

import java.math.BigDecimal;
import java.util.Objects;

/** * Een <strong>goed doel</strong> waarvoor men geld inzamelt * @author Joe Dalton */
public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;

	/** * Maakt een GoedeDoel object * @param naam De naam van het goede doel */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	/** * Geeft de naam terug * @return de naam */
	public String getNaam() {
		return naam;
	}

	/** * Geeft de opbrengst terug * @return de opbrengst */
	public BigDecimal getOpgebracht() {
		return opgebracht;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GoedeDoel)) return false;
		GoedeDoel goedeDoel = (GoedeDoel) o;
		return Objects.equals(naam, goedeDoel.naam) && Objects.equals(opgebracht, goedeDoel.opgebracht);
	}

	@Override
	public int hashCode() {
		return Objects.hash(naam, opgebracht);
	}
}
