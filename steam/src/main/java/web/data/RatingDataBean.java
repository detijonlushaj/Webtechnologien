/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package web.data;

import de.hsh.steam.entities.Genre;
import de.hsh.steam.entities.Rating;
import de.hsh.steam.entities.Score;
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

    private String title = null;
    private int seasons = 0;
    private int genre = 10;
    private int streamingprovider = 10;
    private int score = 10;

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
        if (genre == 0) {
            return Genre.Thriller;
        }
        if (genre == 1) {
            return Genre.ScienceFiction;
        }
        if (genre == 2) {
            return Genre.Drama;
        }
        if (genre == 3) {
            return Genre.Action;
        }
        if (genre == 4) {
            return Genre.Comedy;
        }
        if (genre == 5) {
            return Genre.Documentary;
        }
        return null;
    }

    public Streamingprovider getStreamingprovider() {
        if (streamingprovider == 0) {
            return Streamingprovider.Netflix;
        }
        if (streamingprovider == 1) {
            return Streamingprovider.AmazonPrime;
        }
        if (streamingprovider == 2) {
            return Streamingprovider.Sky;
        }
        return null;
    }

    public Score getScore() {
        if (score == 0) {
            return Score.bad;
        }
        if (score == 1) {
            return Score.mediocre;
        }
        if (score == 2) {
            return Score.good;
        }
        if (score == 3) {
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
        this.streamingprovider = i;
    }

    public void setScore(int s) {
        this.score = s;

    }
    
    public void addRatingToList(Rating r){
        this.ratingList.add(r);
    }

    public void clearList(){
        this.ratingList.clear();
    }
}