package x6;

import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends o {
    public static final Object[] r;
    public static final y s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i9;
        this.f = objArr2;
        this.h = i10;
        this.n = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i9 = this.h & rotateLeft;
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i9 + 1;
        }
    }

    @Override // x6.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // x6.h
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i9 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return t().listIterator(0);
    }

    @Override // x6.h
    public final int n() {
        return this.n;
    }

    @Override // x6.h
    public final int o() {
        return 0;
    }

    @Override // x6.h
    public final d0 p() {
        return t().listIterator(0);
    }

    @Override // x6.h
    public final Object[] q() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // x6.o
    public final m u() {
        return m.t(this.n, this.d);
    }
}
