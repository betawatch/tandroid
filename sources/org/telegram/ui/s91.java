package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s91 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ org.telegram.ui.Components.zd0 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ TextView f;

    public s91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.zd0 zd0Var, int[] iArr, TextView textView) {
        this.b = i10;
        this.c = editTextBoldCursor;
        this.d = zd0Var;
        this.e = iArr;
        this.f = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        double d;
        double d10;
        double d11;
        int[] iArr;
        org.telegram.ui.Components.zd0 zd0Var = this.d;
        int i10 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            d10 = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                d11 = MessagesController.getInstance(i10).tonStakeddiceStakeAmountMax / 1.0E9d;
                iArr = this.e;
            } catch (Exception unused) {
                d = 0.0d;
            }
        } catch (Exception unused2) {
            d = 0.0d;
            d10 = 0.0d;
        }
        if (d10 > d11) {
            this.a = true;
            d10 = MessagesController.getInstance(i10).tonStakeddiceStakeAmountMax / 1.0E9d;
            editTextBoldCursor.setText(Double.toString(d10));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            int i11 = -iArr[0];
            iArr[0] = i11;
            AndroidUtilities.shakeViewSpring(zd0Var, i11);
        } else if (d10 > 0.0d) {
            d = 0.0d;
            try {
                if (d10 < MessagesController.getInstance(i10).tonStakeddiceStakeAmountMin / 1.0E9d) {
                    this.a = true;
                    d10 = MessagesController.getInstance(i10).tonStakeddiceStakeAmountMin / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d10));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i12 = -iArr[0];
                    iArr[0] = i12;
                    AndroidUtilities.shakeViewSpring(zd0Var, i12);
                }
            } catch (Exception unused3) {
                this.a = true;
                editTextBoldCursor.setText(d10 <= d ? "" : Double.toString(d10));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                zd0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.f;
                if (d10 == d) {
                }
            }
            this.a = false;
            zd0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView2 = this.f;
            if (d10 == d) {
                textView2.animate().alpha(0.0f).start();
                textView2.setText("");
                return;
            } else {
                textView2.animate().alpha(1.0f).start();
                textView2.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * d10 * 100.0d), "USD", 2));
                return;
            }
        }
        d = 0.0d;
        this.a = false;
        zd0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView22 = this.f;
        if (d10 == d) {
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
