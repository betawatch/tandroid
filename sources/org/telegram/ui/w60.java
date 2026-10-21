package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class w60 implements TextWatcher {
    public final /* synthetic */ x60 a;

    public w60(x60 x60Var) {
        this.a = x60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        x60 x60Var = this.a;
        a70 a70Var = x60Var.h;
        if (x60Var.c != 0) {
            a70Var.getConnectionsManager().cancelRequest(x60Var.c, true);
            x60Var.c = 0;
        }
        lt ltVar = x60Var.d;
        if (ltVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ltVar);
        }
        x60Var.e = null;
        if (trim.isEmpty()) {
            a70.a0(a70Var, null);
            return;
        }
        lt ltVar2 = new lt(25, this, trim);
        x60Var.d = ltVar2;
        AndroidUtilities.runOnUIThread(ltVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
