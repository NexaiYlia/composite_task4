package com.nexai.task4.parser.impl;

import com.nexai.task4.entity.TextComponent;
import com.nexai.task4.entity.TextComponentType;
import com.nexai.task4.entity.TextComposite;
import com.nexai.task4.exception.CompositeException;
import com.nexai.task4.parser.AbstractTextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SentenceParser implements AbstractTextParser {
    private static final Logger logger = LogManager.getLogger();
    private AbstractTextParser lexemeParser = new LexemeParser();
    static final String LEXEME_DELIMITER = "\\s";

    @Override
    public TextComponent parse(String text) throws CompositeException {
        if (text == null || text.isEmpty()) {
            throw new CompositeException("Passed argument is null or empty");
        }
        TextComponent sentenceComponent = new TextComposite(TextComponentType.SENTENCE);
        String[] lexemes = text.split(LEXEME_DELIMITER);
        for (String lexeme : lexemes) {
            TextComponent lexemeComponent = lexemeParser.parse(lexeme);
            sentenceComponent.add(lexemeComponent);
        }
        return sentenceComponent;
    }

}
