package com.gildedrose;

public class AgedBrie implements SellableItem {

    private final Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    public void updateState() {
        updateSellIn(item);
        updateQuality(item, 1, 1);
    }
}
