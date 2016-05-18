/* ===========================================================
 * TradeManager : An application to trade strategies for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Project Info:  org.trade
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Oracle, Inc.
 * in the United States and other countries.]
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Original Author:  Simon Allen;
 * Contributor(s):   -;
 *
 * Changes
 * -------
 *
 */
package org.trade.core.conversion;

/**
 * This class converts instances of java.lang.String to instances of
 * java.lang.Short. Conversion is done if the String instance is in the correct
 * format, and it uses the Short(String aString) constructor.
 * 
 * An instance of this class is registered as a default converter with the
 * JavaTypeTranslator class.
 * 
 * @see java.lang.Short
 * @author Simon Allen
 */
public class StringToShortConverter extends StringToObjectConverter {
	/**
	 * Default constructor.
	 */
	public StringToShortConverter() {
	}

	//
	// JavaTypeConverter interface methods
	//
	/**
	 * This method returns the target type or class that the converter converts
	 * to. In this case java.lang.Short .
	 * 
	 * 
	 * @return Class the class the source value will be converted to * @see
	 *         org.trade.core.conversion.JavaTypeConverter#getTargetType()
	 */
	public Class<?> getTargetType() {
		return java.lang.Short.class;
	}

	//
	// Methods which need to be overridden
	//
	/**
	 * This method converts the String value to a Short by using the
	 * Short(String aString) constructor.
	 * 
	 * @param aString
	 *            the String to be converted
	 * 
	 * 
	 * @return Object the String converted to a Short * @exception
	 *         IllegalArgumentException thrown if the String to convert is not
	 *         in the correct format
	 */
	protected Object getConvertedString(String aString) throws IllegalArgumentException {
		return new Short(aString);
	}
}
