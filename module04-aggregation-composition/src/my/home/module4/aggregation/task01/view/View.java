package my.home.module4.aggregation.task01.view;

import my.home.module4.aggregation.task01.entity.Sentence;
import my.home.module4.aggregation.task01.entity.Text;

public class View {

	public void print(Sentence sentence) {

		for (int i = 0; i < sentence.getWords().size(); i++) {
			System.out.print(sentence.getWords().get(i).getSymbols() + " ");
		}

	}

	public void print(Text text) {
		for (int i = 0; i < text.getListOfSentences().size(); i++) {

			print(text.getListOfSentences().get(i));
		}
	}

}
