package ug;

import android.view.KeyEvent;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.d1, q10 {
    public final /* synthetic */ f0 a;

    public /* synthetic */ q(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // org.telegram.messenger.q10
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        x g02 = this.a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        f0 f0Var = this.a;
        f0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = f0Var.B1) != null && f1Var.isShowing()) {
            f0Var.B1.d(true);
        }
    }
}
