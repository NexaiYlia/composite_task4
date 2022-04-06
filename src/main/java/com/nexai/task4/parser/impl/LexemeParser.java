package com.nexai.task4.parser.impl;

import com.nexai.task4.entity.TextComponent;

import com.nexai.task4.exception.CompositeException;
import com.nexai.task4.parser.AbstractTextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LexemeParser implements AbstractTextParser {
    private static final Logger logger = LogManager.getLogger();

    private AbstractTextParser wordParser = new WordParser();

    @Override
    public TextComponent parse(String text) throws CompositeException {
        return null;//todo
    }
}
