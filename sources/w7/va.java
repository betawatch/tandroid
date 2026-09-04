package w7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class va extends sa {
    public final /* synthetic */ wa c;

    public va(wa waVar) {
        this.c = waVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        wa waVar = this.c;
        a8.a(i10, waVar.e);
        Object[] objArr = waVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
