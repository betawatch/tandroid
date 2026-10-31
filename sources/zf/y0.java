package zf;

import org.telegram.messenger.vp;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.un;
import th.n5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        if (vp.r1(b1Var.r).O1().K(v2Var.getDialogId())) {
            unVar.getOrCreateStoryViewer().getClass();
            unVar.getOrCreateStoryViewer().R(b1Var.c, v2Var.getDialogId(), n5.a((tk0) v2Var.getParent()));
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
