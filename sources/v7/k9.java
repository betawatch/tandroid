package v7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k9 extends h9 {
    public final /* synthetic */ a c;

    public k9(a aVar) {
        this.c = aVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        a aVar = this.c;
        w7.w7.a(i10, aVar.e);
        int i11 = i10 + i10;
        Object[] objArr = aVar.d;
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
