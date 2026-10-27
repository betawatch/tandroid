package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zd implements TextWatcher {
    public final /* synthetic */ ke a;

    public zd(ke keVar) {
        this.a = keVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ke keVar = this.a;
        qd qdVar = keVar.f1;
        bi.t tVar = keVar.O0;
        if (keVar.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        keVar.N0 = parseLong;
        long j10 = keVar.D0.amount;
        if (parseLong > j10) {
            keVar.N0 = j10;
            keVar.L0 = true;
            tVar.setText(Long.toString(j10));
            tVar.setSelection(tVar.getText().length());
            keVar.L0 = false;
        }
        keVar.M0 = keVar.N0 == keVar.D0.amount;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        keVar.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
