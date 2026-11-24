// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ozc extends nzc {
    public static final ozc s = new ozc(new Object[0]);
    public final transient Object[] r;

    public ozc(Object[] objArr) {
        super((byte) 0);
        this.r = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qye.a(i, 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // nzc, kzc
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
        return 0;
    }

    @Override // kzc
    public final Object[] k() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
