package q7;

import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public y(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i7;
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
            int i7 = rotateLeft & this.h;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i7 + 1;
        }
    }

    @Override // q7.h
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i7 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // q7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // q7.h
    public final int i() {
        return this.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // q7.h
    public final int j() {
        return 0;
    }

    @Override // q7.h
    public final d0 k() {
        return o().listIterator(0);
    }

    @Override // q7.h
    public final Object[] l() {
        return this.d;
    }

    @Override // q7.o
    public final m p() {
        return m.o(this.n, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
