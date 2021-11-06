package my.home.module4.aggregation.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> words;

	public Sentence() {
		words = new ArrayList<>();
	}

	public Sentence(List<Word> words) {

		this.words = words;

	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public void setWord(Word word) {
		words.add(word);
	}

	public Word getWord(int index) {
		return words.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[sentence=" + words + "]";
	}

}
