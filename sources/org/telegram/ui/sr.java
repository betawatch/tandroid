package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sr implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;

    public sr(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            String obj = editable.toString();
            if (obj.isEmpty()) {
                return;
            }
            int intValue = Utilities.z(obj).intValue();
            EditTextBoldCursor editTextBoldCursor = this.a;
            if (intValue < 0) {
                editTextBoldCursor.setText("0");
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            }
            if (intValue > 300) {
                editTextBoldCursor.setText("300");
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            }
            if (obj.equals("" + intValue)) {
                return;
            }
            editTextBoldCursor.setText("" + intValue);
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
