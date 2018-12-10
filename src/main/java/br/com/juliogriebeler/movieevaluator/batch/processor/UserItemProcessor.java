package br.com.juliogriebeler.movieevaluator.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import br.com.juliogriebeler.movieevaluator.model.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		return user;
	}

}