package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.ActionBar.e5 {
    public final vk0 f = new vk0(this, 12);
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
    public final void p(ig.f fVar) {
        this.h.b0(fVar);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            vk0 vk0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(vk0Var);
            AndroidUtilities.runOnUIThread(vk0Var, 1200L);
            return;
        }
        zp0 zp0Var = this.h;
        zp0Var.f.clear();
        zp0Var.h.clear();
        zp0Var.v = null;
        zp0Var.s = true;
        zp0Var.r = false;
        if (zp0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.o2) zp0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(zp0Var.x, true);
            zp0Var.x = 0;
        }
        zp0Var.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        zp0Var.J.e(false, true);
        zp0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
