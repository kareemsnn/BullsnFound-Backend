package com.bullsnfound.model;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private String itemID;
    private String itemName;
    private String description;
    private Location location;
    private LocalDateTime date;
    private String image_file;
    private String contact;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Location {
        private String locationDetails;
        private Double latitude;
        private Double longitude;
    }
}
