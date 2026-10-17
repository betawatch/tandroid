package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class y60 implements TextWatcher {
    public final /* synthetic */ z60 a;

    public y60(z60 z60Var) {
        this.a = z60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        z60 z60Var = this.a;
        c70 c70Var = z60Var.h;
        if (z60Var.c != 0) {
            c70Var.getConnectionsManager().cancelRequest(z60Var.c, true);
            z60Var.c = 0;
        }
        nt ntVar = z60Var.d;
        if (ntVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ntVar);
        }
        z60Var.e = null;
        if (trim.isEmpty()) {
            c70.a0(c70Var, null);
            return;
        }
        nt ntVar2 = new nt(25, this, trim);
        z60Var.d = ntVar2;
        AndroidUtilities.runOnUIThread(ntVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
