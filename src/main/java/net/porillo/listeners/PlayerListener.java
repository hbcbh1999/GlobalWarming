package net.porillo.listeners;

import lombok.AllArgsConstructor;
import net.porillo.GlobalWarming;
import net.porillo.database.tables.PlayerTable;
import net.porillo.objects.GPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@AllArgsConstructor
public class PlayerListener implements Listener {

	private GlobalWarming gw;

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		PlayerTable table = gw.getTableManager().getPlayerTable();

		if (!table.getPlayers().containsKey(event.getPlayer().getUniqueId())) {
			GPlayer player = new GPlayer(event.getPlayer().getUniqueId(), System.currentTimeMillis(), 0);
			table.getPlayers().put(event.getPlayer().getUniqueId(), player);

			//TODO Queue DB player insert
		}
	}
}
