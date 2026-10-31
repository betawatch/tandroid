package xd;

import wd.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b {
    public o[] a;
    public int b;
    public int c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.b - 1;
                this.b = i10;
                if (i10 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                oVar.a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
