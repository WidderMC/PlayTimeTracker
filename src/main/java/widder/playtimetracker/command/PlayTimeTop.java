package widder.playtimetracker.command;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;

public class PlayTimeTop {
    public static int PlayTimeTopCommand(CommandContext<CommandSourceStack> context, int days ) {

        context.getSource().sendSuccess(() -> Component.literal("PlayTimeTopCommand " + days), false);


        return 0;
    }
}