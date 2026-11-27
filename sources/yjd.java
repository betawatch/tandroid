// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yjd extends ghd {
    public static final yjd r = new yjd(0, new Object[0]);
    public final transient Object[] h;
    public final transient int n;

    public yjd(int i, Object[] objArr) {
        super((byte) 1);
        this.h = objArr;
        this.n = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b9f.a(i, this.n);
        Object obj = this.h[i];
        obj.getClass();
        return obj;
    }

    @Override // ghd, qdd
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // qdd
    public final int i() {
        return this.n;
    }

    @Override // qdd
    public final int j() {
        return 0;
    }

    @Override // qdd
    public final Object[] k() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
