package widder.playtimetracker.command;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;

public class PlayTime {
    public static int PlayTimeCommand(CommandContext<CommandSourceStack>  context, String player) {

        context.getSource().sendSuccess(() -> Component.literal("PlayTimeCommand " + player), false);


        return 0;
    }
}