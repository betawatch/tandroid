package y7;

import c8.fe;
import java.util.AbstractMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class n9 extends k9 {
    public final /* synthetic */ a c;

    public n9(a aVar) {
        this.c = aVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        a aVar = this.c;
        fe.a(i7, aVar.e);
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
