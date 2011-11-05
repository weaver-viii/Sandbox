package net.francesbagual.sandbox;

import java.util.List;

import net.francesbagual.sandbox.dao.TweetDao;
import net.francesbagual.sandbox.model.Tweet;

import org.springframework.batch.item.ItemWriter;

/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
public class TweetWriter implements ItemWriter<Tweet> {

	private TweetDao dao;
	
	/**
	 * @see ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends Tweet> tweets) throws Exception {
		for(Tweet tweet : tweets){
			dao.save(tweet);
		}
	}
	
	public void setDao(TweetDao dao) {
		this.dao = dao;
	}

}
