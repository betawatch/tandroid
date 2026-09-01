package s8;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
