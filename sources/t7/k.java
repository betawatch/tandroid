package t7;

import j$.util.Objects;
import w7.i7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class k extends d {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public k(int i10, int i11, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i7.a(i10, this.e);
        Object obj = this.c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
