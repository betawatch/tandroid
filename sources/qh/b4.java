package qh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final /* synthetic */ b5 a;

    public /* synthetic */ b4(b5 b5Var) {
        this.a = b5Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        b5 b5Var = this.a;
        b5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = b5Var.E1) != null && p1Var.isShowing()) {
            b5Var.E1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        b5 b5Var = this.a;
        b5Var.i2 = true;
        p4 n02 = b5Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        b5Var.d0(n02);
        return Boolean.TRUE;
    }
}
