package s8;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
