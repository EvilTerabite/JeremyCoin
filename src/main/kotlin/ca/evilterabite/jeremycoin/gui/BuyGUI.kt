package ca.evilterabite.jeremycoin.gui

import dev.triumphteam.gui.components.ScrollType
import dev.triumphteam.gui.guis.Gui
import dev.triumphteam.gui.guis.ScrollingGui
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player

class BuyGUI(player: Player) {
    private val buyGUI = Gui.scrolling(ScrollType.VERTICAL)
        .title(Component.text("Buy Crypto"))
        .rows(3)
        .create()


    init {

    }


    fun getGUI(): ScrollingGui {
        return buyGUI
    }
}