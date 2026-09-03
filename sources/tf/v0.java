package tf;

import nh.c7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v0 implements m2 {
    public final /* synthetic */ y0 a;

    public v0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        y0 y0Var = this.a;
        zn znVar = y0Var.f;
        if (MessagesController.getInstance(y0Var.r).getStoriesController().I(q2Var.getDialogId())) {
            znVar.getOrCreateStoryViewer().getClass();
            znVar.getOrCreateStoryViewer().D(y0Var.c, q2Var.getDialogId(), c7.a((rl0) q2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.m2
    public final void a(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void d(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(q2 q2Var) {
    }
}
