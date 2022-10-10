package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;

@UseReporter(DiffReporter.class)
public class GildedRoseApprovalTest {

	@Test
	public void other() {

        Item[] items = new Item[] {
            new Item("foo", 0, 0),
            new Item("bar", 0, 1),
            new Item("qix", 1, 0),
            new Item("flop", 1, 1),
            new Item("boom", 0, 2),
            new Item("qual", 0, 100),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

		Approvals.verifyAll("Items", items);
	}

    @Test
    public void conjured() {

        Item[] items = new Item[] {
            new Item("Conjured Mana Cake", 0, 0),
            new Item("Conjured Mana Cake", 0, 4),
            new Item("Conjured Mana Cake", 0, 2),
            new Item("Conjured Mana Cake", 1, 4),
            new Item("Conjured Mana Cake", 0, 3),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("Items", items);
    }

    @Test
    public void AgedBrie() {

        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0),
            new Item("Aged Brie", 1, 1),
            new Item("Aged Brie", 0, 1),
            new Item("Aged Brie", 0, 49)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("Items", items);
    }

    @Test
    public void Sulfuras() {

        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 2),
            new Item("Sulfuras, Hand of Ragnaros", 1, 50),
            new Item("Sulfuras, Hand of Ragnaros", 1, 1),
            new Item("Sulfuras, Hand of Ragnaros", -1, 50),
            new Item("Sulfuras, Hand of Ragnaros", -1, 49),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("Items", items);

    }

    @Test
    public void backstagePass() {

        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 2),
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50),
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 1),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 1),
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 1),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 1),
            new Item("Backstage passes to a TAFKAL80ETC concert", 6, 1),
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("Items", items);

    }
}
