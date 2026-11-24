// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z79 extends mo5 {
    public final /* synthetic */ a89 c;

    public z79(a89 a89Var) {
        this.c = a89Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a89 a89Var = this.c;
        jte.j(i, a89Var.h);
        Object[] objArr = a89Var.e;
        int i2 = i << 1;
        boolean z = a89Var.f;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // go5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
