package com.nexai.task4.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Punctuation implements TextComponent {
    private static final Logger logger = LogManager.getLogger();
    private char punctuation;

    public Punctuation(char punctuation) {
        this.punctuation = punctuation;
    }

    @Override
    public boolean add(TextComponent component) {
        logger.error("Not available operation to this component");
        throw new UnsupportedOperationException("Not available operation to this component");
    }

    @Override
    public boolean remove(TextComponent component) {
        logger.error("Not available operation to this component");
        throw new UnsupportedOperationException("Not available operation to this component");
    }

    @Override
    public List<TextComponent> getChildren() {
        logger.error("Not available operation to this component");
        throw new UnsupportedOperationException("Not available operation to this component");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Punctuation that = (Punctuation) o;

        return punctuation == that.punctuation;
    }

    @Override
    public int hashCode() {
        return punctuation;
    }

    @Override
    public String toString() {
        return String.valueOf(punctuation);
    }
}

