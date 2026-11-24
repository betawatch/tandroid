// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pz6 {
    public final /* synthetic */ d a;
    public final /* synthetic */ uz6 b;

    public pz6(uz6 uz6Var, d dVar) {
        this.b = uz6Var;
        this.a = dVar;
    }

    public final void a(boolean z) {
        uz6 uz6Var = this.b;
        kz6 kz6Var = uz6Var.f;
        if (uz6Var.getNeededLayoutManager() != uz6Var.getCurrentLayoutManager() && uz6Var.a()) {
            if (kz6Var.N0 > 0) {
                uz6Var.O = true;
                uz6Var.o(false);
                return;
            }
            uz6Var.b.setLayoutManager(uz6Var.getNeededLayoutManager());
        }
        if (z && !uz6Var.a()) {
            z = false;
        }
        uz6Var.o((!z || kz6Var.K() > 0) ? z : false);
    }

    public final void b(boolean z) {
        this.b.l(z);
    }

    public final void c() {
        uz6 uz6Var = this.b;
        vl6 vl6Var = uz6Var.K;
        if (uz6Var.b.getLayoutManager() == uz6Var.d || !uz6Var.J) {
            return;
        }
        gl.r(vl6Var);
        gl.d3(vl6Var, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
