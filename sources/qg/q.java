package qg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ m0 a;

    public /* synthetic */ q(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        m0 m0Var = this.a;
        m0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = m0Var.R1) != null && n1Var.isShowing()) {
            m0Var.R1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        z i02 = this.a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
