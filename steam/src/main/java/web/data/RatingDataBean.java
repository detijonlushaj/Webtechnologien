/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package web.data;

import de.hsh.steam.entities.Genre;
import de.hsh.steam.entities.Rating;
import de.hsh.steam.entities.Score;
import de.hsh.steam.entities.Series;
import de.hsh.steam.entities.Streamingprovider;
import jakarta.enterprise.context.RequestScoped;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author lushaj
 */
@Named(value = "ratingDataBean")
@RequestScoped
public class RatingDataBean {

    private String title;
    private int seasons;
    private int genre;
    private int platform;
    private int score;

    private List<Rating> ratingList;

    /**
     * Creates a new instance of RatingDataBean
     */
    public RatingDataBean() {

    }

    public String getTitle() {
        return this.title;
    }
    
    public int getSeasons(){
        return this.seasons;
    }

    public Genre getGenre() {
        if (genre == 1) {
            return Genre.Thriller;
        }
        if (genre == 2) {
            return Genre.ScienceFiction;
        }
        if (genre == 3) {
            return Genre.Drama;
        }
        if (genre == 4) {
            return Genre.Action;
        }
        if (genre == 5) {
            return Genre.Comedy;
        }
        if (genre == 6) {
            return Genre.Documentary;
        }
        return null;
    }

    public Streamingprovider getStreamingprovider() {
        if (platform == 1) {
            return Streamingprovider.Netflix;
        }
        if (platform == 2) {
            return Streamingprovider.AmazonPrime;
        }
        if (platform == 3) {
            return Streamingprovider.Sky;
        }
        return null;
    }

    public Score getScore() {
        if (genre == 1) {
            return Score.bad;
        }
        if (genre == 2) {
            return Score.mediocre;
        }
        if (genre == 3) {
            return Score.good;
        }
        if (genre == 4) {
            return Score.very_good;
        }
        return null;
    }
    
    public List<Rating> getRatingList(){
        return this.ratingList;
    }
    
    public void setTitle(String s) {
        this.title = s;
    }
    
    public void setSeasons(int i ){
        this.seasons = i;
    }

    public void setGenre(int i ) {
        this.genre = i;

    }

    public void setStreamingprovider(int i) {
        this.platform = i;
    }

    public void setScore(int s) {
        this.score = s;

    }
    
    public void addRatingToList(Rating r){
        this.ratingList.add(r);
    }

}
