package q9;

import org.telegram.ui.bs0;
import org.telegram.ui.tv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class p implements pa.b {
    public static final bs0 c = new bs0(22);
    public static final f d = new f(1);
    public pa.a a;
    public volatile pa.b b;

    public p(bs0 bs0Var, pa.b bVar) {
        this.a = bs0Var;
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
                this.a = new tv0(24, this.a, aVar);
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
