// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r3c {
    public final /* synthetic */ a4c a;
    public final /* synthetic */ d4c b;

    public r3c(d4c d4cVar, a4c a4cVar) {
        this.b = d4cVar;
        this.a = a4cVar;
    }

    public final int a() {
        return this.b.s.w;
    }

    public final void b(boolean z) {
        d4c d4cVar = this.b;
        t3c t3cVar = d4cVar.n;
        if (z) {
            y59 adapter = t3cVar.getAdapter();
            e3b e3bVar = d4cVar.w;
            if (adapter == e3bVar) {
                return;
            } else {
                t3cVar.setAdapter(e3bVar);
            }
        } else {
            y59 adapter2 = t3cVar.getAdapter();
            c4c c4cVar = d4cVar.s;
            if (adapter2 == c4cVar) {
                return;
            } else {
                t3cVar.setAdapter(c4cVar);
            }
        }
        if (t3cVar.getAdapter().b() > 0) {
            d4cVar.r.h1(0, gm.L(58.0f) + (-t3cVar.getPaddingTop()) + d4cVar.F, false);
        }
    }
}
