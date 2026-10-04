package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vd1 implements TextWatcher {
    public final /* synthetic */ wd1 a;

    public vd1(wd1 wd1Var) {
        this.a = wd1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        wd1 wd1Var = this.a;
        if (wd1Var.I) {
            return;
        }
        if (wd1Var.a.length() <= 0) {
            wd1Var.d.setText(wd1Var.H);
            return;
        }
        String str = "https://" + wd1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) wd1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, wd1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        wd1Var.d.setText(TextUtils.concat(wd1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        wd1 wd1Var = this.a;
        if (wd1Var.G) {
            return;
        }
        wd1Var.Y(wd1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
