// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w82 implements y70 {
    public final /* synthetic */ m8[] a;
    public final /* synthetic */ z82 b;

    public w82(z82 z82Var, m8[] m8VarArr) {
        this.b = z82Var;
        this.a = m8VarArr;
    }

    @Override // y70
    public final void dismiss() {
        m8 m8Var = this.a[0];
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override // y70
    public final void l(int i, int i2) {
        yv1 yv1Var = this.b.H;
        if (yv1Var != null) {
            yv1Var.getMessagesController().P4(i, yv1Var.a());
            TLRPC.ChatFull chatFull = yv1Var.r8;
            TLRPC.UserFull userFull = yv1Var.s8;
            if (userFull == null && chatFull == null) {
                return;
            }
            yv1Var.i6();
            UndoView undoView = yv1Var.N3;
            if (undoView != null) {
                undoView.k(yv1Var.a(), i2, yv1Var.h(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
            }
        }
    }

    @Override // y70
    public final void n() {
    }
}
