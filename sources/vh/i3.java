package vh;

import android.view.KeyEvent;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements org.telegram.ui.ActionBar.i1, m20 {
    public final /* synthetic */ b4 a;

    public /* synthetic */ i3(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.messenger.m20
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
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        b4 b4Var = this.a;
        b4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = b4Var.q1) != null && k1Var.isShowing()) {
            b4Var.q1.d(true);
        }
    }
}
