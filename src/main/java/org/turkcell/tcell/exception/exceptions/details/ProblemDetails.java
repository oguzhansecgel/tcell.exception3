package org.turkcell.tcell.exception.exceptions.details;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProblemDetails {
    private String title;
    private String message;
}