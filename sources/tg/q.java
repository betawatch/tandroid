package tg;

import android.view.KeyEvent;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.e1, y10 {
    public final /* synthetic */ g0 a;

    public /* synthetic */ q(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // org.telegram.messenger.y10
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        x g02 = this.a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        g0 g0Var = this.a;
        g0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = g0Var.A1) != null && g1Var.isShowing()) {
            g0Var.A1.d(true);
        }
    }
}
