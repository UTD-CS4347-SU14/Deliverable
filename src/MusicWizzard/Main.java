/**
 * The University of Texas at Dallas
 * CS 4347.0U1 - Final Project Deliverable
 *
 * The Wizard's Music Shop
 * https://github.com/UTD-CS4347-SU14/Deliverable
 *
 * @author Kristen Williams
 * @author Scarlett Hunt
 * @author Spencer Fusco
 * @author Zack Urben
 */
package MusicWizzard;

import MusicWizzardGUI.*;

public class Main {
    public StoreActivity storeActivity;
    public Inventory inventory;
    public GenreSearchResult genreSearchResult;
    
    public GenreSearch genreSearch;
    public DeliveryResult deliveryResult;
    public Delivery delivery;
    public ArtistSearchResult artistSearchResult;
    public ArtistSearch artistSearch;
    public AlbumnSearchResult albumnSearchResult;
    public AlbumnSearch albumnSearch;

    /**
     * The enumerate values for each view related to this view handler.
     */
    public enum view {
        StoreActivity, Inventory, GenreSearchResult, GenreSearch,
        DeliveryResult, Delivery, ArtistSearchResult, ArtistSearch,
        AlbumnSearchResult, AlbumnSearch
    }

    /**
     * Create our view handler with the default settings.
     */
    public Main() {
        this.storeActivity = new StoreActivity(this);
        this.inventory = new Inventory(this);
        this.genreSearchResult = new GenreSearchResult(this);
        this.genreSearch = new GenreSearch(this);
        this.deliveryResult = new DeliveryResult(this);
        this.delivery = new Delivery(this);
        this.artistSearchResult = new ArtistSearchResult(this);
        this.artistSearch = new ArtistSearch(this);
        this.albumnSearchResult = new AlbumnSearchResult(this);
        this.albumnSearch = new AlbumnSearch(this);
    }

    /**
     * Show the given view.
     *
     * @param v The view to show.
     */
    public void showView(view v) {
        switch (v) {
            case StoreActivity:
                this.storeActivity.setVisible(true);
                break;
            case Inventory:
                this.inventory.setVisible(true);
                break;
            case GenreSearchResult:
                this.genreSearchResult.setVisible(true);
                break;
            case GenreSearch:
                this.genreSearch.setVisible(true);
                break;
            case DeliveryResult:
                this.deliveryResult.setVisible(true);
                break;
            case Delivery:
                this.delivery.setVisible(true);
                break;
            case ArtistSearchResult:
                this.artistSearchResult.setVisible(true);
                break;
            case ArtistSearch:
                this.artistSearch.setVisible(true);
                break;
            case AlbumnSearchResult:
                this.albumnSearchResult.setVisible(true);
            case AlbumnSearch:
                this.artistSearch.setVisible(true);
        }
    }

    /**
     * Hide the given view.
     *
     * @param v The view to hide.
     */
    public void hideView(view v) {
        switch (v) {
            case StoreActivity:
                this.storeActivity.setVisible(false);
                break;
            case Inventory:
                this.inventory.setVisible(false);
                break;
            case GenreSearchResult:
                this.genreSearchResult.setVisible(false);
                break;
            case GenreSearch:
                this.genreSearch.setVisible(false);
                break;
            case DeliveryResult:
                this.deliveryResult.setVisible(false);
                break;
            case Delivery:
                this.delivery.setVisible(false);
                break;
            case ArtistSearchResult:
                this.artistSearchResult.setVisible(false);
                break;
            case ArtistSearch:
                this.artistSearch.setVisible(false);
                break;
            case AlbumnSearchResult:
                this.albumnSearchResult.setVisible(false);
            case AlbumnSearch:
                this.artistSearch.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
