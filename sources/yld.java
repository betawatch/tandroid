// default package

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yld extends vjd {
    public static final yld y;
    public final transient xhd x;

    static {
        dgd dgdVar = xhd.n;
        y = new yld(old.w, cld.b);
    }

    public yld(xhd xhdVar, Comparator comparator) {
        super(comparator);
        this.x = xhdVar;
    }

    @Override // mid
    public final xhd A() {
        return this.x;
    }

    public final int F(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.x, obj, this.s);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int G(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.x, obj, this.s);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final yld H(int i, int i2) {
        xhd xhdVar = this.x;
        if (i == 0) {
            if (i2 == xhdVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.s;
        return i < i2 ? new yld(xhdVar.subList(i, i2), comparator) : vjd.E(comparator);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int G = G(obj, true);
        xhd xhdVar = this.x;
        if (G == xhdVar.size()) {
            return null;
        }
        return xhdVar.get(G);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.x, obj, this.s) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof bld) {
            collection = ((bld) collection).zza();
        }
        Comparator comparator = this.s;
        if (!g1f.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        dgd listIterator = this.x.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.x.y().listIterator(0);
    }

    @Override // mid, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            xhd xhdVar = this.x;
            if (xhdVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.s;
                if (!g1f.a(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    dgd listIterator = xhdVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // vjd, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.x.get(0);
        }
        w26.g();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int F = F(obj, true) - 1;
        if (F == -1) {
            return null;
        }
        return this.x.get(F);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int G = G(obj, false);
        xhd xhdVar = this.x;
        if (G == xhdVar.size()) {
            return null;
        }
        return xhdVar.get(G);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.x.listIterator(0);
    }

    @Override // vjd, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            w26.g();
            return null;
        }
        return this.x.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int F = F(obj, false) - 1;
        if (F == -1) {
            return null;
        }
        return this.x.get(F);
    }

    @Override // kzc
    public final int p(Object[] objArr) {
        return this.x.p(objArr);
    }

    @Override // kzc
    public final int q() {
        return this.x.q();
    }

    @Override // kzc
    public final int s() {
        return this.x.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x.size();
    }

    @Override // kzc
    public final v5c u() {
        return this.x.listIterator(0);
    }

    @Override // kzc
    public final Object[] v() {
        return this.x.v();
    }
}
