package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

/**
 * Класс BaseListDiffCallback должен быть дженерик-классом с ограничением параметра типа
 * на обязательную реализацию интерфейса ListDiffInterface<>. В качестве параметра типа у интерфейса
 * указывается такое же имя, что и у класса.

 * Все типы данных, передаваемые в переопределяемые методы, должны быть заменены на дженерик-тип.
 */

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {
// public class BaseListDiffCallback<T extends ListDiffInterface<BaseListDiffCallback<T>>> extends DiffUtil.ItemCallback<T>{

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.theSameAs(newItem);

    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }



    @Nullable
    public Object getChangePayload(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return newItem;
    }
}
