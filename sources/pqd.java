// default package

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pqd extends mod {
    public static final pqd y;
    public final transient omd x;

    static {
        ukd ukdVar = omd.n;
        y = new pqd(fqd.w, tpd.b);
    }

    public pqd(omd omdVar, Comparator comparator) {
        super(comparator);
        this.x = omdVar;
    }

    @Override // dnd
    public final omd A() {
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

    public final pqd H(int i, int i2) {
        omd omdVar = this.x;
        if (i == 0) {
            if (i2 == omdVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.s;
        return i < i2 ? new pqd(omdVar.subList(i, i2), comparator) : mod.E(comparator);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int G = G(obj, true);
        omd omdVar = this.x;
        if (G == omdVar.size()) {
            return null;
        }
        return omdVar.get(G);
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
        if (collection instanceof spd) {
            collection = ((spd) collection).zza();
        }
        Comparator comparator = this.s;
        if (!y5f.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ukd listIterator = this.x.listIterator(0);
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

    @Override // dnd, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            omd omdVar = this.x;
            if (omdVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.s;
                if (!y5f.a(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    ukd listIterator = omdVar.listIterator(0);
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

    @Override // mod, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.x.get(0);
        }
        lq5.n();
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
        omd omdVar = this.x;
        if (G == omdVar.size()) {
            return null;
        }
        return omdVar.get(G);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.x.listIterator(0);
    }

    @Override // mod, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            lq5.n();
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

    @Override // b4d
    public final int p(Object[] objArr) {
        return this.x.p(objArr);
    }

    @Override // b4d
    public final int q() {
        return this.x.q();
    }

    @Override // b4d
    public final int s() {
        return this.x.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x.size();
    }

    @Override // b4d
    public final v9c u() {
        return this.x.listIterator(0);
    }

    @Override // b4d
    public final Object[] v() {
        return this.x.v();
    }
}
