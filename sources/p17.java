// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p17 {
    public final /* synthetic */ d a;
    public final /* synthetic */ u17 b;

    public p17(u17 u17Var, d dVar) {
        this.b = u17Var;
        this.a = dVar;
    }

    public final void a(boolean z) {
        u17 u17Var = this.b;
        k17 k17Var = u17Var.f;
        if (u17Var.getNeededLayoutManager() != u17Var.getCurrentLayoutManager() && u17Var.a()) {
            if (k17Var.N0 > 0) {
                u17Var.O = true;
                u17Var.o(false);
                return;
            }
            u17Var.b.setLayoutManager(u17Var.getNeededLayoutManager());
        }
        if (z && !u17Var.a()) {
            z = false;
        }
        u17Var.o((!z || k17Var.K() > 0) ? z : false);
    }

    public final void b(boolean z) {
        this.b.l(z);
    }

    public final void c() {
        u17 u17Var = this.b;
        pg6 pg6Var = u17Var.K;
        if (u17Var.b.getLayoutManager() == u17Var.d || !u17Var.J) {
            return;
        }
        gm.r(pg6Var);
        gm.d3(pg6Var, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
