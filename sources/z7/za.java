package z7;

import c8.ie;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        ie.a(i7, this.e);
        Object obj = this.c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
