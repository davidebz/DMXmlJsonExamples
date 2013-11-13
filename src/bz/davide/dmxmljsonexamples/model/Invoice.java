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

package bz.davide.dmxmljsonexamples.model;

import java.util.ArrayList;

public class Invoice
{

   int                   number;
   String                date;
   Person                customer;

   ArrayList<InvoiceRow> rows = new ArrayList<InvoiceRow>();

   public Invoice()
   {
   }

   protected Invoice(Void void1)
   {

   }

   public int getNumber()
   {
      return this.number;
   }

   public void setNumber(int number)
   {
      this.number = number;
   }

   public String getDate()
   {
      return this.date;
   }

   public void setDate(String date)
   {
      this.date = date;
   }

   public Person getCustomer()
   {
      return this.customer;
   }

   public void setCustomer(Person customer)
   {
      this.customer = customer;
   }

   public void addRow(int quantity, Product product)
   {
      InvoiceRow row = new InvoiceRow();
      row.quantity = quantity;
      row.product = product;

      this.rows.add(row);
   }
}
