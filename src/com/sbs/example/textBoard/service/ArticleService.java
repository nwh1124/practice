package com.sbs.example.textBoard.service;

import java.util.List;

import com.sbs.example.textBoard.container.Container;
import com.sbs.example.textBoard.dao.ArticleDao;
import com.sbs.example.textBoard.dto.Article;
import com.sbs.example.textBoard.dto.Recommand;
import com.sbs.example.textBoard.dto.Reply;

public class ArticleService {
	
	ArticleDao articleDao;
	
	public ArticleService() {
		
		articleDao = Container.articleDao;
		
	}

	public int add(String title, String body, int loginedId, int selectedBoardId) {
		return articleDao.add(title, body, loginedId, selectedBoardId);
	}

	public List<Article> getArticles() {
		return articleDao.getArticles();
	}	
	
	public List<Article> getArticles(String boardName) {
		return articleDao.getArticles(boardName);
	}

	public Article getArticle(int inputedId) {
		return articleDao.getArticle(inputedId);
	}

	public void delete(int inputedId) {
		articleDao.delete(inputedId);
	}

	public void modify(String modTitle, String modBody, int inputedId) {
		articleDao.modify(modTitle, modBody, inputedId);
	}

	public void doHitPlus(int inputedId) {
		articleDao.doHitPlus(inputedId);
	}

	public List<Reply> getReplys() {
		return articleDao.getReplys();
	}

	public List<Recommand> getReco(int inputedId) {
		return articleDao.getReco(inputedId);
	}

	public void recommand(int inputedId, int loginedId) {
		articleDao.recommand(inputedId, loginedId);
	}

	public void cancelRoce(int inputedId, int loginedId) {
		articleDao.cancelRecommand(inputedId, loginedId);
	}

	public void writeReply(String reply, int inputedId, int loginedId) {
		articleDao.writeReply(reply, inputedId, loginedId);
	}

	public List<Reply> getReplysByMemberId(int loginedId) {
		return articleDao.getReplysByMemberId(loginedId);
	}

	public int deleteReply(String deleteReplyId) {
		return articleDao.deleteReply(deleteReplyId);
	}

	public void modifyReply(String modReplyId, String modReplyBody) {
		articleDao.modifyReply(modReplyId, modReplyBody);
	}
}
