package be.vdab.goededoel.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

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
