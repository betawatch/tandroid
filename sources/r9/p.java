package r9;

import qg.f0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class p implements qa.b {
    public static final f0 c = new f0(7);
    public static final f d = new f(1);
    public qa.a a;
    public volatile qa.b b;

    public p(f0 f0Var, qa.b bVar) {
        this.a = f0Var;
        this.b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.b;
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
                this.a = new org.telegram.ui.web.m(6, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override // qa.b
    public final Object get() {
        return this.b.get();
    }
}
