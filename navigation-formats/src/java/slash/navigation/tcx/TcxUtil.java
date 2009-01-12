/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/

package slash.navigation.tcx;

import slash.navigation.jaxb.JaxbUtils;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.*;

public class TcxUtil {
    public static final JAXBContext CONTEXT_1 = JaxbUtils.newContext(slash.navigation.tcx.binding1.ObjectFactory.class);
    public static final JAXBContext CONTEXT_2 = JaxbUtils.newContext(slash.navigation.tcx.binding2.ObjectFactory.class);

    public static final String TCX_1_NAMESPACE_URI = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v1";
    public static final String TCX_2_NAMESPACE_URI = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2";

    public static Unmarshaller newUnmarshaller1() {
        return JaxbUtils.newUnmarshaller(CONTEXT_1);
    }

    public static Marshaller newMarshaller1() {
        return JaxbUtils.newMarshaller(CONTEXT_1);
    }

    public static Unmarshaller newUnmarshaller2() {
        return JaxbUtils.newUnmarshaller(CONTEXT_2);
    }

    public static Marshaller newMarshaller2() {
        return JaxbUtils.newMarshaller(CONTEXT_2);
    }


    public static slash.navigation.tcx.binding1.TrainingCenterDatabaseT unmarshal1(InputStream in) throws JAXBException {
        slash.navigation.tcx.binding1.TrainingCenterDatabaseT result = null;
        try {
            JAXBElement element = (JAXBElement) newUnmarshaller1().unmarshal(in);
            result = (slash.navigation.tcx.binding1.TrainingCenterDatabaseT) element.getValue();
        } catch (ClassCastException e) {
            throw new JAXBException("Parse error with " + result + ": " + e.getMessage(), e);
        }
        return result;
    }

    public static slash.navigation.tcx.binding1.TrainingCenterDatabaseT unmarshal1(File file) throws JAXBException {
        try {
            FileInputStream in = new FileInputStream(file);
            try {
                return unmarshal1(in);
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new JAXBException("Error while unmarshalling from " + file + ": " + e.getMessage());
        }
    }

    public static void marshal1(slash.navigation.tcx.binding1.TrainingCenterDatabaseT trainingCenterDatabaseT, File file) throws JAXBException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            try {
                newMarshaller1().marshal(new JAXBElement<slash.navigation.tcx.binding1.TrainingCenterDatabaseT>(new QName(TCX_1_NAMESPACE_URI, "TrainingCenterDatabase"), slash.navigation.tcx.binding1.TrainingCenterDatabaseT.class, trainingCenterDatabaseT), fos);
            }
            finally {
                fos.flush();
                fos.close();
            }
        } catch (IOException e) {
            throw new JAXBException("Error while marshalling to " + file + ": " + e.getMessage());
        }
    }


    public static slash.navigation.tcx.binding2.TrainingCenterDatabaseT unmarshal2(InputStream in) throws JAXBException {
        slash.navigation.tcx.binding2.TrainingCenterDatabaseT result = null;
        try {
            JAXBElement element = (JAXBElement) newUnmarshaller2().unmarshal(in);
            result = (slash.navigation.tcx.binding2.TrainingCenterDatabaseT) element.getValue();
        } catch (ClassCastException e) {
            throw new JAXBException("Parse error with " + result + ": " + e.getMessage(), e);
        }
        return result;
    }

    public static slash.navigation.tcx.binding2.TrainingCenterDatabaseT unmarshal2(File file) throws JAXBException {
        try {
            FileInputStream in = new FileInputStream(file);
            try {
                return unmarshal2(in);
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new JAXBException("Error while unmarshalling from " + file + ": " + e.getMessage());
        }
    }

    public static void marshal2(slash.navigation.tcx.binding2.TrainingCenterDatabaseT trainingCenterDatabaseT, File file) throws JAXBException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            try {
                newMarshaller2().marshal(new JAXBElement<slash.navigation.tcx.binding2.TrainingCenterDatabaseT>(new QName(TCX_2_NAMESPACE_URI, "TrainingCenterDatabase"), slash.navigation.tcx.binding2.TrainingCenterDatabaseT.class, trainingCenterDatabaseT), fos);
            }
            finally {
                fos.flush();
                fos.close();
            }
        } catch (IOException e) {
            throw new JAXBException("Error while marshalling to " + file + ": " + e.getMessage());
        }
    }
}
