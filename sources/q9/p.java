package q9;

import org.telegram.ui.js0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class p implements pa.b {
    public static final js0 c = new js0(21);
    public static final f d = new f(1);
    public pa.a a;
    public volatile pa.b b;

    public p(js0 js0Var, pa.b bVar) {
        this.a = js0Var;
        this.b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new rv0(24, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override // pa.b
    public final Object get() {
        return this.b.get();
    }
}
