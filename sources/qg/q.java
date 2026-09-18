package qg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final /* synthetic */ p0 a;

    public /* synthetic */ q(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        p0 p0Var = this.a;
        p0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = p0Var.R1) != null && o1Var.isShowing()) {
            p0Var.R1.d(true);
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
