/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package web.event;

import de.hsh.steam.entities.Genre;
import de.hsh.steam.entities.Rating;
import de.hsh.steam.entities.Score;
import de.hsh.steam.entities.Series;
import de.hsh.steam.entities.Streamingprovider;
import de.hsh.steam.services.SteamService;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import javax.inject.Named;
import web.data.RatingDataBean;

/**
 *
 * @author lushaj
 */
@Named(value = "ratingEventNavigator")
@RequestScoped
public class RatingEventNavigator {

    SteamService steamservice = SteamService.getInstance();

    
    /**
     * Creates a new instance of RatingEventNavigator
     */
    public RatingEventNavigator() {
    }
    
    public void find(RatingDataBean ratingDataBean){ 
        
//        ArrayList<Series> series = steamservice.search(, ratingDataBean., platform, score);
        
//        for (Series s : series){
//            
//        }}
    }
    
    public void addSeries(RatingDataBean ratingDataBean){
        
    }
    
}
