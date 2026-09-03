package s8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k7.b7;
import k7.c7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class v extends q implements List, RandomAccess {
    public static final t b = new t(i0.e, 0);

    public static i0 s(int i10, Object[] objArr) {
        return i10 == 0 ? i0.e : new i0(i10, objArr);
    }

    public static v t(Collection collection) {
        if (!(collection instanceof q)) {
            Object[] array = collection.toArray();
            l.b(array.length, array);
            return s(array.length, array);
        }
        v i10 = ((q) collection).i();
        if (!i10.r()) {
            return i10;
        }
        Object[] array2 = i10.toArray(q.a);
        return s(array2.length, array2);
    }

    public static i0 u(Object[] objArr) {
        if (objArr.length == 0) {
            return i0.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        l.b(objArr2.length, objArr2);
        return s(objArr2.length, objArr2);
    }

    public static i0 w(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        l.b(5, objArr);
        return s(5, objArr);
    }

    public static i0 x(Object obj) {
        Object[] objArr = {obj};
        l.b(1, objArr);
        return s(1, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // s8.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && b7.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (b7.a(get(i10), list.get(i10))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
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

    @Override // s8.q
    public int n(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final t listIterator(int i10) {
        c7.d(i10, size());
        return isEmpty() ? b : new t(this, i10);
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public v subList(int i10, int i11) {
        c7.e(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? i0.e : new u(this, i10, i12);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // s8.q
    public final v i() {
        return this;
    }
}
