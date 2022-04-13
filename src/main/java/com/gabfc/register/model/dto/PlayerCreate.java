package com.gabfc.register.model.dto;

import com.gabfc.register.model.Player;
import com.gabfc.register.model.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerCreate {
    private String name;
    private Double height;
    private Double weight;
    private Position position;
    private Integer overall;
    private Integer age;
    private Double marketValue;

    public Player mapToPlayer(){
        return Player.builder()
                .name(name)
                .height(height)
                .weight(weight)
                .position(position)
                .overall(overall)
                .age(age)
                .marketValue(marketValue)
                .build();
    }
}
