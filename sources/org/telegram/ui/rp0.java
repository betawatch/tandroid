package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.ActionBar.e5 {
    public final zk0 f = new zk0(this, 12);
    public final /* synthetic */ zp0 h;

    public rp0(zp0 zp0Var) {
        this.h = zp0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(fg.g gVar) {
        this.h.a0(gVar);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i9;
        if (editText.getText().length() != 0) {
            zk0 zk0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(zk0Var);
            AndroidUtilities.runOnUIThread(zk0Var, 1200L);
            return;
        }
        zp0 zp0Var = this.h;
        zp0Var.f.clear();
        zp0Var.h.clear();
        zp0Var.v = null;
        zp0Var.s = true;
        zp0Var.r = false;
        if (zp0Var.x != 0) {
            i9 = ((org.telegram.ui.ActionBar.o2) zp0Var).currentAccount;
            ConnectionsManager.getInstance(i9).cancelRequest(zp0Var.x, true);
            zp0Var.x = 0;
        }
        zp0Var.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        zp0Var.J.e(false, true);
        zp0Var.i0();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
