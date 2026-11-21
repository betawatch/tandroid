package tg;

import android.view.KeyEvent;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.e1, t10 {
    public final /* synthetic */ h0 a;

    public /* synthetic */ q(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        h0 h0Var = this.a;
        h0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = h0Var.B1) != null && g1Var.isShowing()) {
            h0Var.B1.d(true);
        }
    }

    @Override // org.telegram.messenger.t10
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        z g02 = this.a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }
}
