/**
 * Copyright (C) 2015 Bonitasoft S.A.
 * Bonitasoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.web.designer.generator.assertions;

import static java.lang.String.format;

import org.assertj.core.api.AbstractAssert;
import org.bonitasoft.web.designer.generator.parametrizedWidget.TitleWidget;

/**
 * {@link TitleWidget} specific assertions - Generated by CustomAssertionGenerator.
 */
public class TitleWidgetAssert extends AbstractAssert<TitleWidgetAssert, TitleWidget> {

    /**
     * Creates a new </code>{@link TitleWidgetAssert}</code> to make assertions on actual TitleWidget.
     *
     * @param actual the TitleWidget we want to make assertions on.
     */
    public TitleWidgetAssert(TitleWidget actual) {
        super(actual, TitleWidgetAssert.class);
    }

    /**
     * An entry point for TitleWidgetAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one's can write directly : <code>assertThat(myLabelWidget)</code> and get specific assertion with code completion.
     *
     * @param actual the TitleWidget we want to make assertions on.
     * @return a new </code>{@link TitleWidgetAssert}</code>
     */
    public static TitleWidgetAssert assertThat(TitleWidget actual) {
        return new TitleWidgetAssert(actual);
    }

    /**
     * Verifies that the actual TitleWidget's text is equal to the given one.
     *
     * @param text the given text to compare the actual TitleWidget's text to.
     * @return this assertion object.
     * @throws AssertionError - if the actual TitleWidget's text is not equal to the given one.
     */
    public TitleWidgetAssert hasText(String text) {
        // check that actual TitleWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("\nExpected <%s> text to be:\n  <%s>\n but was:\n  <%s>", actual, text, actual.getText());

        // check
        if (!actual.getText().equals(text)) {
            throw new AssertionError(errorMessage);
        }

        // return the current assertion for method chaining
        return this;
    }

}
