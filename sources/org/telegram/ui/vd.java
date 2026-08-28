package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vd implements TextWatcher {
    public final /* synthetic */ fe a;

    public vd(fe feVar) {
        this.a = feVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        fe feVar = this.a;
        jd jdVar = feVar.e1;
        gh.o oVar = feVar.U0;
        if (feVar.R0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        feVar.T0 = parseLong;
        long j10 = feVar.J0.amount;
        if (parseLong > j10) {
            feVar.T0 = j10;
            feVar.R0 = true;
            oVar.setText(Long.toString(j10));
            oVar.setSelection(oVar.getText().length());
            feVar.R0 = false;
        }
        feVar.S0 = feVar.T0 == feVar.J0.amount;
        AndroidUtilities.cancelRunOnUIThread(jdVar);
        jdVar.run();
        feVar.S0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
