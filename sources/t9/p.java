package t9;

import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements ta.b {
    public static final s0.b c = new s0.b(17);
    public static final f d = new f(1);
    public ta.a a;
    public volatile ta.b b;

    public p(s0.b bVar, ta.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final void a(ta.a aVar) {
        ta.b bVar;
        ta.b bVar2;
        ta.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new na1(14, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override // ta.b
    public final Object get() {
        return this.b.get();
    }
}
