import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    static Scanner scnr = new Scanner(System.in);
    static String firstName = "?";
    static String lastName = "?";
    static int age = 0;
    static String party = "?";
    static String position = "?";
    static String gender = "?";
    static int debate1PrepLevel = 0;
    static ArrayList<String> democrats = new ArrayList<String>(Arrays.asList("Kanye West",
            "Chelsea Clinton", "Elizabeth Warren", "Joe Biden", "Francis Underwood"));
    static ArrayList<String> republicans = new ArrayList<String>(Arrays.asList("Jeb! Bush",
            "Paul Ryan", "The Ghost of Ronald Reagan", "Ivanka Trump", "Pepe the Frog"));
    static ArrayList<String> independents = new ArrayList<String>(
            Arrays.asList("Bernie Sanders", "Vermin Supreme", "Bucky Badger", "Jesus Christ"));
    public static void main(String[] args)
    {
        println("This is a work in progress; the democrat path is the only one that works so far.");
        
        println("THE YEAR IS 2024. AMERICA IS IN CHAOS. THE CANDIDATES ARE TERRIBLE. ONLY YOU CAN SAVE AMERICA BY BECOMING THE NEXT PRESIDENT.");
        println("ENTER YOUR FIRST NAME: ");
        firstName = scnr.nextLine();
        println("ENTER YOUR LAST NAME: ");
        lastName = scnr.nextLine();
        println("ENTER YOUR GENDER: M OR F?");
        gender = scnr.nextLine();
        while (!(gender.equalsIgnoreCase("M")) && !(gender.equalsIgnoreCase("F")))
        {
            println("Sorry, President Trump amended the Constitution allowing only two genders to run for President. Pick your closest gender to run: M or F?");
            gender = scnr.nextLine();
        }
        if (gender.equalsIgnoreCase("M"))
        {
            println("Hello Mr. " + lastName + ". Welcome to the 2024 Election. How old are you?");
        } else if (gender.equalsIgnoreCase("F"))
        {
            println("Hello Madame " + lastName
                    + ". Welcome to the 2024 Election. How old are you?");
        }

        age = scnr.nextInt();
        scnr.nextLine();
        if (age < 35)
        {
            println("Normally, you'd be too young to run for President. But the country needs you so badly that we'll let you run anyway.");
            println("Now, what party will you be joining? Type D for Democrat, R for Republican, or I for Independent.");
        } else if (age > 90)
        {
            println("You'll probaby be dead before you get into office so you better pick a good VP!");
            println("Now, what party will you be joining? Type D for Democrat, R for Republican, or I for Independent.");
        } else
        {
            println("Perfect. Now, what party will you be joining? Type D for Democrat, R for Republican, or I for Independent.");
        }
        party = scnr.nextLine();
        while(!(party.equalsIgnoreCase("D")) && !(party.equalsIgnoreCase("R")) && !(party.equalsIgnoreCase("I")))
        {
            println("Sorry, President Trump deported all of the other parties. Pick D, R, or I");
            party = scnr.nextLine();
        }
        if (party.equalsIgnoreCase("D"))
        {
            println("Welcome to the Democrats you liberal commie! You are joining the legendary candidates "
                    + democrats.get(0) + ", " + democrats.get(1) + ", " + democrats.get(2) + ", "
                    + democrats.get(3) + ", " + "and " + democrats.get(4) + ".");
            democrats.add(firstName + " " + lastName);
        } else if (party.equalsIgnoreCase("R"))
        {
            println("Welcome to the Republicans you racist, sexist, bigot! You are joining the legendary candidates "
                    + republicans.get(0) + ", " + republicans.get(1) + ", " + republicans.get(2)
                    + ", " + republicans.get(3) + ", and " + republicans.get(4) + ".");
            republicans.add(firstName + " " + lastName);
        } else if (party.equalsIgnoreCase("I"))
        {
            println("Why do you have to be different? Welcome to the independents, I guess. You are joining the legendary candidates "
                    + independents.get(0) + ", " + independents.get(1) + ", " + independents.get(2)
                    + ", and " + independents.get(3) + ".");
            independents.add(firstName + " " + lastName);
        }
        println("Now, what was your previous government position? Ex: Senator, Governor, etc. If none, just type Mr. or Madame");
        position = scnr.nextLine();
        println("Okay, the race has officially begun. Your first debate with your party is tomorrow! How do you prepare? Do you sleep, party, or practice?");
        String choice1 = scnr.nextLine();
        while(!(choice1.equalsIgnoreCase("sleep")) && !(choice1.equalsIgnoreCase("party")) && !(choice1.equalsIgnoreCase("practice")))
        {
            println("Error: you must pick one of three options: sleep, party, or practice?");
        }
        if(choice1.equalsIgnoreCase("sleep"))
        {
            debate1PrepLevel = 2;
        }
        else if(choice1.equalsIgnoreCase("practice"))
        {
            debate1PrepLevel = 3;
        }
        else if(choice1.equalsIgnoreCase("party"))
        {
            debate1PrepLevel = 1;
        }
        debate1();
    }

    public static void println(String print)
    {
        System.out.println(print);
    }
    
    public static void debate1()
    {
        int score = 0;
        String choice = "?";
        if(debate1PrepLevel == 1)
        {
            println("Hmmm.... not the best choice. Good luck tomorrow, you'll need it.");
            println("......................................................................................................................................................................");
            if(party.equalsIgnoreCase("D"))
            {
                println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Democratic primary debate for the 2024 Election! Our candidates are: ");
                for(int i = 0; i < democrats.size(); i++)
                {
                    System.out.println(democrats.get(i));
                }
                Utility.pause(5000);
                println("We'll have our candidates read out their opening statements. We'll start out with you, Kanye.");
                Utility.pause(5000);
                println("KANYE: To the good people of America, I promise to give you all a 20% discount on all of my Yeezy merch.");
                Utility.pause(5000);
                println("I believe that with everyone rocking Yeezys, we will all enjoy life just that much better.");
                Utility.pause(5000);
                println("Vote for me, and I'll be better than everyone else here.");
                Utility.pause(5000);
                println("CHELSEA: As a woman, and the daughter of the woman who was robbed of being the first woman president, you should vote for me.");
                Utility.pause(5000);
                println("You would all make history, and so would I, being the first woman president of these United States. Vote for me!");
                Utility.pause(5000);
                println("ELIZABETH: My fellow Americans, the previous administration has caused this country to fall into chaos.");
                Utility.pause(5000);
                println("I think that this country needs someone strong, and experienced to get back on track. So, please vote for me.");
                Utility.pause(5000);
                println("JOE: I regret not running for president so long ago. Everyone was asking me to run against Trump, because no one liked Hillary.");
                Utility.pause(5000);
                println("I want to repent for my sins; by becoming your next president. Only I can set this country back on the right path.");
                Utility.pause(5000);
                println("FRANK: My fellow Americans: none of your leaders have been able to effectively run this country. You need someone who is willing");
                println("to do what is necessary to do the right thing. Your leaders are spineless, as are the rest of the candidates in this room.");
                Utility.pause(5000);
                println("I'm not gonna stand here and beg for your vote. I trust that you will simply do the right thing.");
                Utility.pause(5000);
                println("BLITZER: Now, onto our last and possibly most hyped up candidate, " + position + " " + lastName + ":");
                Utility.pause(5000);
                println("Will you be passive, or aggressive?");
                choice = scnr.nextLine();
                while (!(choice.equalsIgnoreCase("passive")) && !(choice.equalsIgnoreCase("aggressive")))
                {
                    println("Error: pick either passive or aggressive.");
                    choice = scnr.nextLine();
                }
                if(choice.equalsIgnoreCase("passive"))
                {
                    println(firstName.toUpperCase() + ": Hello, I think that I will be a very good president. Please vote for me.");
                    score += 1;
                }
                else if(choice.equalsIgnoreCase("aggressive"))
                {
                    println(firstName.toUpperCase() + ": Good evening everyone. All of the other candidates here suck! I'm the best! VOTE FOR ME!");
                }
                Utility.pause(5000);
                println("BLITZER: Okay then. Now onto the first question. " + position + " " + lastName + ", most people in America think you are the ideal candidate. How do you respond?");
                println("Selfish or selfless?");
                choice = scnr.nextLine();
                while (!(choice.equalsIgnoreCase("selfish")) && !(choice.equalsIgnoreCase("selfless")))
                {
                    println("Error: pick either selfish or selfless");
                    choice = scnr.nextLine();
                }
                if(choice.equalsIgnoreCase("selfish"))
                {
                    println(firstName.toUpperCase() + ": Well, obviously I'm the best one here. It's no contest. I'm just the best candidate. Bigly.");
                    Utility.pause(5000);
                    println("CHELSEA: Look everyone, he sounds just like the current president. Will he really be any different?");
                    Utility.pause(5000);
                    println("BLITZER: Hold on Mrs. Clinton, it's not your turn.");
                }
                else if(choice.equalsIgnoreCase("selfless"))
                {
                    println(firstName.toUpperCase() + ": I'd have to thank them very much. I personally don't think of myself that high, but I guess it's true.");
                    Utility.pause(5000);
                    println("KANYE: You have the largest ego of anyone I've ever seen. Calm it down, jeez");
                    Utility.pause(5000);
                    println("BLITZER: Mr. West, don't speak out of turn.");
                    score += 1;
                }
                println("Next question: Mr. Underwood, what is your response to people's allegations that you are a fake persona?");
                Utility.pause(5000);
                println("FRANK: That is simply false. I do not understand how anyone could possibly believe that. It is fake news and just outrageous.");
                Utility.pause(5000);
                println("       Do you interrupt? Y or N");
                choice = scnr.nextLine();
                while (!(choice.equalsIgnoreCase("y")) && !(choice.equalsIgnoreCase("n")))
                {
                    println("Error: pick either Y or N.");
                    choice = scnr.nextLine();
                }
                if(choice.equalsIgnoreCase("Y"))
                {
                    println(firstName.toUpperCase() + ": Ha, that's just wrong. We all know he's a fake persona.");
                    Utility.pause(5000);
                    println("FRANK: Do you have any evidence? Or are you just spouting nonsense as always?");
                    Utility.pause(5000);
                    println(firstName.toUpperCase() + ": Um, not at the moment. Sorry, my bad.");
                    Utility.pause(5000);
                    println("FRANK: That's exactly what I thought.");
                    score -= 1;
                }
                Utility.pause(5000);
                println("BLITZER: Okay, final question. Mrs. Warren, what makes you think you are right for this position?");
                Utility.pause(5000);
                println("ELIZABETH: Well, as a Senator, I have plenty of experience working in the government and with Congress.");
                Utility.pause(5000);
                println("I will serve the American people the best out of everyone here. That's what matters most.");
                Utility.pause(5000);
                println("BLITZER: Okay, that's all for today folks. As we have ran out of time and there are so many candidates, no final statements will happen tonight.");
                Utility.pause(5000);
                println("Goodnght America, and see you in the next debate.");
            }
            if(party.equalsIgnoreCase("R"))
            {
                println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Republican primary debate for the 2024 Election! Our candidates are: ");
                for(int i = 0; i < republicans.size(); i++)
                {
                    System.out.println(republicans.get(i));
                }
                Utility.pause(5000);
                println("We'll have our candidates read out their opening statements. We'll start out with you, Jeb!");
                Utility.pause(5000);
                println("JEB!: Hello America. If I become president, you'll all get free guac bowls courtesy of Jeb! Guac Bowls Inc.");
                Utility.pause(5000);
                println("Honestly, guac will bring everyone toegther and we will all be much happier");
                Utility.pause(5000);
                println("PAUL: Wow, last time I was running as a Vice President, and now I'm all the way up here!");
                Utility.pause(5000);
                println("I have so much experience, as Speaker of the House and other things. I would do a very good job as president.");
                Utility.pause(5000);
                println("RONALD: My fellow Americans, I have returned from beyond the grave to put all of you back on track.");
                Utility.pause(5000);
                println("I have much previous experience, being president before. As I have returned from death, I have 8 more years to be president. It still works.");
                Utility.pause(5000);
                println("IVANKA: Good evening everyone. My father is a great man, and I have learned much from him. Sitting in on meetings and talking to politicians");
                Utility.pause(5000);
                println("makes me the best potential candidate for president. With the experience and perspective I have, there can be no one else.");
                Utility.pause(5000);
                println("PEPE: REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                Utility.pause(5000);
                println("BLITZER: Now, onto our last and possibly most hyped up candidate, " + position + " " + lastName + ":");
            }
            if(party.equalsIgnoreCase("I"))
            {
                println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Independent primary debate for the 2024 Election! Our candidates are: ");
                for(int i = 0; i < independents.size(); i++)
                {
                    System.out.println(independents.get(i));
                }
            }
        }
        else if(debate1PrepLevel == 2)
        {
           println("Sleeping is always a good choice. You'll need your rest for your big day tomorrow.");
           println("......................................................................................................................................................................");
           if(party.equalsIgnoreCase("D"))
           {
               println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first democratic primary debate for the 2024 Election! Our candidates are: ");
               for(int i = 0; i < democrats.size(); i++)
               {
                   System.out.println(democrats.get(i));
               }
               Utility.pause(5000);
               println("We'll have our candidates read out their opening statements. We'll start out with you, Kanye.");
               Utility.pause(5000);
               println("KANYE: To the good people of America, I promise to give you all a 20% discount on all of my Yeezy merch.");
               Utility.pause(5000);
               println("I believe that with everyone rocking Yeezys, we will all enjoy life just that much better.");
               Utility.pause(5000);
               println("Vote for me, and I'll be better than everyone else here.");
               Utility.pause(5000);
               println("CHELSEA: As a woman, and the daughter of the woman who was robbed of being the first woman president, you should vote for me.");
               Utility.pause(5000);
               println("You would all make history, and so would I, being the first woman president of these United States. Vote for me!");
               Utility.pause(5000);
               println("ELIZABETH: My fellow Americans, the previous administration has caused this country to fall into chaos.");
               Utility.pause(5000);
               println("I think that this country needs someone strong, and experienced to get back on track. So, please vote for me.");
               Utility.pause(5000);
               println("JOE: I regret not running for president so long ago. Everyone was asking me to run against Trump, because no one liked Hillary.");
               Utility.pause(5000);
               println("I want to repent for my sins; by becoming your next president. Only I can set this country back on the right path.");
               Utility.pause(5000);
               println("FRANK: My fellow Americans: none of your leaders have been able to effectively run this country. You need someone who is willing");
               println("to do what is necessary to do the right thing. Your leaders are spineless, as are the rest of the candidates in this room.");
               Utility.pause(5000);
               println("I'm not gonna stand here and beg for your vote. I trust that you will simply do the right thing.");
               Utility.pause(5000);
               println("BLITZER: Now, onto our last and possibly most hyped up candidate, " + position + " " + lastName + ":");
               Utility.pause(5000);
               println("Will you be passive, or aggressive?");
               choice = scnr.nextLine();
               while (!(choice.equalsIgnoreCase("passive")) && !(choice.equalsIgnoreCase("aggressive")))
               {
                   println("Error: pick either passive or aggressive.");
                   choice = scnr.nextLine();
               }
               if(choice.equalsIgnoreCase("passive"))
               {
                   println(firstName.toUpperCase() + ": Good evening my fellow Americans. Tonight is such an important night. Tonight is the start of the next 4 years of our lives.");
                   Utility.pause(5000);
                   println("No matter what happens tonight, just remember: vote with your consience, and make the right choice.");
                   score += 2;
               }
               else if(choice.equalsIgnoreCase("aggressive"))
               {
                   println(firstName.toUpperCase() + ": Hello my fellow Americans. I'm sure that none of us want a repeat of the 2016 election. Which is why you should not vote for any of these people.");
                   Utility.pause(5000);
                   println("These people are no different than Donald Trump. I am the ony one who is different. As someone who is " + age + " years old, I have a different perspective. The right one.");
                   score += 1;
               }
               Utility.pause(5000);
               println("BLITZER: Okay then. Now onto the first question. " + position + " " + lastName + ", most people in America think you are the ideal candidate. How do you respond?");
               println("Selfish or selfless?");
               choice = scnr.nextLine();
               while (!(choice.equalsIgnoreCase("selfish")) && !(choice.equalsIgnoreCase("selfless")))
               {
                   println("Error: pick either selfish or selfless");
                   choice = scnr.nextLine();
               }
               if(choice.equalsIgnoreCase("selfish"))
               {
                   println(firstName.toUpperCase() + ": I mean, it's no contest. Just look at who else is on stage. A celebrity, a rich person, a fake person, and people who can't do their jobs.");
                   Utility.pause(5000);
                   println("It's not that hard to be the best when everyone else is terrible.");
                   Utility.pause(5000);
                   println("CHELSEA: Excuse me? I'm not just some rich person! I AM THE DAUGHTER OF HILLARY RODH-");
                   Utility.pause(5000);
                   println("BLITZER: Hold on Mrs. Clinton, it's not your turn.");
                   score += 1;
               }
               else if(choice.equalsIgnoreCase("selfless"))
               {
                   println(firstName.toUpperCase() + ": Haha, well I've never thought of myself that way. I'm no different than anyone else here. We all have the same goal: to make the US better.");
                   Utility.pause(5000);
                   println("I guess some people just see me as the one who connects with them both. And I can't fault them for that.");
                   Utility.pause(5000);
                   println("KANYE: You? Connecting with the people? Oh please, everyone knows I connect with the most people here.");
                   Utility.pause(5000);
                   println("BLITZER: Mr. West, don't speak out of turn.");
                   score += 2;
               }
               println("Next question: Mr. Underwood, what is your response to people's allegations that you are a fake persona?");
               Utility.pause(5000);
               println("FRANK: That is simply false. I do not understand how anyone could possibly believe that. It is fake news and just outrageous.");
               Utility.pause(5000);
               println("       Do you interrupt? Y or N");
               choice = scnr.nextLine();
               while (!(choice.equalsIgnoreCase("y")) && !(choice.equalsIgnoreCase("n")))
               {
                   println("Error: pick either Y or N.");
                   choice = scnr.nextLine();
               }
               if(choice.equalsIgnoreCase("Y"))
               {
                   println(firstName.toUpperCase() + ": Mr. Underwood, you do know that what you're spouting is absoulte nonsense, correct?");
                   Utility.pause(5000);
                   println("FRANK: Um, what do you mean by that?");
                   Utility.pause(5000);
                   println(firstName.toUpperCase() + ": Well, your name IS the name of a famous Netflix series character...");
                   Utility.pause(5000);
                   println("FRANK: ......");
                   score += 1;
               }
               Utility.pause(5000);
               println("BLITZER: Okay, final question. Mrs. Warren, what makes you think you are right for this position?");
               Utility.pause(5000);
               println("ELIZABETH: Well, as a Senator, I have plenty of experience working in the government and with Congress.");
               Utility.pause(5000);
               println("I will serve the American people the best out of everyone here. That's what matters most.");
               Utility.pause(5000);
               println("BLITZER: Okay, that's all for today folks. As we have ran out of time and there are so many candidates, no final statements will happen tonight.");
               Utility.pause(5000);
               println("Goodnght America, and see you in the next debate.");
           }
           
           if(party.equalsIgnoreCase("R"))
           {
               println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Republican primary debate for the 2024 Election! Our candidates are: ");
               for(int i = 0; i < republicans.size(); i++)
               {
                   System.out.println(republicans.get(i));
               }
           }
           if(party.equalsIgnoreCase("I"))
           {
               println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Independent primary debate for the 2024 Election! Our candidates are: ");
               for(int i = 0; i < independents.size(); i++)
               {
                   System.out.println(independents.get(i));
               }
           }
        }
        else if(debate1PrepLevel == 3)
        {
            println("Great choice! Practicing will put you ahead of the competition! If you use your words right, tomorrow will be a piece of cake.");
            println("......................................................................................................................................................................");
            if(party.equalsIgnoreCase("D"))
            {
                println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first democratic primary debate for the 2024 Election! Our candidates are: ");
                for(int i = 0; i < democrats.size(); i++)
                {
                    System.out.println(democrats.get(i));
                }
                Utility.pause(5000);
                println("We'll have our candidates read out their opening statements. We'll start out with you, Kanye.");
                Utility.pause(5000);
                println("KANYE: To the good people of America, I promise to give you all a 20% discount on all of my Yeezy merch.");
                Utility.pause(5000);
                println("I believe that with everyone rocking Yeezys, we will all enjoy life just that much better.");
                Utility.pause(5000);
                println("Vote for me, and I'll be better than everyone else here.");
                Utility.pause(5000);
                println("CHELSEA: As a woman, and the daughter of the woman who was robbed of being the first woman president, you should vote for me.");
                Utility.pause(5000);
                println("You would all make history, and so would I, being the first woman president of these United States. Vote for me!");
                Utility.pause(5000);
                println("ELIZABETH: My fellow Americans, the previous administration has caused this country to fall into chaos.");
                Utility.pause(5000);
                println("I think that this country needs someone strong, and experienced to get back on track. So, please vote for me.");
                Utility.pause(5000);
                println("JOE: I regret not running for president so long ago. Everyone was asking me to run against Trump, because no one liked Hillary.");
                Utility.pause(5000);
                println("I want to repent for my sins; by becoming your next president. Only I can set this country back on the right path.");
                Utility.pause(5000);
                println("FRANK: My fellow Americans: none of your leaders have been able to effectively run this country. You need someone who is willing");
                println("to do what is necessary to do the right thing. Your leaders are spineless, as are the rest of the candidates in this room.");
                Utility.pause(5000);
                println("I'm not gonna stand here and beg for your vote. I trust that you will simply do the right thing.");
                Utility.pause(5000);
                println("BLITZER: Now, onto our last and possibly most hyped up candidate, " + position + " " + lastName + ":");
                Utility.pause(5000);
                println("Will you be passive, or aggressive?");
                choice = scnr.nextLine();
                while (!(choice.equalsIgnoreCase("passive")) && !(choice.equalsIgnoreCase("aggressive")))
                {
                    println("Error: pick either passive or aggressive.");
                    choice = scnr.nextLine();
                }
                if(choice.equalsIgnoreCase("passive"))
                {
                    println(firstName.toUpperCase() + ": Good evening America. Tonight is the night of nights. The start of election season begins now (although for some it began 4 years ago).");
                    Utility.pause(5000);
                    println("America, I have faith in you. You are the ones who know how bad the situation has gotten. That also means you know how to fix it.");
                    Utility.pause(5000);
                    println("I'm not gonna claim that you have to vote for me to fix America. That is up to you. And I know you'll make the right choice.");
                    score += 3;
                }
                else if(choice.equalsIgnoreCase("aggressive"))
                {
                    println(firstName.toUpperCase() + ": To all my fellow Americans, I wish you a good evening. Before you stands one future presidnetial candidate, and five terrible candidates.");
                    Utility.pause(5000);
                    println("I am that presidential candidate. No one else here is fit for the job. For the past eight years none of them have done anything to fix America.");
                    Utility.pause(5000);
                    println("In my work as a " + position + ", I have been working nonstop for you. They have been working nonstop for them. Your choice, America.");
                    score += 2;
                }
                Utility.pause(5000);
                println("BLITZER: Okay then. Now onto the first question. " + position + " " + lastName + ", most people in America think you are the ideal candidate. How do you respond?");
                println("Selfish or selfless?");
                choice = scnr.nextLine();
                while (!(choice.equalsIgnoreCase("selfish")) && !(choice.equalsIgnoreCase("selfless")))
                {
                    println("Error: pick either selfish or selfless");
                    choice = scnr.nextLine();
                }
                if(choice.equalsIgnoreCase("selfish"))
                {
                    println(firstName.toUpperCase() + ": Well, Wolf, when you're the only candidate up on stage who's been doing his job the past eight years, it's natural people will think you're ideal.");
                    Utility.pause(5000);
                    println("These people have been working for themselves and not the American people. Please, I'm begging you, don't vote for them.");
                    Utility.pause(5000);
                    score += 3;
                }
                else if(choice.equalsIgnoreCase("selfless"))
                {
                    println(firstName.toUpperCase() + ": Well, first of all, thank you. I actually never knew that, believe it or not. I've just been doing my job.");
                    Utility.pause(5000);
                    println("And apparently that is seen as ideal nowadays. I don't blame the people, Wolf. It's just what thet believe");
                    Utility.pause(5000);
                    score += 3;
                }
                println("Next question: Mr. Underwood, what is your response to people's allegations that you are a fake persona?");
                Utility.pause(5000);
                println("FRANK: That is simply false. I do not understand how anyone could possibly believe that. It is fake news and just outrageous.");
                Utility.pause(5000);
                println("       Do you interrupt? Y or N");
                choice = scnr.nextLine();
                while (!(choice.equalsIgnoreCase("y")) && !(choice.equalsIgnoreCase("n")))
                {
                    println("Error: pick either Y or N.");
                    choice = scnr.nextLine();
                }
                if(choice.equalsIgnoreCase("Y"))
                {
                    println(firstName.toUpperCase() + ": Mr. Underwood, you do realize your name is borrowed from the Netflix series House of Cards?");
                    Utility.pause(5000);
                    println("FRANK: Um, well, I uh..... I concede.");
                    democrats.remove(4);
                }
                Utility.pause(5000);
                println("BLITZER: Okay, didn't see THAT coming. Final question: Mrs. Warren, what makes you think you are right for this position?");
                Utility.pause(5000);
                println("ELIZABETH: Well, as a Senator, I have plenty of experience working in the government and with Congress.");
                Utility.pause(5000);
                println("I will serve the American people the best out of everyone here. That's what matters most.");
                Utility.pause(5000);
                println("BLITZER: Okay, that's all for today folks. As we have ran out of time and there are so many candidates, no final statements will happen tonight.");
                Utility.pause(5000);
                println("Goodnght America, and see you in the next debate.");
            }
            
            if(party.equalsIgnoreCase("R"))
            {
                println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Republican primary debate for the 2024 Election! Our candidates are: ");
                for(int i = 0; i < republicans.size(); i++)
                {
                    System.out.println(republicans.get(i));
                }
            }
            if(party.equalsIgnoreCase("I"))
            {
                println("WOLF BLITZER: Hello ladies and gentlemen, welcome to the first Independent primary debate for the 2024 Election! Our candidates are: ");
                for(int i = 0; i < independents.size(); i++)
                {
                    System.out.println(independents.get(i));
                }
            }
        }
    }
}
