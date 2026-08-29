package q8;

import i7.p6;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 extends z {
    public final /* synthetic */ n0 c;

    public m0(n0 n0Var) {
        this.c = n0Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0 n0Var = this.c;
        p6.b(i10, n0Var.f);
        Object[] objArr = n0Var.e;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // q8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
