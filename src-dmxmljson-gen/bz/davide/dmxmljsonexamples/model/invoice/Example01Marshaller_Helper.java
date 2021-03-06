/*********************************************************************************
 *                                                                               *
 * WARNING: File automatically generated by DMXmlJson. DON'T CHANGE IT manually! *
 *                                                                               *
 *********************************************************************************/

package bz.davide.dmxmljsonexamples.model.invoice;


public class Example01Marshaller_Helper extends bz.davide.dmxmljson.marshalling.Marshaller
{
   protected Example01Marshaller_Helper()
   {
      this.putClassMarshaller("bz.davide.dmxmljsonexamples.model.invoice.Invoice", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // customer
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Invoice)obj).customer;
            if (value == null)
               structure.property("customer").nullValue();
            else
            {
                     internalMarschall(value, value.getClass().getName(),"bz.davide.dmxmljsonexamples.model.invoice.Person", structure.property("customer").structure(), identities, seq, false);
            }
            // date
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Invoice)obj).date;
            if (value == null)
               structure.property("date").nullValue();
            else
            {
                    structure.property("date").string((String)value);                          
            }
            // number
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Invoice)obj).number;
            if (value == null)
               structure.property("number").nullValue();
            else
            {
                    structure.property("number").integer((Integer)value);                          
            }
            // rows
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Invoice)obj).rows;
            if (value == null)
               structure.property("rows").nullValue();
            else
            {
               java.util.ArrayList arrayList = (java.util.ArrayList)value;                        
               bz.davide.dmxmljson.marshalling.Array array = structure.property("rows").array();        
               for (Object o: arrayList) {                                    
                  if (o == null)                                              
                     array.item().nullValue();                                
                  else                                                        
                     internalMarschall(o, o.getClass().getName(), "bz.davide.dmxmljsonexamples.model.invoice.InvoiceRow", array.item().structure(), identities, seq, false);
               }                                                              
            }
            if (!superClass)
               structure.close();
         }
      });
      this.putClassMarshaller("bz.davide.dmxmljsonexamples.model.invoice.DVD", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            internalMarschall(obj, "bz.davide.dmxmljsonexamples.model.invoice.Product", "N/A",structure, identities, seq, true);
            Object value;
            // title
            value = ((bz.davide.dmxmljsonexamples.model.invoice.DVD)obj).title;
            if (value == null)
               structure.property("title").nullValue();
            else
            {
                    structure.property("title").string((String)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });
      this.putClassMarshaller("bz.davide.dmxmljsonexamples.model.invoice.Person", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // name
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Person)obj).name;
            if (value == null)
               structure.property("name").nullValue();
            else
            {
                    structure.property("name").string((String)value);                          
            }
            // nr
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Person)obj).nr;
            if (value == null)
               structure.property("nr").nullValue();
            else
            {
                    structure.property("nr").integer((Integer)value);                          
            }
            // street
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Person)obj).street;
            if (value == null)
               structure.property("street").nullValue();
            else
            {
                    structure.property("street").string((String)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });
      this.putClassMarshaller("bz.davide.dmxmljsonexamples.model.invoice.InvoiceRow", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // product
            value = ((bz.davide.dmxmljsonexamples.model.invoice.InvoiceRow)obj).product;
            if (value == null)
               structure.property("product").nullValue();
            else
            {
                     internalMarschall(value, value.getClass().getName(),"bz.davide.dmxmljsonexamples.model.invoice.Product", structure.property("product").structure(), identities, seq, false);
            }
            // quantity
            value = ((bz.davide.dmxmljsonexamples.model.invoice.InvoiceRow)obj).quantity;
            if (value == null)
               structure.property("quantity").nullValue();
            else
            {
                    structure.property("quantity").integer((Integer)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });
      this.putClassMarshaller("bz.davide.dmxmljsonexamples.model.invoice.Product", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // name
            value = ((bz.davide.dmxmljsonexamples.model.invoice.Product)obj).name;
            if (value == null)
               structure.property("name").nullValue();
            else
            {
                    structure.property("name").string((String)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });

   }
}
