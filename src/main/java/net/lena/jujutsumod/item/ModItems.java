//this class will ..

package net.lena.jujutsumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lena.jujutsumod.JujutsuMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item CURSED_OBJECT = registerItem("cursed_object", new Item(new Item.Settings()));  //creating new item!!
    public static final Item JINX_CUBE = registerItem("jinx_cube", new Item(new Item.Settings()));  //creating another new item!!

    private static Item registerItem(String name, Item item){   //creating a class/data type for my items (think of the create cat exercise.)
        return Registry.register(Registries.ITEM, Identifier.of(JujutsuMod.MOD_ID, name), item);  //registering the new items
    }

    public static void registerModItems(){    //creating a method so everything in this class be called/used.
        JujutsuMod.LOGGER.info("Registering Mod Items For " + JujutsuMod.MOD_ID); //this gets sent to the log whenever this method is called.

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {    //adding my item to the combat tab
            entries.add(CURSED_OBJECT);
            entries.add(JINX_CUBE);
        });
    }
}
