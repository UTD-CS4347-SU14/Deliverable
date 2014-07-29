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
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
