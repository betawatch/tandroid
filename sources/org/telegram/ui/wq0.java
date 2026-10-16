package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wq0 extends org.telegram.ui.ActionBar.e5 {
    public final xk0 f = new xk0(this, 12);
    public final /* synthetic */ fr0 h;

    public wq0(fr0 fr0Var) {
        this.h = fr0Var;
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
            xk0 xk0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(xk0Var);
            AndroidUtilities.runOnUIThread(xk0Var, 1200L);
            return;
        }
        fr0 fr0Var = this.h;
        fr0Var.f.clear();
        fr0Var.h.clear();
        fr0Var.v = null;
        fr0Var.s = true;
        fr0Var.r = false;
        if (fr0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.m2) fr0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(fr0Var.x, true);
            fr0Var.x = 0;
        }
        fr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        fr0Var.N.e(false, true);
        fr0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
