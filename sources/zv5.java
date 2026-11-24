// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zv5 implements k8, l8c {
    public final /* synthetic */ rw5 a;

    public /* synthetic */ zv5(rw5 rw5Var) {
        this.a = rw5Var;
    }

    @Override // l8c
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        iw5 e0 = this.a.e0(obj, document, true);
        if (bool.booleanValue()) {
            e0.setScale(1.5f);
        }
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        rw5 rw5Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (rw5Var = this.a).H1) != null && m8Var.isShowing()) {
            rw5Var.H1.d(true);
        }
    }
}
