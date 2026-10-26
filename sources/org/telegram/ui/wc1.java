package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wc1 implements TextWatcher {
    public final /* synthetic */ xc1 a;

    public wc1(xc1 xc1Var) {
        this.a = xc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        xc1 xc1Var = this.a;
        if (xc1Var.H) {
            return;
        }
        if (xc1Var.a.length() <= 0) {
            xc1Var.d.setText(xc1Var.G);
            return;
        }
        String str = "https://" + xc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) xc1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, xc1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        xc1Var.d.setText(TextUtils.concat(xc1Var.G, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        xc1 xc1Var = this.a;
        if (xc1Var.F) {
            return;
        }
        xc1Var.a0(xc1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
