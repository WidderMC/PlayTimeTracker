package widder.playtimetracker.command;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;

public class LastOnline {
    public static int LastOnlineCommand(CommandContext<CommandSourceStack> context, String player) {

        context.getSource().sendSuccess(() -> Component.literal("LastOnlineCommand " + player), false);


        return 0;
    }
}