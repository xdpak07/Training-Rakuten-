package com.rakuten;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

@Entity
@Table(name="posts")
public class Posts {
	private static final Set<Tags> Tags = null;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(max=100)
	@Column(unique = true)
	private String title;
	
	@NotNull
	@Size(max=250)
	private String description;
	
	@NotNull
	@Lob
	private String content;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "posted_at")
	private Date postedAt = new Date();
	
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_at")
	private Date lastUpdatedAt = new Date();
	
	@ManyToMany(fetch = FetchType.LAZY,
		cascade = {
				CascadeType.PERSIST,
				CascadeType.MERGE
		})

	@JoinTable(name = "posts_tags",
			joinColumns = { @JoinColumn(name = "posts_id")},
			inverseJoinColumns = {@JoinColumn(name = "tags_id")})
	private set<Tags> tags = new HashSet<>();
	
	public Posts() {
		
	}
	
	public Posts(String title, String description, String content) {
		this.title=title;
		this.description=description;
		this.content = content;
	}
	
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getContrnt() {
		return content;
	}
	public void setContrnt(String content) {
		this.content = content;
	}
	
	public Date getPostedAT() {
		return postedAt;
	}
	
	public void setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
	}
	
	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	
	public Set<Tags> getTags(){
		return Tags;
	}
	
	public void setTags(Set<Tags> tags) {
		this.Tags = tags;
	}
	
	

}
