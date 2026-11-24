// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class s8d extends r6d {
    public final transient Object[] r;
    public final transient boolean s;
    public final transient int w;

    /* JADX WARN: Multi-variable type inference failed */
    public s8d(int i, int i2, Object[] objArr) {
        super((byte) 2);
        this.r = objArr;
        this.s = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k4f.a(i, this.w);
        Object obj = this.r[(i << 1) + (this.s ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
