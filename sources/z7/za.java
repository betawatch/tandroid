package z7;

import c8.le;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class za extends ta {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public za(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        le.a(i7, this.e);
        Object obj = this.c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
