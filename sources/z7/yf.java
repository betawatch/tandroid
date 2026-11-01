package z7;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class yf implements uf {
    public final r9.n a;
    public final tf b;

    public yf(Context context, tf tfVar) {
        this.b = tfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.z8(c10, 6));
        }
        this.a = new r9.n(new v7.z8(c10, 7));
    }

    @Override // z7.uf
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.r) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.E(), i5.d.a, null) : new i5.a(null, aVar.E(), i5.d.b, null), new k2.k0(5));
    }
}
