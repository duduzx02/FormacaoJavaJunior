package br.com.alura.screenmatch.modelos;

public class Series extends Title {

    private int seasons;
    private int episodeBySeason;
    private boolean active;
    private int minutesPerEpisode;

    public Series(String name, int releaseyear) {
        super(name, releaseyear);
    }


    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodeBySeason() {
        return episodeBySeason;
    }

    public void setEpisodeBySeason(int episodeBySeason) {
        this.episodeBySeason = episodeBySeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return getMinutesPerEpisode() * getSeasons() * getEpisodeBySeason();
    }

    @Override
    public void showedTechnicalSheet(){
        System.out.println("Nome do Serie: " + getName());
        System.out.println("Ano de lançamento: " + getReleaseyear());

    }
}

