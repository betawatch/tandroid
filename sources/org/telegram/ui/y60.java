package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        org.telegram.ui.Components.voip.o oVar = z60Var.d;
        if (oVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oVar);
        }
        z60Var.e = null;
        if (trim.isEmpty()) {
            c70.a0(c70Var, null);
            return;
        }
        org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(29, this, trim);
        z60Var.d = oVar2;
        AndroidUtilities.runOnUIThread(oVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
