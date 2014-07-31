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

    public Sales sales;
    public ReceiptLookUp receiptLookUp;
    public ReceiptDisplay receiptDisplay;
    public PaymentCredit paymentCredit;
    public PaymentCheck paymentCheck;
    public PaymentCash paymentCash;
    public Payment payment;
    public MainMenu mainMenu;

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
        StoreActivity, Sales, ReceiptLookUp, ReceiptDisplay, PaymentCredit,
        PaymentCheck, PaymentCash, Payment, MainMenu, Inventory,
        GenreSearchResult, GenreSearch, DeliveryResult, Delivery,
        ArtistSearchResult, ArtistSearch, AlbumnSearchResult, AlbumnSearch
    }

    /**
     * Create our view handler with the default settings.
     */
    public Main() {
        this.storeActivity = new StoreActivity(this);

        this.sales = new Sales(this);
        this.receiptLookUp = new ReceiptLookUp(this);
        this.receiptDisplay = new ReceiptDisplay(this);
        this.paymentCredit = new PaymentCredit(this);
        this.paymentCheck = new PaymentCheck(this);
        this.paymentCash = new PaymentCash(this);
        this.payment = new Payment(this);
        this.mainMenu = new MainMenu(this);

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
            case Sales:
                this.sales.setVisible(true);
                break;
            case ReceiptLookUp:
                this.receiptLookUp.setVisible(true);
                break;
            case ReceiptDisplay:
                this.receiptDisplay.setVisible(true);
                break;
            case PaymentCredit:
                this.paymentCredit.setVisible(true);
                break;
            case PaymentCheck:
                this.paymentCheck.setVisible(true);
                break;
            case PaymentCash:
                this.paymentCash.setVisible(true);
                break;
            case Payment:
                this.payment.setVisible(true);
                break;
            case MainMenu:
                this.mainMenu.setVisible(true);
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
            case Sales:
                this.sales.setVisible(false);
                break;
            case ReceiptLookUp:
                this.receiptLookUp.setVisible(false);
                break;
            case ReceiptDisplay:
                this.receiptDisplay.setVisible(false);
                break;
            case PaymentCredit:
                this.paymentCredit.setVisible(false);
                break;
            case PaymentCheck:
                this.paymentCheck.setVisible(false);
                break;
            case PaymentCash:
                this.paymentCash.setVisible(false);
                break;
            case Payment:
                this.payment.setVisible(false);
                break;
            case MainMenu:
                this.mainMenu.setVisible(false);
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
