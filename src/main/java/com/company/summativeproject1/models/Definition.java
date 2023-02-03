package com.company.summativeproject1.models;

import java.util.Objects;

public class Definition {
    private String id;
    private String word;
    private String definition;

    public Definition() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition that = (Definition) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getWord(), that.getWord()) && Objects.equals(getDefinition(), that.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWord(), getDefinition());
    }

    @Override
    public String toString() {
        return "Definition{" +
                "id='" + id + '\'' +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
