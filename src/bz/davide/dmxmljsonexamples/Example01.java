/*
DMXmlJsonExamples - Examples for the Java binding framework for xml and json - http://www.davide.bz/dmxj

Copyright (C) 2013 Davide Montesin <d@vide.bz> - Bolzano/Bozen - Italy

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>
*/

package bz.davide.dmxmljsonexamples;

import java.io.ByteArrayInputStream;

import bz.davide.dmxmljson.marshalling.json.JSONStructure;
import bz.davide.dmxmljson.marshalling.xml.XMLStructure;
import bz.davide.dmxmljson.unmarshalling.xml.W3CXMLStructure;
import bz.davide.dmxmljsonexamples.model.DVD;
import bz.davide.dmxmljsonexamples.model.Invoice;
import bz.davide.dmxmljsonexamples.model.Product;

public class Example01
{
   public static void main(String[] args) throws Exception
   {
      Invoice invoice = new Invoice();
      invoice.setDate("2013-11-15");
      Product bike = new Product("bike");
      invoice.addRow(2, bike);
      invoice.addRow(1, new DVD("Hackers"));

      //XMLStructureRules structureRules = new XMLStructureRules();
      //structureRules.setPrimitiveTypePolicy(PrimitiveTypePolicy.ATTRIBUTE);

      XMLStructure xmlStructure = new XMLStructure("invoice" /*, structureRules*/);
      Example01Marshaller example01Marshaller = new Example01Marshaller();
      example01Marshaller.marschall(invoice, xmlStructure);

      String xml = xmlStructure.toString();
      System.out.println(xml);

      JSONStructure jsonStructure = new JSONStructure();
      example01Marshaller.marschall(invoice, jsonStructure);

      String json = jsonStructure.toString();
      System.out.println(json);

      //////////// from xml/json back to objects 

      invoice = new Invoice();

      Example01Unmarshaller example01Unmarshaller = new Example01Unmarshaller();
      W3CXMLStructure w3cxmlStructure = new W3CXMLStructure(new ByteArrayInputStream(xml.getBytes()));
      example01Unmarshaller.unmarschall(w3cxmlStructure, invoice);

      System.out.println("Invoice date: " + invoice.getDate());
      System.out.println("Invoice number: " + invoice.getNumber());

   }
}
