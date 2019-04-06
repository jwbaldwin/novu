package com.jbaldwin.flowist.domain;

import com.jbaldwin.flowist.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flows")
public class Flow extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;
    private String owner;

    @Lob
    private String content;
    private String activity;
    private String title;
    private ArrayList<String> tags;
    private FlowStatus flowStatus;
}
