package zf;

import org.telegram.messenger.wp;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.un;
import th.n5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y0 implements r2 {
    public final /* synthetic */ b1 a;

    public y0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final void u(v2 v2Var) {
        b1 b1Var = this.a;
        un unVar = b1Var.f;
        if (wp.r1(b1Var.r).O1().K(v2Var.getDialogId())) {
            unVar.getOrCreateStoryViewer().getClass();
            unVar.getOrCreateStoryViewer().R(b1Var.c, v2Var.getDialogId(), n5.a((uk0) v2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.r2
    public final void l(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void r(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void x(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void q() {
    }
}
