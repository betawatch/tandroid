package x6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z extends s {
    public static final z h;
    public final transient m f;

    static {
        i iVar = m.b;
        h = new z(x.e, v.b);
    }

    public z(m mVar, Comparator comparator) {
        super(comparator);
        this.f = mVar;
    }

    public final z A(int i9, int i10) {
        m mVar = this.f;
        if (i9 == 0) {
            if (i10 == mVar.size()) {
                return this;
            }
            i9 = 0;
        }
        Comparator comparator = this.d;
        return i9 < i10 ? new z(mVar.subList(i9, i10), comparator) : s.x(comparator);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int z10 = z(obj, true);
        m mVar = this.f;
        if (z10 == mVar.size()) {
            return null;
        }
        return mVar.get(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f, obj, this.d) >= 0) {
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
        if (collection instanceof u) {
            collection = ((u) collection).zza();
        }
        Comparator comparator = this.d;
        if (!a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        i listIterator = this.f.listIterator(0);
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
        return this.f.r().listIterator(0);
    }

    @Override // x6.o, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            m mVar = this.f;
            if (mVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    i listIterator = mVar.listIterator(0);
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

    @Override // x6.s, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int y10 = y(obj, true) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f.get(y10);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int z10 = z(obj, false);
        m mVar = this.f;
        if (z10 == mVar.size()) {
            return null;
        }
        return mVar.get(z10);
    }

    @Override // x6.h
    public final int i(Object[] objArr) {
        return this.f.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // x6.s, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int y10 = y(obj, false) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f.get(y10);
    }

    @Override // x6.h
    public final int n() {
        return this.f.n();
    }

    @Override // x6.h
    public final int o() {
        return this.f.o();
    }

    @Override // x6.h
    public final d0 p() {
        return this.f.listIterator(0);
    }

    @Override // x6.h
    public final Object[] q() {
        return this.f.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    @Override // x6.o
    public final m t() {
        return this.f;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int z(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }
}
