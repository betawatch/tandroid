package s8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o0 extends z {
    public static final Object[] r;
    public static final o0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new o0(0, 0, 0, objArr, objArr);
    }

    public o0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // s8.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int m9 = l.m(obj == null ? 0 : obj.hashCode());
                while (true) {
                    int i10 = m9 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    m9 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // s8.z, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // s8.q
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // s8.q
    public final Object[] o() {
        return this.d;
    }

    @Override // s8.q
    public final int p() {
        return this.n;
    }

    @Override // s8.q
    public final int q() {
        return 0;
    }

    @Override // s8.q
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // s8.z
    public final v v() {
        return v.s(this.n, this.d);
    }

    @Override // s8.z
    /* renamed from: w */
    public final u0 iterator() {
        return i().listIterator(0);
    }
}
