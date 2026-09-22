package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rq0 extends org.telegram.ui.ActionBar.g5 {
    public final pl0 f = new pl0(this, 11);
    public final /* synthetic */ ar0 h;

    public rq0(ar0 ar0Var) {
        this.h = ar0Var;
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
            pl0 pl0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(pl0Var);
            AndroidUtilities.runOnUIThread(pl0Var, 1200L);
            return;
        }
        ar0 ar0Var = this.h;
        ar0Var.f.clear();
        ar0Var.h.clear();
        ar0Var.v = null;
        ar0Var.s = true;
        ar0Var.r = false;
        if (ar0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) ar0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(ar0Var.x, true);
            ar0Var.x = 0;
        }
        ar0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        ar0Var.N.e(false, true);
        ar0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
