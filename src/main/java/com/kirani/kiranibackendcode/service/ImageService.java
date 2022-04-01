package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Image;
import com.kirani.kiranibackendcode.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository){
        this.imageRepository= imageRepository;
    }

    public void saveImage(Image image){
        this.imageRepository.save(image);
    }

    public List<Image> getAllImages(){
        return (List<Image>) imageRepository.findAll();
    }

    public byte[] getImagefor(Long imageName) {
        Optional<Image> optionalImage=this.imageRepository.findByImageName(imageName);
        return optionalImage.map(Image::getImage1).orElse(null);
    }
}
