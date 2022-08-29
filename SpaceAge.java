class SpaceAge {
    private double seconds;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }
    public void setSeconds(double seconds) {
		this.seconds = seconds;
	}

    double onEarth() {
        return Math.round( (this.seconds / getPlanetFactor("Earth")) * 100 )/100.0;
    }

    double onMercury() {
       return Math.round( (this.seconds / getPlanetFactor("Mercury")) * 100 )/100.0;
    }

    double onVenus() {
        return Math.round( (this.seconds / getPlanetFactor("Venus")) * 100 )/100.0;
    }

    double onMars() {
        return Math.round( (this.seconds / getPlanetFactor("Mars")) * 100 )/100.0;
    }

    double onJupiter() {
        return Math.round( (this.seconds / getPlanetFactor("Jupiter")) * 100 )/100.0;
    }

    double onSaturn() {
        return Math.round( (this.seconds / getPlanetFactor("Saturn")) * 100 )/100.0;
    }

    double onUranus() {
        return Math.round( (this.seconds / getPlanetFactor("Uranus")) * 100 )/100.0;
    }

    double onNeptune() {
        return Math.round( (this.seconds / getPlanetFactor("Nepturne")) * 100 )/100.0;
    }
    public double getPlanetFactor(String planete) {
		switch (planete) {
		case "Mercury":
			return 365.25 * 24 * 0.2408467 * 3600;
		case "Venus":
			return 365.25 * 24 * 0.61519726 * 3600;
		case "Earth":
			return 365.25 * 24 * 3600;
		case "Mars":
			return 365.25 * 24 * 1.8808158 * 3600 ;
		case "Jupiter":
			return 365.25 * 24 * 11.862615 * 3600;
		case "Saturn":
			return 365.25 * 24 * 29.447498 * 3600;
		case "Uranus":
			return 365.25 * 24 * 84.016846 * 3600;
		case "Nepturne":
			return 365.25 * 24 * 164.79132 * 3600;

		default:
			throw new IllegalArgumentException("Unexpected value: " + planete);
		}
	}

}
