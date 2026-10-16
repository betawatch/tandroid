package z7;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class yf implements tf {
    public final r9.n a;
    public final sf b;

    public yf(Context context, sf sfVar) {
        this.b = sfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 6));
        }
        this.a = new r9.n(new v7.a9(c10, 7));
    }

    @Override // z7.tf
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.r) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.F(), i5.d.a, null) : new i5.a(null, aVar.F(), i5.d.b, null), new k2.y0(2));
    }
}
