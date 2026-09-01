package rg;

import j3.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final g6 a;
    public c b;
    public c c;
    public c d;
    public c e;
    public float f;
    public float h;
    public float n;
    public float r;

    public d(g6 g6Var) {
        this.a = g6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    @Override // rg.a
    public final int I() {
        return a(this.b);
    }

    @Override // rg.a
    public final int U() {
        return a(this.e);
    }

    public final int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        g6 g6Var = this.a;
        return cVar.g(g6Var, ((g6Var instanceof oh.b) || g6Var != null) ? g6Var.a() : k6.I.q());
    }

    public final void b(int i10, int i11) {
        this.b = new w(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new w(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.c = new w(i11, i10, 2);
    }

    @Override // rg.a
    public final int k() {
        return a(this.c);
    }

    @Override // rg.a
    public final int x() {
        return a(this.d);
    }
}
