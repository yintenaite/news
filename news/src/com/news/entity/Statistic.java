package com.news.entity;

public class Statistic {
    private Integer statisticId;

    private Integer statisticRead;

    private Integer statisticCollection;

    private Integer statisticComment;

    private String newId;

    public Statistic(Integer statisticRead, Integer statisticCollection,
			Integer statisticComment, String newId) {
		super();
		this.statisticRead = statisticRead;
		this.statisticCollection = statisticCollection;
		this.statisticComment = statisticComment;
		this.newId = newId;
	}

	public Statistic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(Integer statisticId) {
        this.statisticId = statisticId;
    }

    public Integer getStatisticRead() {
        return statisticRead;
    }

    public void setStatisticRead(Integer statisticRead) {
        this.statisticRead = statisticRead;
    }

    public Integer getStatisticCollection() {
        return statisticCollection;
    }

    public void setStatisticCollection(Integer statisticCollection) {
        this.statisticCollection = statisticCollection;
    }

    public Integer getStatisticComment() {
        return statisticComment;
    }

    public void setStatisticComment(Integer statisticComment) {
        this.statisticComment = statisticComment;
    }

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId == null ? null : newId.trim();
    }
}