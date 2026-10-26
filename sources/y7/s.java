package y7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s extends n {
    public final /* synthetic */ t c;

    public s(t tVar) {
        this.c = tVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        t tVar = this.c;
        w7.h5.a(i10, tVar.e);
        int i11 = i10 + i10;
        Object[] objArr = tVar.d;
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
