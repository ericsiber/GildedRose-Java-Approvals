package com.gildedrose;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public sealed interface SellableItem permits AgedBrie, BackstagePasses, Conjured, Sulfuras, UndefinedItem {

    int LOWEST_QUALITY = 0;
    int HIGHEST_QUALITY = 50;

    void updateState();

    default void updateSellIn(Item item) {
        item.sellIn -= 1;
    }

    default void updateQuality(Item item, int value, int additionalValueWhenExpired) {
        item.quality += value;
        if (isExpired(item)) {
            item.quality += additionalValueWhenExpired;
        }
        normalizeQuality(item);
    }

    default void normalizeQuality(Item item) {
        item.quality = min(HIGHEST_QUALITY, max(LOWEST_QUALITY, item.quality));
    }

    default boolean isExpired(Item item) {
        return item.sellIn < 0;
    }
}
