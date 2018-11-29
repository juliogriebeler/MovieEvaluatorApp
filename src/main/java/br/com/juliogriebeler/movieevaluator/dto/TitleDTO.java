package br.com.juliogriebeler.movieevaluator.dto;

public class TitleDTO {
	// titleId ordering title region language types attributes isOriginalTitle
	private Long titleId;
	private Long ordering;
	private String title;
	private String region;
	private String language;
	private String types;
	private String attributes;
	private boolean isOriginalTitle;

	public Long getTitleId() {
		return titleId;
	}

	public void setTitleId(Long titleId) {
		this.titleId = titleId;
	}

	public Long getOrdering() {
		return ordering;
	}

	public void setOrdering(Long ordering) {
		this.ordering = ordering;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public boolean isOriginalTitle() {
		return isOriginalTitle;
	}

	public void setOriginalTitle(boolean isOriginalTitle) {
		this.isOriginalTitle = isOriginalTitle;
	}
}
