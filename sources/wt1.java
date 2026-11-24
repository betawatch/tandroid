// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wt1 extends yx4 {
    public final /* synthetic */ yv1 m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt1(yv1 yv1Var, Activity activity, d dVar) {
        super(activity, dVar);
        this.m1 = yv1Var;
    }

    @Override // yx4
    public final void D0() {
        yv1 yv1Var = this.m1;
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        yv1Var.getMessagesController().p4(yv1Var.l6, "CONVERT_GIGAGROUP");
    }

    @Override // yx4
    public final void E0() {
        yv1 yv1Var = this.m1;
        yv1Var.getMessagesController().O(yv1Var.getParentActivity(), yv1Var.e, yv1Var, new cd1(this, (byte) 11));
    }
}
