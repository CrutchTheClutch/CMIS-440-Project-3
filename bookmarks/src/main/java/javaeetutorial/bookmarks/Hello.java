/**
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.bookmarks;

import javax.enterprise.inject.Model;

@Model
public class Hello {

    private String name;
    private boolean whippedCream;
    private boolean chocolate;
    private String temp;
    private String roast;

    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }

    public boolean getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean wc) {
        this.whippedCream = wc;
    }

    public boolean getChocolate() {
        return chocolate;
    }

    public void setChocolate(boolean c) {
        this.chocolate = c;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String t) {
        this.temp = t;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String r) {
        this.roast = r;
    }
}

