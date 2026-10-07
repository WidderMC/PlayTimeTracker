package widder.playtimetracker.command;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.Commands;

public class CommandRegistration {
    public static void Registration() {
        CommandRegistrationCallback.EVENT.register((dispatcher, buildContext, selection) -> {
            dispatcher.register(Commands.literal("playtime").executes(context ->
                            PlayTime.PlayTimeCommand(
                                    context,
                                    context.getSource().getPlayer().getName().getString()
                            ))
                    .then(Commands.argument("player", StringArgumentType.word())
                            .executes(context ->
                                    PlayTime.PlayTimeCommand(
                                            context,
                                            StringArgumentType.getString(context, "player")
                                    ))));
            dispatcher.register(Commands.literal("lastonline").executes(context ->
                            LastOnline.LastOnlineCommand(
                                    context,
                                    context.getSource().getPlayer().getName().getString()
                            ))
                    .then(Commands.argument("player", StringArgumentType.word())
                            .executes(context ->
                                    LastOnline.LastOnlineCommand(
                                            context,
                                            StringArgumentType.getString(context, "player")
                                    ))));
            dispatcher.register(Commands.literal("playtimetop").executes(context ->
                            PlayTimeTop.PlayTimeTopCommand(
                                    context,
                                    0
                            ))
                    .then(Commands.argument("days", IntegerArgumentType.integer())
                            .executes(context ->
                                    PlayTimeTop.PlayTimeTopCommand(
                                            context,
                                            IntegerArgumentType.getInteger(context, "days")
                                    ))));
            dispatcher.register(Commands.literal("activity").executes(context ->
                            Activity.ActivityCommand(
                                    context,
                                    context.getSource().getPlayer().getName().getString(),
                                    0
                            ))
                    .then(Commands.argument("player", StringArgumentType.word())
                            .executes(context ->
                                    Activity.ActivityCommand(
                                            context,
                                            StringArgumentType.getString(context, "player"),
                                            0
                                    ))
                            .then(Commands.argument("days", IntegerArgumentType.integer()).executes(context ->
                                    Activity.ActivityCommand(
                                            context,
                                            StringArgumentType.getString(context, "player"),
                                            IntegerArgumentType.getInteger(context, "days")
                                    )))));
            dispatcher.register(Commands.literal("allactivity").executes(context ->
                            AllActivity.AllActivityCommand(
                                    context,
                                    0
                            ))
                    .then(Commands.argument("days", IntegerArgumentType.integer())
                            .executes(context ->
                                    AllActivity.AllActivityCommand(
                                            context,
                                            IntegerArgumentType.getInteger(context, "days")
                                    ))));
            dispatcher.register(Commands.literal("inactive")
                    .then(Commands.literal("kick").then(Commands.argument("player", StringArgumentType.word()).executes(context ->
                            Inactive.InactiveKickCommand(context, StringArgumentType.getString(context, "player")))))
                    .then(Commands.literal("restore").then(Commands.argument("player", StringArgumentType.word()).executes(context ->
                            Inactive.InactiveRestoreCommand(context, StringArgumentType.getString(context, "player")))))
                    .then(Commands.literal("list").executes(context ->
                            Inactive.InactiveListCommand(context))));
        });
    }
}