package x7;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class ga implements ea {
    public final q9.n a;
    public final ba b;

    public ga(Context context, ba baVar) {
        this.b = baVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 4));
        }
        this.a = new q9.n(new v7.a9(c10, 5));
    }

    @Override // x7.ea
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.s) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.B(), i5.d.a, null) : new i5.a(null, aVar.B(), i5.d.b, null), new j2.e(18));
    }
}
