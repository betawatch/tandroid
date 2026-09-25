package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zd implements TextWatcher {
    public final /* synthetic */ je a;

    public zd(je jeVar) {
        this.a = jeVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        je jeVar = this.a;
        md mdVar = jeVar.i1;
        fi.o oVar = jeVar.Y0;
        if (jeVar.V0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        jeVar.X0 = parseLong;
        long j3 = jeVar.N0.amount;
        if (parseLong > j3) {
            jeVar.X0 = j3;
            jeVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            jeVar.V0 = false;
        }
        jeVar.W0 = jeVar.X0 == jeVar.N0.amount;
        AndroidUtilities.cancelRunOnUIThread(mdVar);
        mdVar.run();
        jeVar.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
