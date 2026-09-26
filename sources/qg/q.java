package qg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final /* synthetic */ n0 a;

    public /* synthetic */ q(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        n0 n0Var = this.a;
        n0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = n0Var.R1) != null && m1Var.isShowing()) {
            n0Var.R1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        a0 i02 = this.a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
