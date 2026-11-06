package q7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int u10 = u(obj, true);
        m mVar = this.f;
        if (u10 == mVar.size()) {
            return null;
        }
        return mVar.get(u10);
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
        return this.f.m().listIterator(0);
    }

    @Override // q7.o, java.util.Collection, java.util.Set
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

    @Override // q7.h
    public final int f(Object[] objArr) {
        return this.f.f(objArr);
    }

    @Override // q7.s, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int t6 = t(obj, true) - 1;
        if (t6 == -1) {
            return null;
        }
        return this.f.get(t6);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int u10 = u(obj, false);
        m mVar = this.f;
        if (u10 == mVar.size()) {
            return null;
        }
        return mVar.get(u10);
    }

    @Override // q7.h
    public final int i() {
        return this.f.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // q7.h
    public final int j() {
        return this.f.j();
    }

    @Override // q7.h
    public final d0 k() {
        return this.f.listIterator(0);
    }

    @Override // q7.h
    public final Object[] l() {
        return this.f.l();
    }

    @Override // q7.s, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int t6 = t(obj, false) - 1;
        if (t6 == -1) {
            return null;
        }
        return this.f.get(t6);
    }

    @Override // q7.o
    public final m o() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    public final int t(Object obj, boolean z9) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z9 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int u(Object obj, boolean z9) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z9 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final z v(int i7, int i10) {
        m mVar = this.f;
        if (i7 == 0) {
            if (i10 == mVar.size()) {
                return this;
            }
            i7 = 0;
        }
        Comparator comparator = this.d;
        return i7 < i10 ? new z(mVar.subList(i7, i10), comparator) : s.s(comparator);
    }
}
