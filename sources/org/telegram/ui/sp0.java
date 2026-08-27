package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sp0 extends org.telegram.ui.ActionBar.e5 {
    public final zk0 f = new zk0(this, 12);
    public final /* synthetic */ aq0 h;

    public sp0(aq0 aq0Var) {
        this.h = aq0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(gg.g gVar) {
        this.h.b0(gVar);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            zk0 zk0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(zk0Var);
            AndroidUtilities.runOnUIThread(zk0Var, 1200L);
            return;
        }
        aq0 aq0Var = this.h;
        aq0Var.f.clear();
        aq0Var.h.clear();
        aq0Var.v = null;
        aq0Var.s = true;
        aq0Var.r = false;
        if (aq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(aq0Var.x, true);
            aq0Var.x = 0;
        }
        aq0Var.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        aq0Var.J.e(false, true);
        aq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
