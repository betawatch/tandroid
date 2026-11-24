// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
