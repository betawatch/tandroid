package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class tc1 implements TextWatcher {
    public final /* synthetic */ uc1 a;

    public tc1(uc1 uc1Var) {
        this.a = uc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        uc1 uc1Var = this.a;
        if (uc1Var.H) {
            return;
        }
        if (uc1Var.a.length() <= 0) {
            uc1Var.d.setText(uc1Var.G);
            return;
        }
        String str = "https://" + uc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) uc1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, uc1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        uc1Var.d.setText(TextUtils.concat(uc1Var.G, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        uc1 uc1Var = this.a;
        if (uc1Var.F) {
            return;
        }
        uc1Var.Z(uc1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
