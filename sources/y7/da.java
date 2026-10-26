package y7;

import a8.ng;
import a8.og;
import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class da implements ba {
    public final s9.n a;
    public final z9 b;

    public da(Context context, z9 z9Var) {
        this.b = z9Var;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.n(new og(c10, 6));
        }
        this.a = new s9.n(new og(c10, 7));
    }

    @Override // y7.ba
    public final void a(ng ngVar) {
        this.b.getClass();
        ((m5.s) this.a.get()).a(ngVar.b != 0 ? new j5.a(null, ngVar.F(), j5.d.a, null) : new j5.a(null, ngVar.F(), j5.d.b, null), new m4.x0(11));
    }
}
