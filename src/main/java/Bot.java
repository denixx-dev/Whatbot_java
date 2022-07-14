import lombok.Getter;
import lombok.SneakyThrows;

import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class Bot extends DefaultAbsSender{
    public Bot (DefaultBotOptions options){
        super(options);
    }

    @Override
    public String getBotToken(){
        return "5545628779:AAEhnKY7tFj32es0zXAYfjA-nb8y11y6_nU";
    }

    @SneakyThrows
    public static void main(String[] args){
        Bot bot = new Bot(new DefaultBotOptions());
        bot.execute(SendMessage.builder().chatId("962434377").text("It is Java here").build());
    }

}

