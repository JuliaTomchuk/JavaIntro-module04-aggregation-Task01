package my.home.module4.aggregation.task01.main;

import java.util.ArrayList;
import java.util.List;

import my.home.module4.aggregation.task01.entity.Sentence;
import my.home.module4.aggregation.task01.entity.Text;
import my.home.module4.aggregation.task01.entity.Word;
import my.home.module4.aggregation.task01.view.View;

/* Создать объект класса Текст, используя классы  Предложение, Слово.
 *  Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/
public class Main {

	public static void main(String args[]) {

		List<Word> words = new ArrayList<>();
		words.add(new Word("Создать"));
		words.add(new Word("объект"));
		words.add(new Word("класса"));
		words.add(new Word("Текст."));

		Sentence sentenceFirst = new Sentence(words);

		List<Word> otherWords = new ArrayList<>();

		otherWords.add(new Word("Вывести"));
		otherWords.add(new Word("на"));
		otherWords.add(new Word("консоль"));
		otherWords.add(new Word("текст."));

		Sentence sentenceSecond = new Sentence(otherWords);

		Text text = new Text();

		text.addText(sentenceFirst);
		text.addText(sentenceSecond);

		List<Word> forHeader = new ArrayList<>();

		forHeader.add(new Word("Задача "));
		forHeader.add(new Word("'Текст'."));

		text.setHeader(new Sentence(forHeader));

		View view = new View();

		view.print(text.getHeader());
		System.out.println("");
		view.print(text);



	}

}
