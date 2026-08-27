package p8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r0 extends c0 {
    public static final Object[] r;
    public static final r0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new r0(0, 0, 0, objArr, objArr);
    }

    public r0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // p8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int p6 = l.p(obj);
                while (true) {
                    int i10 = p6 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    p6 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // p8.c0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // p8.u
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // p8.u
    public final Object[] o() {
        return this.d;
    }

    @Override // p8.u
    public final int p() {
        return this.n;
    }

    @Override // p8.u
    public final int q() {
        return 0;
    }

    @Override // p8.u
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // p8.c0
    public final z v() {
        return z.s(this.n, this.d);
    }

    @Override // p8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
