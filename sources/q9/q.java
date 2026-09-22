package q9;

import org.telegram.ui.rv0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class q implements pa.b {
    public static final p c = new p(0);
    public static final f d = new f(1);
    public pa.a a;
    public volatile pa.b b;

    public q(p pVar, pa.b bVar) {
        this.a = pVar;
        this.b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new rv0(25, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override // pa.b
    public final Object get() {
        return this.b.get();
    }
}
