package br.com.alura.screenmatch.modelos;

public class Series extends Title {

    private int seasons;
    private int episodeBySeason;
    private boolean active;
    private int minutesPerEpisode;

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
}

