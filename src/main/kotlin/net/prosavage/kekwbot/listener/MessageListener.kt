package net.prosavage.kekwbot.listener

import net.dv8tion.jda.api.entities.Emote
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.message.author.isBot || (event.message.author.idLong != 350817394014552074 )) {
            return
        }

        println("Cody messaged ${event.message.contentRaw}")
//        val clownEmote = event.guild.getEmotesByName("clown", false);
        event.message.addReaction("U+1F921").queue()
    }

}