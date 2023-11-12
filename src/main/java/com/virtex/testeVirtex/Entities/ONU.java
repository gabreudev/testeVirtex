package com.virtex.testeVirtex.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ONU {
    @Id
    private String sn;

    private String slot;

    private String port;

    private Long ont_id;

    private String state;
}
