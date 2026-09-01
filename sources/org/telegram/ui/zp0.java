package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.ActionBar.i5 {
    public final gl0 f = new gl0(this, 12);
    public final /* synthetic */ hq0 h;

    public zp0(hq0 hq0Var) {
        this.h = hq0Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void p(lg.f fVar) {
        this.h.b0(fVar);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            gl0 gl0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(gl0Var);
            AndroidUtilities.runOnUIThread(gl0Var, 1200L);
            return;
        }
        hq0 hq0Var = this.h;
        hq0Var.f.clear();
        hq0Var.h.clear();
        hq0Var.v = null;
        hq0Var.s = true;
        hq0Var.r = false;
        if (hq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) hq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(hq0Var.x, true);
            hq0Var.x = 0;
        }
        hq0Var.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        hq0Var.K.e(false, true);
        hq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
    }
}
