package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yq0 extends org.telegram.ui.ActionBar.e5 {
    public final yk0 f = new yk0(this, 12);
    public final /* synthetic */ hr0 h;

    public yq0(hr0 hr0Var) {
        this.h = hr0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(di.g2 g2Var) {
        this.h.b0(g2Var);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            yk0 yk0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(yk0Var);
            AndroidUtilities.runOnUIThread(yk0Var, 1200L);
            return;
        }
        hr0 hr0Var = this.h;
        hr0Var.f.clear();
        hr0Var.h.clear();
        hr0Var.v = null;
        hr0Var.s = true;
        hr0Var.r = false;
        if (hr0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.m2) hr0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(hr0Var.x, true);
            hr0Var.x = 0;
        }
        hr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        hr0Var.N.e(false, true);
        hr0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
