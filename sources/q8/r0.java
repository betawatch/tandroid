package q8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // q8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int p10 = l.p(obj);
                while (true) {
                    int i10 = p10 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    p10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // q8.c0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // q8.u
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // q8.u
    public final Object[] o() {
        return this.d;
    }

    @Override // q8.u
    public final int p() {
        return this.n;
    }

    @Override // q8.u
    public final int q() {
        return 0;
    }

    @Override // q8.u
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // q8.c0
    public final z v() {
        return z.s(this.n, this.d);
    }

    @Override // q8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
