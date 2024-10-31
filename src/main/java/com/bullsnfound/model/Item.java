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

    public class Location {
        private String locationDetails;
        private Double latitude;
        private Double longitude;

        public Location() {}

        public Location(String locationDetails, Double latitude, Double longitude) {
            this.locationDetails = locationDetails;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public String getLocationDetails() {
            return locationDetails;
        }

        public void setLocationDetails(String locationDetails) {
            this.locationDetails = locationDetails;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }
    }
}
