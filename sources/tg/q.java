package tg;

import android.view.KeyEvent;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.e1, v10 {
    public final /* synthetic */ g0 a;

    public /* synthetic */ q(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        g0 g0Var = this.a;
        g0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = g0Var.B1) != null && g1Var.isShowing()) {
            g0Var.B1.d(true);
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        y g02 = this.a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }
}
