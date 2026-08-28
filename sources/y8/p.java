package y8;

import org.telegram.ui.ei1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements x9.b {
    public static final v0.l c = new v0.l(11);
    public static final f d = new f(1);
    public x9.a a;
    public volatile x9.b b;

    public p(v0.l lVar, x9.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    public final void a(x9.a aVar) {
        x9.b bVar;
        x9.b bVar2;
        x9.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.e(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new ei1(12, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.e(bVar);
        }
    }

    @Override // x9.b
    public final Object get() {
        return this.b.get();
    }
}
