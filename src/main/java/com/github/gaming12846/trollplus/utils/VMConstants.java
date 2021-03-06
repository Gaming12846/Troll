package com.github.gaming12846.trollplus.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * TrollPlus com.github.gaming12846.trollplus.utils VMConstants.java
 *
 * @author Gaming12846
 */
public final class VMConstants {

    // Plugin prefix
    public static final String PLUGIN_PREFIX = "§8[§l§cTrollPlus§8]§r ";

    // Configuration options
    public static final String CONFIG_CHECK_FOR_UPDATES = "CheckForUpdates";
    public static final String CONFIG_METRICS_ENABLED = "MetricsEnabled";

    public static final String CONFIG_SPAM_MESSAGES = "SpamMessages";

    public static final String CONFIG_SEMI_BAN_MESSAGE_REPLACE = "SemiBanMessageReplace";

    public static final String CONFIG_FAKE_BAN_MESSAGE_BROADCAST_ENABLED = "FakeBanMessageBroadcastEnabled";
    public static final String CONFIG_FAKE_BAN_MESSAGE_PLAYER = "FakeBanMessagePlayer";
    public static final String CONFIG_FAKE_BAN_MESSAGE_BROADCAST = "FakeBanMessagePlayerBroadcast";

    public static final String CONFIG_FAKE_OP_MESSAGE_BROADCAST_ENABLED = "FakeOpMessageBroadcastEnabled";
    public static final String CONFIG_FAKE_OP_MESSAGE = "FakeOpMessage";

    // Permission nodes
    public static final String PERMISSION_RELOAD = "trollplus.reload";

    public static final String PERMISSION_BLOCKLIST_ADD = "trollplus.blocklist.add";
    public static final String PERMISSION_BLOCKLIST_REMOVE = "trollplus.blocklist.remove";

    public static final String PERMISSION_TROLL = "trollplus.troll";

    // Target player
    public static Player TARGET = null;

    // Inventory trollmenu
    public static Inventory TROLLMENU = null;

    // Feature Control
    public static String CONTROL_MESSAGE = null;
    public static Boolean CONTROL_MESSAGE_BOOLEAN = false;
    public static Location CONTROL_PLAYER_LOCATION = null;
    public static ItemStack[] CONTROL_PLAYER_INVENTORY = null;
    public static ItemStack[] CONTROL_PLAYER_ARMOR = null;
    public static ItemStack CONTROL_PLAYER_OFF_HAND_ITEM = null;

    // Features status
    public static String STATUS_VANISH = "§c§lOFF";
    public static String STATUS_FREEZE = "§c§lOFF";
    public static String STATUS_HAND_ITEM_DROP = "§c§lOFF";
    public static String STATUS_CONTROL = "§c§lOFF";
    public static String STATUS_FLIP_BEHIND = "§c§lOFF";
    public static String STATUS_SPAM_MESSAGES = "§c§lOFF";
    public static String STATUS_SPAM_SOUNDS = "§c§lOFF";
    public static String STATUS_SEMI_BAN = "§c§lOFF";
    public static String STATUS_TNT_TRACK = "§c§lOFF";
    public static String STATUS_MOB_SPAWNER = "§c§lOFF";

}