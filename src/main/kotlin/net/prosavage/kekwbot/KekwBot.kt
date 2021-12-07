import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.prosavage.kekwbot.listener.MessageListener

fun main(args: Array<String>) {
    println("Starting bot...");
    val JDA = buildBot()

    JDA.addEventListener(MessageListener())

}

fun buildBot(): JDA {
    val token = System.getenv("TOKEN")
    val jda = JDABuilder.createDefault(token).build();
    return jda
}