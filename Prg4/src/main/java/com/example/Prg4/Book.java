package com.example.Prg4;

	public class Book {
		private Long id;
	   
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPublicationYear() {
			return publicationYear;
		}
		public void setPublicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
		}
		private String title;
	    private String author;
	    private int publicationYear;
	}


