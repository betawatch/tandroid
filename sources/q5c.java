// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q5c {
    public final /* synthetic */ z5c a;
    public final /* synthetic */ d6c b;

    public q5c(d6c d6cVar, z5c z5cVar) {
        this.b = d6cVar;
        this.a = z5cVar;
    }

    public final int a() {
        return this.b.s.w;
    }

    public final void b(boolean z) {
        d6c d6cVar = this.b;
        s5c s5cVar = d6cVar.n;
        if (z) {
            j79 adapter = s5cVar.getAdapter();
            z4b z4bVar = d6cVar.w;
            if (adapter == z4bVar) {
                return;
            } else {
                s5cVar.setAdapter(z4bVar);
            }
        } else {
            j79 adapter2 = s5cVar.getAdapter();
            c6c c6cVar = d6cVar.s;
            if (adapter2 == c6cVar) {
                return;
            } else {
                s5cVar.setAdapter(c6cVar);
            }
        }
        if (s5cVar.getAdapter().b() > 0) {
            d6cVar.r.h1(0, hl.L(58.0f) + (-s5cVar.getPaddingTop()) + d6cVar.F, false);
        }
    }
}
