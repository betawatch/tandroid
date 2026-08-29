package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class td implements TextWatcher {
    public final /* synthetic */ de a;

    public td(de deVar) {
        this.a = deVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        de deVar = this.a;
        id idVar = deVar.e1;
        jh.m mVar = deVar.U0;
        if (deVar.R0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        deVar.T0 = parseLong;
        long j10 = deVar.J0.amount;
        if (parseLong > j10) {
            deVar.T0 = j10;
            deVar.R0 = true;
            mVar.setText(Long.toString(j10));
            mVar.setSelection(mVar.getText().length());
            deVar.R0 = false;
        }
        deVar.S0 = deVar.T0 == deVar.J0.amount;
        AndroidUtilities.cancelRunOnUIThread(idVar);
        idVar.run();
        deVar.S0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
