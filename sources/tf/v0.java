package tf;

import nh.c7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v0 implements n2 {
    public final /* synthetic */ y0 a;

    public v0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        y0 y0Var = this.a;
        xn xnVar = y0Var.f;
        if (MessagesController.getInstance(y0Var.r).getStoriesController().I(r2Var.getDialogId())) {
            xnVar.getOrCreateStoryViewer().getClass();
            xnVar.getOrCreateStoryViewer().D(y0Var.c, r2Var.getDialogId(), c7.a((sl0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void d(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
    }
}
