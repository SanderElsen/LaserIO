package com.direwolf20.laserio.datagen;

import com.direwolf20.laserio.common.LaserIO;
import com.direwolf20.laserio.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.direwolf20.laserio.setup.ModSetup.TAB_NAME;

public class LaserIOLanguageProvider extends LanguageProvider {
    public LaserIOLanguageProvider(DataGenerator gen, String locale) {
        super(gen, LaserIO.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "LaserIO");
        add(Registration.LaserConnector.get(), "Laser Connector");
        add(Registration.LaserNode.get(), "Laser Node");
        add(Registration.Laser_Wrench.get(), "Laser Wrench");
        add(Registration.Card_Item.get(), "Item Card");
        add(Registration.Card_Fluid.get(), "Fluid Card");
        add(Registration.Card_Energy.get(), "Energy Card");
        add(Registration.Filter_Basic.get(), "Basic Filter");
        add(Registration.Filter_Count.get(), "Counting Filter");
        add(Registration.Filter_Tag.get(), "Tag Filter");
        add(Registration.Logic_Chip.get(), "Logic Chip");
        add(Registration.Logic_Chip_Raw.get(), "Raw Logic Chip");
        add(Registration.Overclocker_Card.get(), "Card Overclocker");
        add(Registration.Overclocker_Node.get(), "Node Overclocker");

        add("screen.laserio.extractamt", "Transfer Speed");
        add("screen.laserio.priority", "Priority");
        add("screen.laserio.allowlist", "Allow");
        add("screen.laserio.comparenbt", "NBT");
        add("screen.laserio.lasernode", "Laser Node");

        add("screen.laserio.default", "Default");
        add("screen.laserio.up", "Up");
        add("screen.laserio.down", "Down");
        add("screen.laserio.north", "North");
        add("screen.laserio.south", "South");
        add("screen.laserio.west", "West");
        add("screen.laserio.east", "East");

        add("screen.laserio.extract", "Extract");
        add("screen.laserio.insert", "Insert");
        add("screen.laserio.stock", "Stock (Not Implemented)");

        add("screen.laserio.denylist", "Deny");
        add("screen.laserio.nbttrue", "Match NBT");
        add("screen.laserio.nbtfalse", "Ignore NBT");

        add("message.laserio.wrenchrange", "Connection exceeds maximum range of %d");

        //Card Tooltips
        add("laserio.tooltip.item.show_settings", "Hold shift to show settings");
        add("laserio.tooltip.item.card.mode", "Mode: ");
        add("laserio.tooltip.item.card.channel", "Channel: ");
        add("laserio.tooltip.item.card.mode.EXTRACT", "Extract");
        add("laserio.tooltip.item.card.mode.INSERT", "Insert");
        add("laserio.tooltip.item.card.mode.STOCK", "Stock");
        add("laserio.tooltip.item.card.sneaky", "Sneaky: ");
        add("laserio.tooltip.item.card.sneaky.DOWN", "Down");
        add("laserio.tooltip.item.card.sneaky.UP", "Up");
        add("laserio.tooltip.item.card.sneaky.NORTH", "North");
        add("laserio.tooltip.item.card.sneaky.SOUTH", "South");
        add("laserio.tooltip.item.card.sneaky.WEST", "West");
        add("laserio.tooltip.item.card.sneaky.EAST", "East");

        //Filter Tooltips
        add("laserio.tooltip.item.filter.type", "Type: ");
        add("laserio.tooltip.item.filter.type.allow", "Allow");
        add("laserio.tooltip.item.filter.type.deny", "Deny");
        add("laserio.tooltip.item.filter.nbt", "Match NBT: ");
        add("laserio.tooltip.item.filter.nbt.allow", "True");
        add("laserio.tooltip.item.filter.nbt.deny", "False");

        //add("", "");
    }
}
