package com.example.youtubeca.model;
public class Quote {
    public Quote(){}

    public Quote(String quote,String anime,String character,String imageUrl){
        this.quote=quote;
        this.anime=anime;
        this.character=character;
        this.imageUrl=imageUrl;
    }

    public String getAnime() {
            return anime;
        }

        public void setAnime(String anime) {
            this.anime = anime;
        }

        public String getQuote() {
            return quote;
        }

        public void setQuote(String quote) {
            this.quote = quote;
        }

        private String quote;
        private String anime;

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

        private String character;

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        private String imageUrl;
    }