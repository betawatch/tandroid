package u9;

import org.telegram.ui.wc1;
import r0.f1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class o implements ua.b {
    public static final f1 c = new f1(29);
    public static final ab.m d = new ab.m(2);
    public ua.a a;
    public volatile ua.b b;

    public o(f1 f1Var, ua.b bVar) {
        this.a = f1Var;
        this.b = bVar;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.a = new wc1(17, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // ua.b
    public final Object get() {
        return this.b.get();
    }
}
