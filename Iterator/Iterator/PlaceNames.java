package Iterator;

public class PlaceNames implements Guide {
   public String Place[] = { "Rajkot", "Ahmedabad", "Surat", "Vadodara" };

   public Iterator getIterator() {
      return new PlaceIterator();
   }

   private class PlaceIterator implements Iterator {
      int index;

      @Override
      public boolean isNext() {
         if (index < Place.length) {
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if (this.isNext()) {
            return Place[index++];
         }
         return null;
      }
   }
}