package com.nexai.task4.parser.impl;

import com.nexai.task4.entity.TextComponent;
import com.nexai.task4.entity.TextComponentType;
import com.nexai.task4.entity.TextComposite;
import com.nexai.task4.exception.CompositeException;
import com.nexai.task4.parser.AbstractTextParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ParagraphParser implements AbstractTextParser {
    private static final Logger logger = LogManager.getLogger();
    static final String SENTENCE_DELIMITER = "(?<=[!?.{3}])[\\s]";
    private AbstractTextParser sentenceParser = new SentenceParser();

    @Override
    public TextComponent parse(String text) throws CompositeException {
        if (text == null || text.isEmpty()) {
            throw new CompositeException("Passed argument is null or empty");
        }
        TextComponent paragraphComponent = new TextComposite(TextComponentType.PARAGRAPH);
        String[] sentences = text.split(SENTENCE_DELIMITER);
        for (String sentence : sentences) {
            TextComponent sentenceComponent = sentenceParser.parse(sentence);
            paragraphComponent.add(sentenceComponent);
        }
        return paragraphComponent;
    }
}

