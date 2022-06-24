import android.media.session.MediaSession
import com.jessecorbett.diskord.bot.*
import com.jessecorbett.diskord.util.sendEmbeddedImage
import com.jessecorbett.diskord.util.sendMessage

suspend fun main() {

    bot("iaz386R6RA0sFfXJKpOGB4f1-9sDEd-V") {
        events {
            onGuildMemberAdd {
                channel("989976777923387424").sendMessage("Welcome to the club, @${it.user?.username}! ")
                channel("989976777923387424").addMessageReaction("\"Before we get started, we need to go over some things.\" +\n" +
                        "\"If you're new to discord, I'll teach you some basics now. If you're experienced, look for the " +
                        "message with the next green circle:", emojiText = "green_circle")

                channel("989976777923387424").sendMessage("My name is Autoast, the manager for the Stony Brook Synthetic Biology Society." +
                        "My creator, 2nd president Justin Beutel made me while on the clock at an internship, love to see it. Since you're here, that means you're" +
                        "a new E-board member, congrats! You're the lifeblood of this great club, support it and we thrive, slack and you're gone.")

                channel("989976777923387424").sendMessage("Discord is how we communicate: setup meetings, plan allocations and complain about classes." +
                        "You have to learn discord if you hope to succeed here. Look to the left of your screen, you should some circular icons left-most, and a ton of text" +
                        "to the right of that.")
                channel("989976777923387424").sendEmbeddedImage("Shown here are Servers, these are discrete places where you talk to people. Synthetic Biology" +
                        "is its own server, as Biochemistry Society is its own server as well. Circled in red is our server, if you want to talk to me or the E-board, this is " +
                        "how you do so. You can enter a server by clicking on the icon.","server.png" ,)


            }

        }
    }


}
