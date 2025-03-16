import java.util.*;
class HashsetIterator
{
public static void main(String args[])
{
HashSet<String> hs=new HashSet<String>();
HashSet<Integer> hsi=new HashSet<Integer>();
hs.add("CSE");
hs.add("ECE");
hs.add("IT");
hs.add("IOT");
hs.add("AIML");
hs.add("MECH");

hsi.add(2208);
hsi.add(2209);
hsi.add(2204);
hsi.add(2206);
hsi.add(2200);
hsi.add(2205);

System.out.println("Hash Set of Dept names= "+hs);

System.out.println("Hash Set of Dept Rooms = "+hsi);

//Add Iterator interface to HasSet to retrive the data elements line by line

Iterator it=hs.iterator();
System.out.println("Elements using Iterator:");
while(it.hasNext())
{
String s=(String)it.next();
System.out.println(s);
}

Iterator it1=hsi.iterator();
System.out.println("Elements using Iterator2:");
while(it1.hasNext()) //hasNext()  to check the next element in data.
{
int i=(int)it1.next();
System.out.println(i);
}
}
}