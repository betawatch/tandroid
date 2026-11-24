// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx5 implements k8, mac {
    public final /* synthetic */ ry5 a;

    public /* synthetic */ zx5(ry5 ry5Var) {
        this.a = ry5Var;
    }

    @Override // mac
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        iy5 e0 = this.a.e0(obj, document, true);
        if (bool.booleanValue()) {
            e0.setScale(1.5f);
        }
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        ry5 ry5Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (ry5Var = this.a).H1) != null && m8Var.isShowing()) {
            ry5Var.H1.d(true);
        }
    }
}
