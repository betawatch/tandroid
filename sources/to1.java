// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class to1 implements y60 {
    public final /* synthetic */ mu1 a;

    public to1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // y60
    public final void dismiss() {
        m8 m8Var = this.a.g9;
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override // y60
    public final void n(int i, int i2) {
        mu1 mu1Var = this.a;
        mu1Var.getMessagesController().M4(i, mu1Var.l6);
        if (mu1Var.s8 == null && mu1Var.r8 == null) {
            return;
        }
        mu1Var.Z5();
        UndoView undoView = mu1Var.N3;
        if (undoView == null) {
            return;
        }
        long j = mu1Var.l6;
        TLRPC.User user = mu1Var.f;
        TLRPC.UserFull userFull = mu1Var.s8;
        undoView.k(j, i2, user, Integer.valueOf(userFull != null ? userFull.ttl_period : mu1Var.r8.ttl_period), null, null);
    }

    @Override // y60
    public final void F() {
    }
}
