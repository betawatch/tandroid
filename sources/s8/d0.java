package s8;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d0 implements r8.i, Serializable {
    public final int a;

    public d0() {
        l.c(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // r8.i
    public final Object get() {
        return new ArrayList(this.a);
    }
}
