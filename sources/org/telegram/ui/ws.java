package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ws implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;

    public ws(EditTextBoldCursor editTextBoldCursor) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
