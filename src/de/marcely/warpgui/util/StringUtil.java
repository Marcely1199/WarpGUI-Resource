/**
* Adds a GUI for the essentials command /warp
* https://www.spigotmc.org/resources/essentials-warp-gui-opensource.13571/
*
* @author  Marcely1199
* @website https://marcely.de/ 
*/

package de.marcely.warpgui.util;

import org.bukkit.ChatColor;

public class StringUtil {
	
	public static String formattedChatColorStringToReadable(String str){
		for(ChatColor c:ChatColor.values())
			str = str.replace("" + c, "&" + c.getChar());
		
		return str;
	}
	
	public static String readableStringToFormattedChatColor(String str){
		for(ChatColor c:ChatColor.values())
			str = str.replace("&" + c.getChar(), "" + c);
		
		return str;
	}
}