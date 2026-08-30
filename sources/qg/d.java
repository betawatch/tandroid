package qg;

import j3.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final f6 a;
    public c b;
    public c c;
    public c d;
    public c e;
    public float f;
    public float h;
    public float n;
    public float r;

    public d(f6 f6Var) {
        this.a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    @Override // qg.a
    public final int D2() {
        return a(this.e);
    }

    @Override // qg.a
    public final int W1() {
        return a(this.b);
    }

    @Override // qg.a
    public final int X0() {
        return a(this.d);
    }

    public final int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        f6 f6Var = this.a;
        return cVar.g(f6Var, ((f6Var instanceof nh.b) || f6Var != null) ? f6Var.a() : j6.I.q());
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

    @Override // qg.a
    public final int x0() {
        return a(this.c);
    }
}
