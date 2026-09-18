package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r70 implements TextWatcher {
    public final /* synthetic */ s70 a;

    public r70(s70 s70Var) {
        this.a = s70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        s70 s70Var = this.a;
        v70 v70Var = s70Var.h;
        if (s70Var.c != 0) {
            v70Var.getConnectionsManager().cancelRequest(s70Var.c, true);
            s70Var.c = 0;
        }
        mw mwVar = s70Var.d;
        if (mwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mwVar);
        }
        s70Var.e = null;
        if (trim.isEmpty()) {
            v70.a0(v70Var, null);
            return;
        }
        mw mwVar2 = new mw(20, this, trim);
        s70Var.d = mwVar2;
        AndroidUtilities.runOnUIThread(mwVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
