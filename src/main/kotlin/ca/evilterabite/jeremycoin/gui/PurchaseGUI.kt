package ca.evilterabite.jeremycoin.gui

import ca.evilterabite.jeremycoin.JeremyCoin
import dev.triumphteam.gui.guis.Gui
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player
import java.util.UUID

class PurchaseGUI(player: Player) {
    companion object {
        val gui = Gui.gui()
            .title(Component.text("Purchase JeremyCoin"))
            .rows(3)
            .create()
    }

    init {


        //Open the GUI
        JeremyCoin.guiHandler.openGUI(player, gui)
    }
}