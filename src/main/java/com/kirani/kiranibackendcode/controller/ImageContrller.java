package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.Image;
import com.kirani.kiranibackendcode.service.ImageService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("image")
public class ImageContrller {

    private final ImageService imageService;

    public ImageContrller(ImageService imageService) {
        this.imageService = imageService;
    }

    public byte[] convertFiletoByteStream(MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        if (fileName == null || fileName.contains("..")) {
//            return new ResponseEntity<String>("Sorry! Filename contains invalid path sequence " + fileName, HttpStatus.BAD_REQUEST);
            throw new Exception("Invalid File");
        }
        return file.getBytes();
    }
    @PostMapping
    ResponseEntity<Void> saveImage(@RequestParam Long imageName, @RequestParam MultipartFile file){
        byte[] imageblob;
        try {
            imageblob = convertFiletoByteStream(file);
//            imageblob=file.getBytes();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
        Image image = new Image(imageName,imageblob);
        imageService.saveImage(image);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{imageName}/image", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable Long imageName){
        byte[] image= imageService.getImagefor(imageName);
        return ResponseEntity.ok(image);
    }



}
