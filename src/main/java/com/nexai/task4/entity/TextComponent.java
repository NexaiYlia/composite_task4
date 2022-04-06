package com.nexai.task4.entity;

import java.util.List;

public interface TextComponent {
    boolean add(TextComponent component);
    boolean remove(TextComponent component);
    List<TextComponent> getChildren();
    String toString();
}
