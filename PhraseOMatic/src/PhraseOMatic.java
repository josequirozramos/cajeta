
public class PhraseOMatic {
	public static void main (String [] args){
		
		//Make 3 sets of words
		String[] wordListOne ={"24/7" , "multi-tier", "30,000 foot","B-to-B",
				"win-win","front-end","web-based",
				"pervasive","smart","six-sigma","critical-path","dynamic"};
		String[] wordListTwo ={"empowered" , "sticky", "value-added","oriented",
				"centric","distributed","clustered",
				"branded","outside-the-box","positioned","networked","focused","leveraged","aligned",
				"targeted","shared","cooperative","accelerated"};
		String[] wordListThree ={"process" , "tipping-point", "solution",
				"architecture","core competency","strategy","mind-share",
				"portal","space","vision","paradigm","mission"};
		
		//Find out how many words in each list
		int oneLength=wordListOne.length;
		int twoLength=wordListTwo.length;
		int threeLength=wordListThree.length;
		
		//Generate random numbers
		int rand1 = (int) (Math.random()*oneLength);
		int rand2 = (int) (Math.random()*twoLength);
		int rand3 = (int) (Math.random()*threeLength);
		
		//Build the phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("What we need is a " + phrase);		
	}
}
