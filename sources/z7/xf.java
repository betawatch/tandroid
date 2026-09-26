package z7;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class xf implements tf {
    public final q9.n a;
    public final sf b;

    public xf(Context context, sf sfVar) {
        this.b = sfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 6));
        }
        this.a = new q9.n(new v7.b9(c10, 7));
    }

    @Override // z7.tf
    public final void a(a5.a aVar) {
        this.b.getClass();
        ((l5.r) this.a.get()).a(aVar.b != 0 ? new i5.a(null, aVar.B(), i5.d.a, null) : new i5.a(null, aVar.B(), i5.d.b, null), new j2.e(19));
    }
}
