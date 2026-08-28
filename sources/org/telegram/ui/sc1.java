package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sc1 implements TextWatcher {
    public final /* synthetic */ tc1 a;

    public sc1(tc1 tc1Var) {
        this.a = tc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        tc1 tc1Var = this.a;
        if (tc1Var.E) {
            return;
        }
        if (tc1Var.a.length() <= 0) {
            tc1Var.d.setText(tc1Var.D);
            return;
        }
        String str = "https://" + tc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) tc1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, tc1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        tc1Var.d.setText(TextUtils.concat(tc1Var.D, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        tc1 tc1Var = this.a;
        if (tc1Var.C) {
            return;
        }
        tc1Var.Y(tc1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
