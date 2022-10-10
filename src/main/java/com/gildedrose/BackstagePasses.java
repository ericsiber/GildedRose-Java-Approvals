package com.gildedrose;

public class BackstagePasses implements SellableItem {

    private final Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    public void updateState() {
        updateSellIn(item);
        updateQuality();
    }

    private void updateQuality() {
        if (item.sellIn < 5) {
            item.quality += 3;
        } else if (item.sellIn < 10) {
            item.quality += 2;
        } else {
            item.quality += 1;
        }
        if (isExpired(item)) {
            item.quality = 0;
        }
        normalizeQuality(item);
    }
}
