package day3;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		speak("Today, im going to Lego Land so leave me be");

		// 2. ask the user for a sentence
		speak("make a sentance");
	}

	// 3. call the speak method below and send it the sentence
	public static void main(String[] args) {
		speak("I like cheese");
	}

	// 4. repeat steps 2 and 3 a lot of times
	public static void main(String[] args) {
		speak("Leave me alone mom, go away");
		speak("oops I poo poo my pants");
		speak("oops I farted caught you by suprize I know you smelt it I see the teares in your eyes");
	}

	/* Don’t change this…. */
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
		voice.deallocate();
	}

}
