package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sq0 extends org.telegram.ui.ActionBar.i5 {
    public final ql0 f = new ql0(this, 11);
    public final /* synthetic */ br0 h;

    public sq0(br0 br0Var) {
        this.h = br0Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void p(bi.t2 t2Var) {
        this.h.b0(t2Var);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            ql0 ql0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(ql0Var);
            AndroidUtilities.runOnUIThread(ql0Var, 1200L);
            return;
        }
        br0 br0Var = this.h;
        br0Var.f.clear();
        br0Var.h.clear();
        br0Var.v = null;
        br0Var.s = true;
        br0Var.r = false;
        if (br0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) br0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(br0Var.x, true);
            br0Var.x = 0;
        }
        br0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        br0Var.N.e(false, true);
        br0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
    }
}
