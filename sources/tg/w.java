package tg;

import android.view.KeyEvent;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.e1, s10 {
    public final /* synthetic */ l0 a;

    public /* synthetic */ w(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // org.telegram.messenger.s10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        d0 i02 = this.a.i0(obj, document, true);
        if (bool.booleanValue()) {
            i02.setScale(1.5f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        l0 l0Var = this.a;
        l0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = l0Var.B1) != null && g1Var.isShowing()) {
            l0Var.B1.d(true);
        }
    }
}
