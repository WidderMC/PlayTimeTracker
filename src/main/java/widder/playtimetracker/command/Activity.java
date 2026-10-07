package widder.playtimetracker.command;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;

public class Activity {
    public static int ActivityCommand(CommandContext<CommandSourceStack> context, String player, int days) {

        context.getSource().sendSuccess(() -> Component.literal("ActivityCommand " + player + " " + days), false);


        return 0;
    }
}