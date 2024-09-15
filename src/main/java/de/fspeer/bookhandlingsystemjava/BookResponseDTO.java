package de.fspeer.bookhandlingsystemjava;

public record BookResponseDTO(
    String id,
    String titel,
    String author,
    String isbn
) {
}
