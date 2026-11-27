// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w17 {
    public final /* synthetic */ e a;
    public final /* synthetic */ b27 b;

    public w17(b27 b27Var, e eVar) {
        this.b = b27Var;
        this.a = eVar;
    }

    public final void a(boolean z) {
        b27 b27Var = this.b;
        r17 r17Var = b27Var.f;
        if (b27Var.getNeededLayoutManager() != b27Var.getCurrentLayoutManager() && b27Var.a()) {
            if (r17Var.N0 > 0) {
                b27Var.O = true;
                b27Var.o(false);
                return;
            }
            b27Var.b.setLayoutManager(b27Var.getNeededLayoutManager());
        }
        if (z && !b27Var.a()) {
            z = false;
        }
        b27Var.o((!z || r17Var.K() > 0) ? z : false);
    }

    public final void b(boolean z) {
        this.b.l(z);
    }

    public final void c() {
        b27 b27Var = this.b;
        z96 z96Var = b27Var.K;
        if (b27Var.b.getLayoutManager() == b27Var.d || !b27Var.J) {
            return;
        }
        hl.r(z96Var);
        hl.d3(z96Var, this.a.getFragmentBeginToShow() ? 0L : 100L);
    }
}
