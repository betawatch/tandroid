package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zi0 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ String c;
    public final /* synthetic */ bk0 d;

    public zi0(bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = bk0Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        boolean z9 = true;
        this.a = true;
        int i7 = 0;
        while (true) {
            if (i7 >= editable.length()) {
                z9 = false;
                break;
            }
            char charAt = editable.charAt(i7);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                break;
            } else {
                i7++;
            }
        }
        this.a = false;
        EditTextBoldCursor editTextBoldCursor = this.b;
        if (z9) {
            editTextBoldCursor.setErrorText(org.telegram.messenger.id.M0(2131747450, null));
        } else {
            bk0.N0(this.d, editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
