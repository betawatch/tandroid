package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class yd implements TextWatcher {
    public final /* synthetic */ ie a;

    public yd(ie ieVar) {
        this.a = ieVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ie ieVar = this.a;
        nd ndVar = ieVar.i1;
        ai.t tVar = ieVar.Y0;
        if (ieVar.V0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        ieVar.X0 = parseLong;
        long j10 = ieVar.N0.amount;
        if (parseLong > j10) {
            ieVar.X0 = j10;
            ieVar.V0 = true;
            tVar.setText(Long.toString(j10));
            tVar.setSelection(tVar.getText().length());
            ieVar.V0 = false;
        }
        ieVar.W0 = ieVar.X0 == ieVar.N0.amount;
        AndroidUtilities.cancelRunOnUIThread(ndVar);
        ndVar.run();
        ieVar.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
