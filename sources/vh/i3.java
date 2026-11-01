package vh;

import android.view.KeyEvent;
import org.telegram.messenger.n20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements org.telegram.ui.ActionBar.i1, n20 {
    public final /* synthetic */ b4 a;

    public /* synthetic */ i3(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.messenger.n20
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        b4 b4Var = this.a;
        b4Var.U1 = true;
        t3 k02 = b4Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        b4Var.b0(k02);
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        b4 b4Var = this.a;
        b4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = b4Var.q1) != null && k1Var.isShowing()) {
            b4Var.q1.d(true);
        }
    }
}
