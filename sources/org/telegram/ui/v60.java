package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v60 implements TextWatcher {
    public final /* synthetic */ w60 a;

    public v60(w60 w60Var) {
        this.a = w60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        w60 w60Var = this.a;
        z60 z60Var = w60Var.h;
        if (w60Var.c != 0) {
            z60Var.getConnectionsManager().cancelRequest(w60Var.c, true);
            w60Var.c = 0;
        }
        x20 x20Var = w60Var.d;
        if (x20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x20Var);
        }
        w60Var.e = null;
        if (trim.isEmpty()) {
            z60.Z(z60Var, null);
            return;
        }
        x20 x20Var2 = new x20(2, this, trim);
        w60Var.d = x20Var2;
        AndroidUtilities.runOnUIThread(x20Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
