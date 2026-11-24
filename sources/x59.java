// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x59 extends mm5 {
    public final /* synthetic */ y59 c;

    public x59(y59 y59Var) {
        this.c = y59Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y59 y59Var = this.c;
        gre.j(i, y59Var.h);
        Object[] objArr = y59Var.e;
        int i2 = i << 1;
        boolean z = y59Var.f;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // gm5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
