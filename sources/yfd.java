// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yfd extends ccd {
    public final /* synthetic */ dgd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfd(dgd dgdVar) {
        super((byte) 0);
        this.h = dgdVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        dgd dgdVar = this.h;
        n4f.a(i, dgdVar.r ? 1 : 0);
        Object[] objArr = dgdVar.n;
        int i2 = i << 1;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.r ? 1 : 0;
    }
}
