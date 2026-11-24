// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vjd extends fhd {
    public final /* synthetic */ ckd c;

    public vjd(ckd ckdVar) {
        this.c = ckdVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ckd ckdVar = this.c;
        u1f.a(i, ckdVar.e);
        Object[] objArr = ckdVar.d;
        int i2 = i << 1;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // ogd
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
