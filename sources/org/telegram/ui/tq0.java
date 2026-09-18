package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class tq0 extends org.telegram.ui.ActionBar.g5 {
    public final sl0 f = new sl0(this, 11);
    public final /* synthetic */ cr0 h;

    public tq0(cr0 cr0Var) {
        this.h = cr0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        this.h.b0(h2Var);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            sl0 sl0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(sl0Var);
            AndroidUtilities.runOnUIThread(sl0Var, 1200L);
            return;
        }
        cr0 cr0Var = this.h;
        cr0Var.f.clear();
        cr0Var.h.clear();
        cr0Var.v = null;
        cr0Var.s = true;
        cr0Var.r = false;
        if (cr0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) cr0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(cr0Var.x, true);
            cr0Var.x = 0;
        }
        cr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        cr0Var.N.e(false, true);
        cr0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
