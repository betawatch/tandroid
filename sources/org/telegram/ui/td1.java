package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class td1 implements TextWatcher {
    public final /* synthetic */ ud1 a;

    public td1(ud1 ud1Var) {
        this.a = ud1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ud1 ud1Var = this.a;
        if (ud1Var.I) {
            return;
        }
        if (ud1Var.a.length() <= 0) {
            ud1Var.d.setText(ud1Var.H);
            return;
        }
        String str = "https://" + ud1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ud1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ud1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        ud1Var.d.setText(TextUtils.concat(ud1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ud1 ud1Var = this.a;
        if (ud1Var.G) {
            return;
        }
        ud1Var.Y(ud1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
