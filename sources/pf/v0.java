package pf;

import jh.b7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v0 implements l2 {
    public final /* synthetic */ y0 a;

    public v0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        y0 y0Var = this.a;
        rn rnVar = y0Var.f;
        if (MessagesController.getInstance(y0Var.r).getStoriesController().I(p2Var.getDialogId())) {
            rnVar.getOrCreateStoryViewer().getClass();
            rnVar.getOrCreateStoryViewer().D(y0Var.c, p2Var.getDialogId(), b7.a((zk0) p2Var.getParent()));
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
