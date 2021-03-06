package com.example.musicapp;

public class MusicAlbumData {

    String nameOfAlbum;
    String writerOfAlbum;
    String urlImage = "";

    public MusicAlbumData(String nameOfAlbum, String writerOfAlbum, String urlImage) {
        this.nameOfAlbum = nameOfAlbum;
        this.writerOfAlbum = writerOfAlbum;
        this.urlImage = urlImage;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public String getWriterOfAlbum() {
        return writerOfAlbum;
    }

    public void setWriterOfAlbum(String writerOfAlbum) {
        this.writerOfAlbum = writerOfAlbum;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
