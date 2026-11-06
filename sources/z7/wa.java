package z7;

import c8.ie;
import java.util.AbstractMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
