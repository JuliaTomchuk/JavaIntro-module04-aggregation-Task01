package my.home.module4.aggregation.task01.main;

import java.util.ArrayList;
import java.util.List;

import my.home.module4.aggregation.task01.entity.Sentence;
import my.home.module4.aggregation.task01.entity.Text;
import my.home.module4.aggregation.task01.entity.Word;
import my.home.module4.aggregation.task01.view.View;

/* ������� ������ ������ �����, ��������� ������  �����������, �����.
 *  ������: ��������� �����, ������� �� ������� �����, ��������� ������.*/
public class Main {

	public static void main(String args[]) {

		List<Word> words = new ArrayList<>();
		words.add(new Word("�������"));
		words.add(new Word("������"));
		words.add(new Word("������"));
		words.add(new Word("�����."));

		Sentence sentenceFirst = new Sentence(words);

		List<Word> otherWords = new ArrayList<>();

		otherWords.add(new Word("�������"));
		otherWords.add(new Word("��"));
		otherWords.add(new Word("�������"));
		otherWords.add(new Word("�����."));

		Sentence sentenceSecond = new Sentence(otherWords);

		Text text = new Text();

		text.addText(sentenceFirst);
		text.addText(sentenceSecond);

		List<Word> forHeader = new ArrayList<>();

		forHeader.add(new Word("������ "));
		forHeader.add(new Word("'�����'."));

		text.setHeader(new Sentence(forHeader));

		View view = new View();

		view.print(text.getHeader());
		System.out.println("");
		view.print(text);



	}

}
