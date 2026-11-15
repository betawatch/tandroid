package y7;

import a8.xa;
import a8.ya;
import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e9 implements c9 {
    public final u9.m a;
    public final a9 b;

    public e9(Context context, a9 a9Var) {
        this.b = a9Var;
        m5.a aVar = m5.a.e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 4));
        }
        this.a = new u9.m(new ya(c10, 5));
    }

    @Override // y7.c9
    public final void a(xa xaVar) {
        this.b.getClass();
        ((o5.s) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.D()) : new l5.a(null, xaVar.D(), l5.d.b, null), new n2.a0(7));
    }
}
