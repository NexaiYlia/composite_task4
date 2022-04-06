package com.nexai.task4.parser;

import com.nexai.task4.entity.TextComponent;
import com.nexai.task4.exception.CompositeException;

public interface AbstractTextParser {
    TextComponent parse(String text) throws CompositeException;
}

