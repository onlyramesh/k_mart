package com.kirani.kiranibackendcode.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long slNo;

    private Long imageName;
    @Lob
    private byte[] image1;

    public Image() {
    }

    public Image(Long slNo, Long imageName, byte[] image1) {
        this.slNo = slNo;
        this.imageName = imageName;
        this.image1 = image1;
    }


    public Image(Long imageName, byte[] imageblob) {
        this.imageName = imageName;
        this.image1 = imageblob;
    }

    public Long getSlNo() {
        return slNo;
    }

    public void setSlNo(Long slNo) {
        this.slNo = slNo;
    }

    public Long getImageName() {
        return imageName;
    }

    public void setImageName(Long imageName) {
        this.imageName = imageName;
    }

    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }
}
