package v7;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c9 implements y8 {
    public final q9.n a;
    public final w8 b;

    public c9(Context context, w8 w8Var) {
        this.b = w8Var;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new b9(c10, 0));
        }
        this.a = new q9.n(new b9(c10, 1));
    }

    @Override // v7.y8
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.s) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.B(), i5.d.a, null) : new i5.a(null, aVar.B(), i5.d.b, null), new j2.e(22));
    }
}
