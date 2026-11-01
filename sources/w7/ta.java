package w7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ta extends qa {
    public final /* synthetic */ ua c;

    public ta(ua uaVar) {
        this.c = uaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        ua uaVar = this.c;
        n8.a(i10, uaVar.e);
        Object[] objArr = uaVar.d;
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
