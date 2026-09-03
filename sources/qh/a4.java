package qh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final /* synthetic */ a5 a;

    public /* synthetic */ a4(a5 a5Var) {
        this.a = a5Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        a5 a5Var = this.a;
        a5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = a5Var.E1) != null && p1Var.isShowing()) {
            a5Var.E1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        a5 a5Var = this.a;
        a5Var.i2 = true;
        o4 n02 = a5Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        a5Var.d0(n02);
        return Boolean.TRUE;
    }
}
