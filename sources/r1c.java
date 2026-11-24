// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r1c {
    public final /* synthetic */ a2c a;
    public final /* synthetic */ d2c b;

    public r1c(d2c d2cVar, a2c a2cVar) {
        this.b = d2cVar;
        this.a = a2cVar;
    }

    public final int a() {
        return this.b.s.w;
    }

    public final void b(boolean z) {
        d2c d2cVar = this.b;
        t1c t1cVar = d2cVar.n;
        if (z) {
            w39 adapter = t1cVar.getAdapter();
            c1b c1bVar = d2cVar.w;
            if (adapter == c1bVar) {
                return;
            } else {
                t1cVar.setAdapter(c1bVar);
            }
        } else {
            w39 adapter2 = t1cVar.getAdapter();
            c2c c2cVar = d2cVar.s;
            if (adapter2 == c2cVar) {
                return;
            } else {
                t1cVar.setAdapter(c2cVar);
            }
        }
        if (t1cVar.getAdapter().b() > 0) {
            d2cVar.r.h1(0, gl.L(58.0f) + (-t1cVar.getPaddingTop()) + d2cVar.F, false);
        }
    }
}
