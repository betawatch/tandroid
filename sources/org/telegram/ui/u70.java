package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        d20 d20Var = v70Var.d;
        if (d20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d20Var);
        }
        v70Var.e = null;
        if (trim.isEmpty()) {
            y70.a0(y70Var, null);
            return;
        }
        d20 d20Var2 = new d20(7, this, trim);
        v70Var.d = d20Var2;
        AndroidUtilities.runOnUIThread(d20Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
