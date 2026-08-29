package rf;

import lh.b7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w0 implements l2 {
    public final /* synthetic */ z0 a;

    public w0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        z0 z0Var = this.a;
        tn tnVar = z0Var.f;
        if (MessagesController.getInstance(z0Var.r).getStoriesController().I(p2Var.getDialogId())) {
            tnVar.getOrCreateStoryViewer().getClass();
            tnVar.getOrCreateStoryViewer().D(z0Var.c, p2Var.getDialogId(), b7.a((jl0) p2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.l2
    public final void a(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void d(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(p2 p2Var) {
    }
}
