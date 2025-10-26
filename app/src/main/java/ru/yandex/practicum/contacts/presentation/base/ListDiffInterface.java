package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
     boolean theSameAs(T param);

     boolean equals(Object object);
}

