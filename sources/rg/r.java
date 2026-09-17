package rg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ o0 a;

    public /* synthetic */ r(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        o0 o0Var = this.a;
        o0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = o0Var.R1) != null && n1Var.isShowing()) {
            o0Var.R1.d(true);
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
