package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ss implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;

    public ss(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            String obj = editable.toString();
            if (obj.isEmpty()) {
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) obj).intValue();
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
            FileLog.e(e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
