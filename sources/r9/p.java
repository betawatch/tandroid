package r9;

import org.telegram.ui.web.k0;
import org.telegram.utils.twidget.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p implements qa.b {
    public static final t c = new t(22);
    public static final f d = new f(1);
    public qa.a a;
    public volatile qa.b b;

    public p(t tVar, qa.b bVar) {
        this.a = tVar;
        this.b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.b;
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
                this.a = new k0(12, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override // qa.b
    public final Object get() {
        return this.b.get();
    }
}
