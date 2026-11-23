package y7;

import a8.xa;
import a8.ya;
import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f9 implements d9 {
    public final u9.m a;
    public final b9 b;

    public f9(Context context, b9 b9Var) {
        this.b = b9Var;
        m5.a aVar = m5.a.e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 4));
        }
        this.a = new u9.m(new ya(c10, 5));
    }

    @Override // y7.d9
    public final void a(xa xaVar) {
        this.b.getClass();
        ((o5.s) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.E()) : new l5.a(null, xaVar.E(), l5.d.b, null), new n2.a0(8));
    }
}
