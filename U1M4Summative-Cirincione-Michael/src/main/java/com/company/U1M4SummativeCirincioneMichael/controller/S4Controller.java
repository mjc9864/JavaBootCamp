package com.company.U1M4SummativeCirincioneMichael.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.company.U1M4SummativeCirincioneMichael.model.*;

import java.util.ArrayList;

import java.util.Random;

@RestController
public class S4Controller {


    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public QuoteObject quoteOfTheDay() {

        QuoteObject myQuote1 = new QuoteObject();
        QuoteObject myQuote2 = new QuoteObject();
        QuoteObject myQuote3 = new QuoteObject();
        QuoteObject myQuote4 = new QuoteObject();
        QuoteObject myQuote5 = new QuoteObject();
        QuoteObject myQuote6 = new QuoteObject();
        QuoteObject myQuote7 = new QuoteObject();
        QuoteObject myQuote8 = new QuoteObject();
        QuoteObject myQuote9 = new QuoteObject();
        QuoteObject myQuote10 = new QuoteObject();

        myQuote1.setQuote("Be yourself; everyone else is already taken.");
        myQuote1.setAuthor("― Oscar Wilde");

        myQuote2.setQuote("Two things are infinite: the universe and human stupidity; " +
                "and I'm not sure about the universe.");
        myQuote2.setAuthor("― Albert Einstein");

        myQuote3.setQuote("So many books, so little time.");
        myQuote3.setAuthor("― Frank Zappa");

        myQuote4.setQuote("A room without books is like a body without a soul.");
        myQuote4.setAuthor("― Marcus Tullius Cicero");

        myQuote5.setQuote("You only live once, but if you do it right, once is enough.");
        myQuote5.setAuthor("― Mae West");

        myQuote6.setQuote("Be the change that you wish to see in the world.");
        myQuote6.setAuthor("― Mahatma Gandhi");

        myQuote7.setQuote("In three words I can sum up everything I've learned about life: it goes on.");
        myQuote7.setAuthor("― Robert Frost");

        myQuote8.setQuote("To live is the rarest thing in the world. Most people exist, that is all.");
        myQuote8.setAuthor("― Oscar Wilde");

        myQuote9.setQuote("Always forgive your enemies; nothing annoys them so much.");
        myQuote9.setAuthor("― Oscar Wilde");

        myQuote10.setQuote("Without music, life would be a mistake.");
        myQuote10.setAuthor("― Friedrich Nietzsche");

        ArrayList<QuoteObject> myList = new ArrayList<>();
        myList.add(myQuote1);
        myList.add(myQuote2);
        myList.add(myQuote3);
        myList.add(myQuote4);
        myList.add(myQuote5);
        myList.add(myQuote6);
        myList.add(myQuote7);
        myList.add(myQuote8);
        myList.add(myQuote9);
        myList.add(myQuote10);
        Random quote = new Random();
        QuoteObject randomQuote = myList.get(quote.nextInt(10));

        return randomQuote;
    }


    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public DefinitionObject wordOfTheDay() {
        DefinitionObject myWord1 = new DefinitionObject();
        DefinitionObject myWord2 = new DefinitionObject();
        DefinitionObject myWord3 = new DefinitionObject();
        DefinitionObject myWord4 = new DefinitionObject();
        DefinitionObject myWord5 = new DefinitionObject();
        DefinitionObject myWord6 = new DefinitionObject();
        DefinitionObject myWord7 = new DefinitionObject();
        DefinitionObject myWord8 = new DefinitionObject();
        DefinitionObject myWord9 = new DefinitionObject();
        DefinitionObject myWord10 = new DefinitionObject();

        myWord1.setWord("Clock");
        myWord1.setDefinition("a mechanical or electrical device for measuring time, indicating hours, " +
                "minutes, and sometimes seconds, " +
                "typically by hands on a round dial or by displayed figures.");

        myWord2.setWord("Tower");
        myWord2.setDefinition("a tall, narrow building," +
                " either freestanding or forming part of a building such as a church or castle.");

        myWord3.setWord("Cat");
        myWord3.setDefinition("a small domesticated carnivorous mammal with soft fur," +
                " a short snout, and retractable claws. It is widely" +
                " kept as a pet or for catching mice, and many breeds have been developed.");

        myWord4.setWord("Dog");
        myWord4.setDefinition("a domesticated carnivorous mammal that typically has " +
                "a long snout, an acute sense of " +
                "smell, nonretractable claws, and a barking, howling, or whining voice.");

        myWord5.setWord("Earth");
        myWord5.setDefinition( "the planet on which we live; the world." + "the substance of the land surface; soil.");

        myWord6.setWord("Air");
        myWord6.setDefinition("the invisible gaseous substance" +
                " surrounding the earth, a mixture mainly of oxygen and nitrogen.");

        myWord7.setWord("Fire");
        myWord7.setDefinition("combustion or burning, in which substances combine " +
                "chemically with oxygen from the " +
                "air and typically give out bright light, heat, and smoke.");

        myWord8.setWord("Water");
        myWord8.setDefinition("a colorless, transparent, odorless liquid " +
                "that forms the seas, lakes, rivers, and rain" +
                " and is the basis of the fluids of living organisms.");

        myWord9.setWord("Metal");
        myWord9.setDefinition("a solid material that is typically hard," +
                " shiny, malleable, fusible, and " +
                "ductile, with good electrical and thermal conductivity");

        myWord10.setWord("Gravity");
        myWord10.setDefinition("the force that attracts a body toward the" +
                " center of the earth," +
                " or toward any other physical body having mass.");

        ArrayList<DefinitionObject> myWord = new ArrayList<>();
        myWord.add(myWord1);
        myWord.add(myWord2);
        myWord.add(myWord3);
        myWord.add(myWord4);
        myWord.add(myWord5);
        myWord.add(myWord6);
        myWord.add(myWord7);
        myWord.add(myWord8);
        myWord.add(myWord9);
        myWord.add(myWord10);

        Random word = new Random();
        DefinitionObject randomWord = myWord.get(word.nextInt(10));

        return randomWord;


    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)

        public AnswerObject magic8Ball (@RequestBody AnswerObject question){
            AnswerObject fortune1 = new AnswerObject();
            AnswerObject fortune2 = new AnswerObject();
            AnswerObject fortune3 = new AnswerObject();
            AnswerObject fortune4 = new AnswerObject();
            AnswerObject fortune5 = new AnswerObject();
            AnswerObject fortune6 = new AnswerObject();

            ArrayList<AnswerObject> fortune = new ArrayList<>();
            fortune1.setAnswer("Yes");
            fortune2.setAnswer("No");
            fortune3.setAnswer("Maybe");
            fortune4.setAnswer("It is certain");
            fortune5.setAnswer("Try again");
            fortune6.setAnswer("Ask again later");

            Random randomFortune = new Random();
            fortune.add(fortune1);
            fortune.add(fortune2);
            fortune.add(fortune3);
            fortune.add(fortune4);
            fortune.add(fortune5);
            fortune.add(fortune6);
            AnswerObject answer = fortune.get(randomFortune.nextInt(5));
            answer.setQuestion(question.getQuestion());

            return answer;
        }
    }
