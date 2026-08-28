package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vl0 implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wm0 c;

    public vl0(wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.c = wm0Var;
        this.a = editTextBoldCursor;
        this.b = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i9 = 0;
        while (true) {
            if (i9 >= editable.length()) {
                z10 = false;
                break;
            }
            char charAt = editable.charAt(i9);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                z10 = true;
                break;
            }
            i9++;
        }
        wm0 wm0Var = this.c;
        if (z10 && !wm0Var.q0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            wm0Var.p0[intValue] = z10;
            wm0.I0(wm0Var, editTextBoldCursor, this.b, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
