package widder.playtimetracker.command;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;

public class Inactive {
    public static int InactiveKickCommand(CommandContext<CommandSourceStack> context, String player) {

        context.getSource().sendSuccess(() -> Component.literal("InactiveKickCommand " + player), false);


        return 0;
    }
    public static int InactiveRestoreCommand(CommandContext<CommandSourceStack> context, String player) {

        context.getSource().sendSuccess(() -> Component.literal("InactiveRestoreCommand " + player), false);


        return 0;
    }
    public static int InactiveListCommand(CommandContext<CommandSourceStack> context) {

        context.getSource().sendSuccess(() -> Component.literal("InactiveListCommand "), false);


        return 0;
    }
}