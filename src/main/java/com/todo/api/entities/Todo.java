package com.todo.api.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

@Document(collection = "todos")
@Data
public class Todo {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "PR_KEY")
    private String id;
    private String text;
    private boolean complete;
    private Date creationDate;
    private Date completeDate;
    private int priority;


}
