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
package org.bonitasoft.web.designer.generator.parametrizedWidget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.bonitasoft.web.designer.generator.parametrizedWidget.ParameterType.INTERPOLATION;

import org.bonitasoft.web.designer.generator.mapping.DimensionFactory;
import org.junit.Test;

public class TextWidgetTest {

    @Test
    public void should_create_a_component_with_an_interpolated_text_property_value() {
        TextWidget text = new TextWidget();

        assertThat(text.toComponent(new DimensionFactory()).getPropertyValues().get("text").getType()).isEqualTo(INTERPOLATION.getValue());
    }
}
