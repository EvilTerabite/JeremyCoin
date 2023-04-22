package ca.evilterabite.jeremycoin.gui

import dev.triumphteam.gui.guis.Gui
import org.bukkit.entity.Player
import java.util.*

class GUIHandler {
    private var guiPlayers: MutableMap<UUID, Gui> = mutableMapOf();

    fun openGUI(player: Player, gui: Gui) {
        if(!isGuiPlayer(player)) {
            guiPlayers[player.uniqueId] = gui
            gui.open(player)
        }
    }

    fun closeGUI(player: Player) {
        if(isGuiPlayer(player)) {
            guiPlayers[player.uniqueId]?.close(player)
        }
    }

    fun isGuiPlayer(player: Player): Boolean {
        return guiPlayers.keys.contains(player.uniqueId)
    }


}