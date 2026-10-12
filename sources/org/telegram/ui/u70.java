package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u70 implements TextWatcher {
    public final /* synthetic */ v70 a;

    public u70(v70 v70Var) {
        this.a = v70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        v70 v70Var = this.a;
        y70 y70Var = v70Var.h;
        if (v70Var.c != 0) {
            y70Var.getConnectionsManager().cancelRequest(v70Var.c, true);
            v70Var.c = 0;
        }
        o00 o00Var = v70Var.d;
        if (o00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o00Var);
        }
        v70Var.e = null;
        if (trim.isEmpty()) {
            y70.a0(y70Var, null);
            return;
        }
        o00 o00Var2 = new o00(12, this, trim);
        v70Var.d = o00Var2;
        AndroidUtilities.runOnUIThread(o00Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
