package s9;

import org.telegram.ui.bh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q implements ra.b {
    public static final s0.b c = new s0.b(5);
    public static final f d = new f(1);
    public ra.a a;
    public volatile ra.b b;

    public q(s0.b bVar, ra.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void a(ra.a aVar) {
        ra.b bVar;
        ra.b bVar2;
        ra.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new bh1(12, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override // ra.b
    public final Object get() {
        return this.b.get();
    }
}
