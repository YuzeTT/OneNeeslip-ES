package com.uzett.oneneeslip.es.plugins

import com.uzett.oneneeslip.es.BotConfig
import net.mamoe.mirai.Bot
import net.mamoe.mirai.event.subscribeGroupMessages
import net.mamoe.mirai.utils.ExternalResource.Companion.sendAsImageTo
import java.io.File
import java.nio.charset.Charset
import java.nio.file.Paths

fun Bot.img() {
    eventChannel.subscribeGroupMessages {
//        Regex("""^-(帮助|help)$""") matching regex@{
//        }
        case ("#imgtest", trim = true, ignoreCase = true) {
            //File("C:\\Users\\Him18\\Desktop\\$filename").sendAsImageTo(subject)
            //writeFile("test","./")

            File("${BotConfig.path}\\src\\main\\resources\\q.png").sendAsImageTo(subject)
        }


    }
}

fun writeFile(text: String, destFile: String) {
    val f = File(destFile)
    if (!f.exists()) {
        f.createNewFile()
    }
    f.writeText(text, Charset.defaultCharset())
}