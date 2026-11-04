package x7;

import android.content.Context;
import b8.kg;
import b8.lg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c9 implements a9 {
    public final t9.n a;
    public final y8 b;

    public c9(Context context, y8 y8Var) {
        this.b = y8Var;
        l5.a aVar = l5.a.e;
        n5.s.b(context);
        n5.q c2 = n5.s.a().c(aVar);
        if (l5.a.d.contains(new k5.c("json"))) {
            new t9.n(new lg(c2, 2));
        }
        this.a = new t9.n(new lg(c2, 3));
    }

    @Override // x7.a9
    public final void a(kg kgVar) {
        this.b.getClass();
        ((n5.r) this.a.get()).a(kgVar.b != 0 ? k5.a.a(kgVar.F()) : new k5.a(null, kgVar.F(), k5.d.b, null), new l2.d(27));
    }
}
