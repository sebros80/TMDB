package com.sebros.tmdb;

import java.io.Serializable;

public class MovieResult implements Serializable {
    private final String backdropPath;
    private final String originalTitle;
    private final int id;
    private final String popularity;
    private final String posterPath;
    private final String releaseDate;
    private final String title;
    private final String genre;
    private final String overview;
    private final String voteCount;
    private final String voteAverage;

    private MovieResult(Builder builder) {
        backdropPath = builder.backdropPath;
        originalTitle = builder.originalTitle;
        id = builder.id;
        popularity = builder.popularity;
        posterPath = builder.posterPath;
        releaseDate = builder.releaseDate;
        title = builder.title;
        genre = builder.genre;
        overview = builder.overview;
        voteCount = builder.voteCount;
        voteAverage = builder.voteAverage;
    }

    public static class Builder {
        private String backdropPath;
        private String originalTitle;
        private int id;
        private String popularity;
        private String posterPath;
        private String releaseDate;
        private String title;
        private String genre;
        private String overview;
        private String voteCount;
        private String voteAverage;
        
        public Builder(int id, String title) {
            this.id = id;
            this.title = title;
        }

        public Builder setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
            return this;
        }

        public Builder setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPopularity(String popularity) {
            this.popularity = popularity;
            return this;
        }

        public Builder setPosterPath(String posterPath) {
            this.posterPath = posterPath;
            return this;
        }

        public Builder setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }
        public Builder setOverview(String overview) {
            this.overview = overview;
            return this;
        }

        public Builder setVoteCount(String voteCount) {
            this.voteCount = voteCount;
            return this;
        }

        public Builder setVoteAverage(String voteAverage) {
            this.voteAverage = voteAverage;
            return this;
        }
        public MovieResult build() {
            return new MovieResult(this);
        }
        
    }
    
    public static Builder newBuilder(int id, String title) {
        return new Builder(id, title);
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public int getId() {
        return id;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
    public String getOverview() {
        return overview;
    }
    public String getVoteCount() {
        return voteCount;
    }
    public String getVoteAverage() {
        return voteAverage;
    }


    @Override
    public String toString() {
        return getTitle();
    }
    
}
