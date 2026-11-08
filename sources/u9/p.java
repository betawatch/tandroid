package u9;

import org.telegram.ui.web.a0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p implements ua.b {
    public static final s0.b c = new s0.b(27);
    public static final ab.m d = new ab.m(2);
    public ua.a a;
    public volatile ua.b b;

    public p(s0.b bVar, ua.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.a = new a0(13, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override // ua.b
    public final Object get() {
        return this.b.get();
    }
}
