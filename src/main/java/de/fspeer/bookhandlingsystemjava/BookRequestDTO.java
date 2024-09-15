package de.fspeer.bookhandlingsystemjava;

public record BookRequestDTO(
        String titel,
        String author,
        String isbn) {
}
