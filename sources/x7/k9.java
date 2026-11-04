package x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k9 extends i9 {
    public static final k9 e = new k9(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public k9(int i3, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        w5.a(i3, this.d);
        Object obj = this.c[i3];
        obj.getClass();
        return obj;
    }

    @Override // x7.i9, x7.f9
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // x7.f9
    public final int i() {
        return this.d;
    }

    @Override // x7.f9
    public final int j() {
        return 0;
    }

    @Override // x7.f9
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
