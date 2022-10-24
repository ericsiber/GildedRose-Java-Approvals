package com.gildedrose;

public class UpdatableItemFactory {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String CONJURED = "Conjured Mana Cake";

    public static SellableItem buildFrom(Item item) {
        return switch (item.name) {
            case AGED_BRIE -> new AgedBrie(item);
            case BACKSTAGE_PASSES -> new BackstagePasses(item);
            case SULFURAS -> new Sulfuras(item);
            case CONJURED -> new Conjured(item);
            default -> new UndefinedItem(item);
        };
    }
}
