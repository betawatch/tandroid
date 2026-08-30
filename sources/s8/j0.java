package s8;

import j$.util.Objects;
import java.util.AbstractMap;
import k7.b7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j0 extends v {
    public final /* synthetic */ k0 c;

    public j0(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k0 k0Var = this.c;
        b7.c(i10, k0Var.f);
        Object[] objArr = k0Var.e;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // s8.q
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
