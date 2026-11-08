package y7;

import c8.yd;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class l9 extends i9 implements List, RandomAccess {
    public static final j9 b = new j9(n9.e, 0);

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (0; i7 < size; i7 + 1) {
                        Object obj2 = get(i7);
                        Object obj3 = list.get(i7);
                        i7 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i7 + 1 : 0;
                    }
                    return true;
                }
                j9 listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // y7.i9
    public int f(Object[] objArr) {
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = get(i7);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (i7 * 31) + get(i10).hashCode();
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public l9 subList(int i7, int i10) {
        yd.b(i7, i10, size());
        int i11 = i10 - i7;
        return i11 == size() ? this : i11 == 0 ? n9.e : new k9(this, i7, i11);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final j9 listIterator(int i7) {
        int size = size();
        if (i7 < 0 || i7 > size) {
            throw new IndexOutOfBoundsException(yd.c(i7, size, "index"));
        }
        return isEmpty() ? b : new j9(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }
}
