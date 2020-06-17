package InterfaceComparable;

import CacDoiTuongHinhHoc.Circle;

public interface Comparable<C extends Circle> {
   int comparaTo(ComparableCircle o);
}
