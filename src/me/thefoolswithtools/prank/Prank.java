package me.thefoolswithtools.prank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Prank extends JavaPlugin {
    public void onEnable() {
        Bukkit.getServer().getLogger().info("Pranker v" + this.getDescription().getVersion() + " has been enabled!");
    }
    public void onDisable() {
        Bukkit.getServer().getLogger().info("Pranker v" + this.getDescription().getVersion() + "has been disabled!");
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("fakeleave")) {
            if (!sender.hasPermission("prank.fakeleave")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                return true;
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Please specify a name!");
                return true;
            }
            Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " left the game.");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("fakejoin")) {
            if (!sender.hasPermission("prank.fakejoin")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                return true;
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Please specify a name!");
                return true;
            }
            Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game.");
            return true;
        }
        Player player = (Player) sender;
        
              if (cmd.getName().equalsIgnoreCase("fakeop")) {
                  if (!sender.hasPermission("prank.fakeop")) {
                      sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                      return true;
                  }
                  if (args.length == 0) {
                      sender.sendMessage(ChatColor.RED + "Please specify a name!");
                      return true;
                  }
                  Player target = Bukkit.getServer().getPlayer(args[0]);
                  if (target == null) {
                      player.sendMessage(ChatColor.RED + "Could not find player!");
                      return true;
                  }
                  target.sendMessage(ChatColor.YELLOW + "You are now op!");
                  return true;
              }
              if (cmd.getName().equalsIgnoreCase("fakedeop")) {
                  if (!sender.hasPermission("prank.fakedeop")) {
                      sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                      return true;
                  }
                  if (args.length == 0) {
                      sender.sendMessage(ChatColor.RED + "Please specify a name!");
                      return true;
                  }
                  Player target = Bukkit.getServer().getPlayer(args[0]);
                  if (target == null) {
                      player.sendMessage(ChatColor.RED + "Could not find player!");
                      return true;
                  }
                  target.sendMessage(ChatColor.YELLOW + "You are no longer op!");
                  return true;
              }
              if (cmd.getName().equalsIgnoreCase("fakefeed")) {
                  if (!sender.hasPermission("prank.fakefeed")) {
                      sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                      return true;
                  }
                  if (args.length == 0) {
                      sender.sendMessage(ChatColor.RED + "Please specify a name!");
                      return true;
                  }
                  Player target = Bukkit.getServer().getPlayer(args[0]);
                  if (target == null) {
                      player.sendMessage(ChatColor.RED + "Could not find player!");
                      return true;
                  }
                  target.sendMessage(ChatColor.GOLD + "Your appetite has been sated.");
                  return true;
              }
              if (cmd.getName().equalsIgnoreCase("fakeheal")) {
                  if (!sender.hasPermission("prank.fakeheal")) {
                      sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                      return true;
                  }
                  if (args.length == 0) {
                      sender.sendMessage(ChatColor.RED + "Please specify a name!");
                      return true;
                  }
                  Player target = Bukkit.getServer().getPlayer(args[0]);
                  if (target == null) {
                      player.sendMessage(ChatColor.RED + "Could not find player!");
                      return true;
                  }
                  target.sendMessage(ChatColor.GOLD + "You have been healed.");
                  return true;
              }
              if (cmd.getName().equalsIgnoreCase("fakeeco")) {
                  if (!sender.hasPermission("prank.fakeeco")) {
                      sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                      return true;
                  }
                  if (args.length == 0) {
                      sender.sendMessage(ChatColor.RED + "Please specify a name!");
                      		return true;
                  }
                  if (args.length == 1) {
                      sender.sendMessage(ChatColor.RED + "Please specify a number!");
                      return true;
                  }
                  Player target = Bukkit.getServer().getPlayer(args[0]);
                  if (target == null) {
                      player.sendMessage(ChatColor.RED + "Could not find player!");
                       return true;
                  }
                  target.sendMessage(ChatColor.GREEN + "$" + args[1] + " has been added to your account.");
                  return true;
                  }
              if (cmd.getName().equalsIgnoreCase("fakechat")) {
                  if (!sender.hasPermission("prank.fakechat")) {
                      sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                      return true;
                  }
                  if (args.length == 0) {
                      sender.sendMessage(ChatColor.RED + "Please specify a name!");
                      return true;
                  }               
                  Player target = Bukkit.getServer().getPlayer(args[0]);
                  if (target == null) {
                      player.sendMessage(ChatColor.RED + "Could not find player!");
                      return true;
                  }
                  if (args.length == 1) {
                      sender.sendMessage(ChatColor.RED + "Please specify text!");
                      return true;
                  }
                  StringBuilder message = new StringBuilder("");
                  for(int i = 1; i < args.length;i++){
                  message.append(args[i]);
                  message.append(" "); //The space at the end won't be visible
                     }
                  target.chat(message.toString());   
                  return true;             
              }
             if (cmd.getName().equalsIgnoreCase("fakeblock")) {
                 if (!sender.hasPermission("prank.fakeblock")) {
                     sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                     return true;
                 }
                 if (args.length == 0) {
                     sender.sendMessage(ChatColor.RED + "Please specify a block!");
                     return true;
                 }
                 if (args.length == 1) {
                     sender.sendMessage(ChatColor.RED + "Please specify a player!");
                     return true;
                 }
                 Player target = Bukkit.getServer().getPlayer(args[1]);
                 if (target == null) {
                     player.sendMessage(ChatColor.RED + "Could not find player!");
                     return true;
                 }
                 target.sendMessage(ChatColor.GOLD + "You can now place " + args[0] + ".");
                 return true;
             }
             if (cmd.getName().equalsIgnoreCase("fakegroup")) {
                 if (!sender.hasPermission("prank.fakegroup")) {
                     sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                     return true;
                 }
                 if (args.length == 0) {
                     sender.sendMessage(ChatColor.RED + "Please specify a group!");
                     return true;
                 }
                 if (args.length == 1) {
                     sender.sendMessage(ChatColor.RED + "Please specify a world!");
                     return true;
                 }
                 if (args.length == 2) {
                     sender.sendMessage(ChatColor.RED + "Please specify a player!");
                     return true;
                 }
                 Player target = Bukkit.getServer().getPlayer(args[2]);
                 if (target == null) {
                     player.sendMessage(ChatColor.RED + "Could not find player!");
                     return true;
                 }
                 target.sendMessage(ChatColor.YELLOW + "You were moved to the group " + args[0] + " in " + args[1] + ".");
                
             }
              return true;
}
}



