package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rx0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx0 b;

    public /* synthetic */ rx0(tx0 tx0Var, int i7) {
        this.a = i7;
        this.b = tx0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                this.b.Z(true);
                break;
            case 1:
                tx0 tx0Var = this.b;
                if (!tx0Var.L) {
                    EditTextBoldCursor editTextBoldCursor = tx0Var.a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i7 = 0;
                    while (i7 < obj.length()) {
                        int i10 = i7 + 1;
                        String substring = obj.substring(i7, i10);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i7 = i10;
                    }
                    tx0Var.L = true;
                    int intValue = Utilities.z(sb2.toString()).intValue();
                    if (intValue < 0 || intValue > 65535 || !obj.equals(sb2.toString())) {
                        if (intValue < 0) {
                            editTextBoldCursor.setText("0");
                        } else if (intValue > 65535) {
                            editTextBoldCursor.setText("65535");
                        } else {
                            editTextBoldCursor.setText(sb2.toString());
                        }
                    } else if (selectionStart >= 0) {
                        editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                    }
                    tx0Var.L = false;
                    tx0Var.Z(true);
                    break;
                }
                break;
            default:
                this.b.Z(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
