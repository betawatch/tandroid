package z7;

import c8.ie;
import java.util.AbstractMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class wa extends ta {
    public final /* synthetic */ xa c;

    public wa(xa xaVar) {
        this.c = xaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        xa xaVar = this.c;
        ie.a(i7, xaVar.e);
        Object[] objArr = xaVar.d;
        int i10 = i7 + i7;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
