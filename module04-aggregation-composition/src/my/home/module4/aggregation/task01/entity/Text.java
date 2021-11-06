package my.home.module4.aggregation.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private List<Sentence> listOfSentences;
	private Sentence header;

	public Text() {

		listOfSentences = new ArrayList<>();
		header = new Sentence();
	}

	public Text(List<Sentence> listOfSentences, Sentence header) {
		this.listOfSentences = listOfSentences;
		this.header = header;

	}

	public List<Sentence> getListOfSentences() {
		return listOfSentences;
	}

	public void setListOfSentences(List<Sentence> listOfSentences) {
		this.listOfSentences = listOfSentences;
	}

	public Sentence getHeader() {
		return header;
	}

	public void setHeader(Sentence header) {
		this.header = header;
	}

	public void addText(Sentence sentense) {
		listOfSentences.add(sentense);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((listOfSentences == null) ? 0 : listOfSentences.hashCode());
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
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (listOfSentences == null) {
			if (other.listOfSentences != null)
				return false;
		} else if (!listOfSentences.equals(other.listOfSentences))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[listOfSentences=" + listOfSentences + ", header=" + header + "]";
	}

}
