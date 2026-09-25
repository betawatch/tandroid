package z7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class n extends i {
    public final /* synthetic */ o c;

    public n(o oVar) {
        this.c = oVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        o oVar = this.c;
        w7.m9.a(i10, oVar.e);
        Object[] objArr = oVar.d;
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
