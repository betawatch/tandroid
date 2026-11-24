// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r7e extends x5e {
    public final /* synthetic */ x7e r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7e(x7e x7eVar) {
        super((byte) 5);
        this.r = x7eVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        x7e x7eVar = this.r;
        r3f.a(i, x7eVar.x);
        Object[] objArr = x7eVar.w;
        int i2 = i << 1;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.x;
    }
}
