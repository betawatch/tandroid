package w7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
