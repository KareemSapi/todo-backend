package com.example.accessingdatapostgresql;

//import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //tells hibernate to make table out of this class.
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String description;

    private Boolean done;

    //private Date created_at;

    //private Date updated_at;

    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }

      public String getDescription() {
        return description;
      }
    
      public void setDescription(String description) {
        this.description = description;
      }

      public Boolean getDone() {
        return done;
      }

      public void setDone(Boolean done) {
        this.done = done;
      }
}
