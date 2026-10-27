package w7;

import a8.ng;
import a8.og;
import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e9 implements c9 {
    public final s9.o a;
    public final a9 b;

    public e9(Context context, a9 a9Var) {
        this.b = a9Var;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.o(new og(c10, 2));
        }
        this.a = new s9.o(new og(c10, 3));
    }

    @Override // w7.c9
    public final void a(ng ngVar) {
        this.b.getClass();
        ((m5.s) this.a.get()).a(ngVar.b != 0 ? new j5.a(null, ngVar.F(), j5.d.a, null) : new j5.a(null, ngVar.F(), j5.d.b, null), new m4.x0(11));
    }
}
