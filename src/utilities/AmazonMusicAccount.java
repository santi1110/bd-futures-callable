package utilities;

import java.util.Objects;

public class AmazonMusicAccount {
    private final String accountName;
    private final int numOfPlaylists;
    private final String topGenre;

    public AmazonMusicAccount(String accountName, int numOfPlaylists, String topGenre) {
        this.accountName = accountName;
        this.numOfPlaylists = numOfPlaylists;
        this.topGenre = topGenre;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getNumOfPlaylists() {
        return numOfPlaylists;
    }

    public String getTopGenre() {
        return topGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmazonMusicAccount that = (AmazonMusicAccount) o;
        return numOfPlaylists == that.numOfPlaylists &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(topGenre, that.topGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, numOfPlaylists, topGenre);
    }
}
