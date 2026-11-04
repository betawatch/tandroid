package p7;

import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends p {
    public static final Object[] r;
    public static final z s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new z(0, 0, 0, objArr, objArr);
    }

    public z(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i3;
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
            int i3 = rotateLeft & this.h;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i3 + 1;
        }
    }

    @Override // p7.i
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p7.p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // p7.i
    public final int i() {
        return this.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // p7.i
    public final int j() {
        return 0;
    }

    @Override // p7.i
    public final e0 k() {
        return o().listIterator(0);
    }

    @Override // p7.i
    public final Object[] l() {
        return this.d;
    }

    @Override // p7.p
    public final n p() {
        return n.o(this.n, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
