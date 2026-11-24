// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class srd extends nrd {
    public static final srd e = new srd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public srd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i1f.a(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // nrd, ard
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // ard
    public final int i() {
        return this.d;
    }

    @Override // ard
    public final boolean k() {
        return false;
    }

    @Override // ard
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
