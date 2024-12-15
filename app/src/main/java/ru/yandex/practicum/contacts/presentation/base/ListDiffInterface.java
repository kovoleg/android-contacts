package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T classEx);

    boolean equals(Object obj);
}
