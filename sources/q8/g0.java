package q8;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g0 implements p8.i, Serializable {
    public final int a;

    public g0() {
        l.a(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // p8.i
    public final Object get() {
        return new ArrayList(this.a);
    }
}
