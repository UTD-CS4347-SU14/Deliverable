/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MusicWizzard;

import MusicWizzardGUI.*;

/**
 *
 * @author zack
 */
public class Main {
    public StoreActivity storeActivity;
    public Inventory inventory;
    
    public enum view {
        StoreActivity, Inventory
    }
    
    public Main() {
        this.storeActivity = new StoreActivity(this);
        this.storeActivity.setVisible(true);
        
        this.inventory = new Inventory(this);
        this.inventory.setVisible(false);
    }
    
    public void showView(view v) {
        switch(v) {
            case StoreActivity:
                this.storeActivity.setVisible(true);
                break;
            case Inventory:
                this.inventory.setVisible(true);
                break;
        }
    }
    
    public void hideView(view v) {
        switch(v) {
            case StoreActivity:
                this.storeActivity.setVisible(false);
                break;
            case Inventory:
                this.inventory.setVisible(false);
                break;
        }
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
