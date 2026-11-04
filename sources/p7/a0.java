package p7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 extends t {
    public static final a0 h;
    public final transient n f;

    static {
        j jVar = n.b;
        h = new a0(y.e, w.b);
    }

    public a0(n nVar, Comparator comparator) {
        super(comparator);
        this.f = nVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int u10 = u(obj, true);
        n nVar = this.f;
        if (u10 == nVar.size()) {
            return null;
        }
        return nVar.get(u10);
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
        if (collection instanceof v) {
            collection = ((v) collection).zza();
        }
        Comparator comparator = this.d;
        if (!a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        j listIterator = this.f.listIterator(0);
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
        return this.f.m().listIterator(0);
    }

    @Override // p7.p, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            n nVar = this.f;
            if (nVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    j listIterator = nVar.listIterator(0);
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

    @Override // p7.t, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int t10 = t(obj, true) - 1;
        if (t10 == -1) {
            return null;
        }
        return this.f.get(t10);
    }

    @Override // p7.i
    public final int h(Object[] objArr) {
        return this.f.h(objArr);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int u10 = u(obj, false);
        n nVar = this.f;
        if (u10 == nVar.size()) {
            return null;
        }
        return nVar.get(u10);
    }

    @Override // p7.i
    public final int i() {
        return this.f.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // p7.i
    public final int j() {
        return this.f.j();
    }

    @Override // p7.i
    public final e0 k() {
        return this.f.listIterator(0);
    }

    @Override // p7.i
    public final Object[] l() {
        return this.f.l();
    }

    @Override // p7.t, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int t10 = t(obj, false) - 1;
        if (t10 == -1) {
            return null;
        }
        return this.f.get(t10);
    }

    @Override // p7.p
    public final n o() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    public final int t(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int u(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final a0 v(int i3, int i10) {
        n nVar = this.f;
        if (i3 == 0) {
            if (i10 == nVar.size()) {
                return this;
            }
            i3 = 0;
        }
        Comparator comparator = this.d;
        return i3 < i10 ? new a0(nVar.subList(i3, i10), comparator) : t.s(comparator);
    }
}
