package Lab4;

public class Town implements Comparable<Town> {
    private String name;
    private String county;
    private int population;

    public Town(String name, String county, int population) {
        this.name = name;
        this.county = county;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int compareTo(Town other)
    {
        //compare this.population with other.population
        return Integer.compare(this.population, other.population);
    }

    public String toString() {
        return "Town[" + name + "," + county + "," + population + "]";
    }
}


