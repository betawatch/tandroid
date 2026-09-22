package t7;

import j$.util.Objects;
import java.util.AbstractMap;
import w7.i7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h extends d {
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i iVar = this.c;
        i7.a(i10, iVar.e);
        Object[] objArr = iVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
