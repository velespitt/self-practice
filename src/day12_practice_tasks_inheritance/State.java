package day12_practice_tasks_inheritance;

class Virginia extends State {

    public Virginia(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("Virginia", abbreviation, politicalParty, governor, senator, population);
    }

}

class California extends State{

    public California( String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("California", abbreviation, politicalParty, governor, senator, population);
    }
}

class Texas extends State{

    public Texas(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("Texas", abbreviation, politicalParty, governor, senator, population);
    }
}

class Florida extends State{

    public Florida(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("Florida", abbreviation, politicalParty, governor, senator, population);
    }
}

class StateClients{
    public static void main(String[] args) {
        Florida florida = new Florida("Bilmiyorum","Sagci","AKP","Erdogan",80_000_000);
        System.out.println(florida);
    }
}


public class State {

    public String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation != null && !abbreviation.trim().isEmpty()) {
            this.abbreviation = abbreviation;
        }
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor != null && !governor.trim().isEmpty()) {
            this.governor = governor;
        }
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty != null && !politicalParty.trim().isEmpty()) {
            this.politicalParty = politicalParty;
        }
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator != null && !senator.trim().isEmpty()) {
            this.senator = senator;
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population > 0)
            this.population = population;
        else {
            return;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalPart='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
