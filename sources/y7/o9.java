package y7;

import c8.yd;
import java.util.AbstractMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o9 extends l9 {
    public final /* synthetic */ a c;

    public o9(a aVar) {
        this.c = aVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        a aVar = this.c;
        yd.a(i7, aVar.e);
        int i10 = i7 + i7;
        Object[] objArr = aVar.d;
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
