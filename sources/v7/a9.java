package v7;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a9 implements w8 {
    public final r9.n a;
    public final u8 b;

    public a9(Context context, u8 u8Var) {
        this.b = u8Var;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new z8(c10, 0));
        }
        this.a = new r9.n(new z8(c10, 1));
    }

    @Override // v7.w8
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.r) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.E(), i5.d.a, null) : new i5.a(null, aVar.E(), i5.d.b, null), new k2.k0(5));
    }
}
