package zf;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ l0 a;

    public /* synthetic */ q(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        l0 l0Var = this.a;
        l0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = l0Var.N1) != null && n1Var.isShowing()) {
            l0Var.N1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        y i02 = this.a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
