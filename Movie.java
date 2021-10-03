class Movie{
public static void entertain(int ticketPrice,int movieLength,int ratings,String movieName,String[] actors)
{
	System.out.println("invoked entertain");
	System.out.println("Ticket Price: "+ticketPrice);
	System.out.println("Movie Length: "+movieLength);
	System.out.println("Ratings:      "+ratings);
    System.out.println("Movie Name:   "+movieName);
	for(int actorIndex=0; actorIndex<actors.length;)
	      {
	   String actor=actors[actorIndex];
	   System.out.println(actor);
	   actorIndex++;
            }
}
}