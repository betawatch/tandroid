package sg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final /* synthetic */ m0 a;

    public /* synthetic */ q(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        m0 m0Var = this.a;
        m0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = m0Var.G1) != null && o1Var.isShowing()) {
            m0Var.G1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        z g02 = this.a.g0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            g02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
