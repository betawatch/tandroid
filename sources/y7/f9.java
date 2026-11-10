package y7;

import a8.wa;
import a8.xa;
import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f9 implements d9 {
    public final u9.n a;
    public final b9 b;

    public f9(Context context, b9 b9Var) {
        this.b = b9Var;
        m5.a aVar = m5.a.e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new xa(c10, 4));
        }
        this.a = new u9.n(new xa(c10, 5));
    }

    @Override // y7.d9
    public final void a(wa waVar) {
        this.b.getClass();
        ((o5.r) this.a.get()).a(waVar.b != 0 ? l5.a.a(waVar.E()) : new l5.a(null, waVar.E(), l5.d.b, null), new ni.a(3));
    }
}
