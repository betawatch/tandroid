package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qm0 implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sn0 c;

    public qm0(sn0 sn0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.c = sn0Var;
        this.a = editTextBoldCursor;
        this.b = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        EditTextBoldCursor editTextBoldCursor = this.a;
        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
        int i10 = 0;
        while (true) {
            if (i10 >= editable.length()) {
                z10 = false;
                break;
            }
            char charAt = editable.charAt(i10);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                z10 = true;
                break;
            }
            i10++;
        }
        sn0 sn0Var = this.c;
        if (z10 && !sn0Var.u0) {
            editTextBoldCursor.setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
        } else {
            sn0Var.t0[intValue] = z10;
            sn0.I0(sn0Var, editTextBoldCursor, this.b, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
