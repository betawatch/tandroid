package v7;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class b9 implements x8 {
    public final r9.n a;
    public final v8 b;

    public b9(Context context, v8 v8Var) {
        this.b = v8Var;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new a9(c10, 0));
        }
        this.a = new r9.n(new a9(c10, 1));
    }

    @Override // v7.x8
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.s) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.F(), i5.d.a, null) : new i5.a(null, aVar.F(), i5.d.b, null), new k2.f0(4));
    }
}
