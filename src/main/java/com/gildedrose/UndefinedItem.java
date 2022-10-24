package com.gildedrose;

public final class UndefinedItem implements SellableItem {

    private final Item item;

    public UndefinedItem(Item item) {
        this.item = item;
    }

    public void updateState() {
        updateSellIn(item);
        updateQuality(item, -1, -1);
    }
}
