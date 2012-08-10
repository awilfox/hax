package hax
import org.jibble.pircbot._
import com.typesafe.config._
import scala.collection.JavaConverters._

object Hax extends App {
  val config = ConfigFactory.load()
  val bot = new Hax(config)
}

/** A Hax bot. Version 2.
  *
  * @constructor Create an instance of Hax
  * @param config A Typesafe config object
  */
class Hax(config: Config) extends PircBot {
  setName(config.getString("bot.nick"))
  setLogin(config.getString("bot.nick"))
  setVerbose(config.getBoolean("bot.verbose"))
  connect(config.getString("bot.server"),
          config.getInt("bot.port"),
          config.getString("bot.password"))
  config.getStringList("bot.autojoin").asScala.foreach(joinChannel)
  val comchar = config.getString("comchar")

  /** Gets called every time a message gets sent to the channel.
    *
    * This is where we handle things like responding to commands.
    *
    * @param channel the channel the message was sent to
    * @param sender the nickname of the person sending the message
    * @param login the ident of the person sending the message
    * @param hostname the hostname/cloak of the person sending the message
    * @param message the message sent to the channel
    */
  override def onMessage(channel: String,
                         sender: String,
                         login: String,
                         hostname: String,
                         message: String) {
    message match {
      case ".time" => sendMessage(channel,
                                 new java.util.Date().toString)
    }
  }
}