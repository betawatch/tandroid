package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u31 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ org.telegram.ui.Components.lb0 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ TextView f;

    public u31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.lb0 lb0Var, int[] iArr, TextView textView) {
        this.b = i7;
        this.c = editTextBoldCursor;
        this.d = lb0Var;
        this.e = iArr;
        this.f = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        double d;
        double d2;
        double d10;
        int[] iArr;
        org.telegram.ui.Components.lb0 lb0Var = this.d;
        int i7 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            d2 = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                d10 = org.telegram.messenger.qp.s1(i7).a7 / 1.0E9d;
                iArr = this.e;
            } catch (Exception unused) {
                d = 0.0d;
            }
        } catch (Exception unused2) {
            d = 0.0d;
            d2 = 0.0d;
        }
        if (d2 > d10) {
            this.a = true;
            d2 = org.telegram.messenger.qp.s1(i7).a7 / 1.0E9d;
            editTextBoldCursor.setText(Double.toString(d2));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            int i10 = -iArr[0];
            iArr[0] = i10;
            org.telegram.messenger.g0.G3(i10, lb0Var, null);
        } else if (d2 > 0.0d) {
            d = 0.0d;
            try {
                if (d2 < org.telegram.messenger.qp.s1(i7).Z6 / 1.0E9d) {
                    this.a = true;
                    d2 = org.telegram.messenger.qp.s1(i7).Z6 / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d2));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i11 = -iArr[0];
                    iArr[0] = i11;
                    org.telegram.messenger.g0.G3(i11, lb0Var, null);
                }
            } catch (Exception unused3) {
                this.a = true;
                editTextBoldCursor.setText(d2 <= d ? "" : Double.toString(d2));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                lb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.f;
                if (d2 == d) {
                }
            }
            this.a = false;
            lb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView2 = this.f;
            if (d2 == d) {
                textView2.animate().alpha(0.0f).start();
                textView2.setText("");
                return;
            }
            textView2.animate().alpha(1.0f).start();
            StringBuilder sb2 = new StringBuilder("≈");
            org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
            long j3 = (long) (d2 * ((org.telegram.messenger.i0) org.telegram.messenger.qp.s1(i7).x7.l.b).a * 100.0d);
            i12.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, j3, false));
            textView2.setText(sb2.toString());
            return;
        }
        d = 0.0d;
        this.a = false;
        lb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView22 = this.f;
        if (d2 == d) {
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
