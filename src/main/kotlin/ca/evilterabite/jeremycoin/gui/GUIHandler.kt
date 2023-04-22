package ca.evilterabite.jeremycoin.gui

import dev.triumphteam.gui.guis.*
import org.bukkit.entity.Player
import java.lang.NullPointerException
import java.util.*

class GUIHandler {
    private var guiPlayers = mutableMapOf<UUID,BaseGui>()

    fun openGUI(player: Player, gui: Gui) {
        open(player,gui)
    }
    fun openGUI(player: Player, gui: PaginatedGui) {
        open(player,gui)
    }
    fun openGUI(player: Player, gui: ScrollingGui) {
        open(player,gui)
    }
    fun openGUI(player: Player, gui: StorageGui) {
        open(player,gui)
    }

    fun closeGUI(player: Player) {
        if(isGuiPlayer(player)) {
            getGui(player)?.close(player)
            guiPlayers.remove(player.uniqueId)
        }
    }

    private fun open(player: Player, gui: BaseGui) {
        if(isGuiPlayer(player)) {
            closeGUI(player)
        }

        guiPlayers[player.uniqueId] = gui
        gui.open(player)
    }

    private fun getGui(player: Player): BaseGui? {
        val uuid = player.uniqueId
        return guiPlayers[uuid]
    }

    private fun isGuiPlayer(player: Player): Boolean {
        return guiPlayers.contains(player.uniqueId)
    }


}