
/**
* BanqueHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from banque.idl
* samedi 20 novembre 2021 22 h 38 GMT+01:00
*/

public final class BanqueHolder implements org.omg.CORBA.portable.Streamable
{
  public Banque value = null;

  public BanqueHolder ()
  {
  }

  public BanqueHolder (Banque initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BanqueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BanqueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BanqueHelper.type ();
  }

}
