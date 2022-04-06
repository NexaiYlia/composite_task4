package com.nexai.task4.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Symbol implements TextComponent {
    private static final Logger logger = LogManager.getLogger();
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
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

        Symbol symbol1 = (Symbol) o;

        return symbol == symbol1.symbol;
    }

    @Override
    public int hashCode() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);

    }
}


