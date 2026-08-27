package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        a30 a30Var = z60Var.d;
        if (a30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a30Var);
        }
        z60Var.e = null;
        if (trim.isEmpty()) {
            c70.a0(c70Var, null);
            return;
        }
        a30 a30Var2 = new a30(2, this, trim);
        z60Var.d = a30Var2;
        AndroidUtilities.runOnUIThread(a30Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
