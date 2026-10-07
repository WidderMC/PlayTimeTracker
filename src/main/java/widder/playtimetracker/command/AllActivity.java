package widder.playtimetracker.command;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;

public class AllActivity {
    public static int AllActivityCommand(CommandContext<CommandSourceStack> context, int days) {

        context.getSource().sendSuccess(() -> Component.literal("AllActivityCommand " + days), false);


        return 0;
    }
}