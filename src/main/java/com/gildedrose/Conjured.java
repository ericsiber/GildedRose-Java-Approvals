package com.gildedrose;

public final class Conjured implements SellableItem {

    private final Item item;

    public Conjured(Item item) {
        this.item = item;
    }

    public void updateState() {
        updateSellIn(item);
        updateQuality(item, -2, -2);
    }
}
