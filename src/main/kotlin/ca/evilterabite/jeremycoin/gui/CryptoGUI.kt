package ca.evilterabite.jeremycoin.gui

import ca.evilterabite.jeremycoin.JeremyCoin
import dev.triumphteam.gui.builder.item.ItemBuilder
import dev.triumphteam.gui.guis.Gui
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.entity.Player

class CryptoGUI(player: Player) {
    private val guiHandler = JeremyCoin.guiHandler;
    private val purchaseGUI = Gui.gui()
        .title(Component.text("Purchase JeremyCoin"))
        .rows(3)
        .create()

    private val buyItem = ItemBuilder.from(Material.EMERALD_BLOCK).name(Component.text("Buy Crypto", NamedTextColor.GREEN)).asGuiItem()
    private val sellItem = ItemBuilder.from(Material.REDSTONE_BLOCK).name(Component.text("Sell Crypto", NamedTextColor.RED)).asGuiItem()
    private val closeItem = ItemBuilder.from(Material.BARRIER).name(Component.text("Close Menu", NamedTextColor.DARK_GRAY)).asGuiItem()

    init {
        //Slot 12: Buy item
        purchaseGUI.setItem(12, buyItem)
        purchaseGUI.addSlotAction(12) {
            guiHandler.openGUI(player, BuyGUI(player).getGUI())
        }
        //Slot 14: Sell item
        purchaseGUI.setItem(14, sellItem)
        purchaseGUI.addSlotAction(14) {
            //TODO: Open sell gui
        }
        //Slot 22: Close item
        purchaseGUI.setItem(22, closeItem)
        purchaseGUI.addSlotAction(22) {
            guiHandler.closeGUI(player)
        }
        //Fill GUI with black stained-glass panes
        purchaseGUI.filler.fill(ItemBuilder.from(Material.BLACK_STAINED_GLASS_PANE).name(Component.empty()).asGuiItem())

        //Open the GUI
        guiHandler.openGUI(player, purchaseGUI)
    }


    fun getGUI(): Gui {
        return purchaseGUI;
    }

    /*
    0 [F] [F] [F] [F] [F] [F] [F] [F] [F] 8
    9 [F] [F] [F] [B] [F] [S] [F] [F] [F] 17
    18 [F] [F] [F] [F] [C] [F] [F] [F] [F] 26
    */
}