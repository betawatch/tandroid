// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y9e extends k8e {
    public static final y9e w = new y9e(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public y9e(int i, Object[] objArr) {
        super((byte) 5);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h6f.a(i, this.s);
        Object obj = this.r[i];
        obj.getClass();
        return obj;
    }

    @Override // k8e, b4d
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // b4d
    public final int q() {
        return this.s;
    }

    @Override // b4d
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // b4d
    public final Object[] x() {
        return this.r;
    }
}
