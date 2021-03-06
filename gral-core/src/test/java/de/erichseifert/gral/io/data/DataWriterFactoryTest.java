/*
 * GRAL: GRAphing Library for Java(R)
 *
 * (C) Copyright 2009-2015 Erich Seifert <dev[at]erichseifert.de>,
 * Michael Seifert <mseifert[at]error-reports.org>
 *
 * This file is part of GRAL.
 *
 * GRAL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GRAL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GRAL.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.erichseifert.gral.io.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

public class DataWriterFactoryTest {
	@Test
	public void testInstance() {
		DataWriterFactory instance1 = DataWriterFactory.getInstance();
		assertNotNull(instance1);
		DataWriterFactory instance2 = DataWriterFactory.getInstance();
		assertSame(instance1, instance2);
	}

	@Test
	public void testGet() {
		DataWriter r = DataWriterFactory.getInstance().get("text/csv");
		assertNotNull(r);

		try {
			DataWriterFactory.getInstance().get("fail");
			fail("Expected IllegalArgumentException exception.");
		} catch (IllegalArgumentException e) {
		}
	}
}
