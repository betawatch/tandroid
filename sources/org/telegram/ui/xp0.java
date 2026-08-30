package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.ActionBar.h5 {
    public final el0 f = new el0(this, 12);
    public final /* synthetic */ fq0 h;

    public xp0(fq0 fq0Var) {
        this.h = fq0Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(kg.f fVar) {
        this.h.b0(fVar);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            el0 el0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(el0Var);
            AndroidUtilities.runOnUIThread(el0Var, 1200L);
            return;
        }
        fq0 fq0Var = this.h;
        fq0Var.f.clear();
        fq0Var.h.clear();
        fq0Var.v = null;
        fq0Var.s = true;
        fq0Var.r = false;
        if (fq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) fq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(fq0Var.x, true);
            fq0Var.x = 0;
        }
        fq0Var.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        fq0Var.K.e(false, true);
        fq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
    }
}
