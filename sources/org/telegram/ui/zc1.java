package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zc1 implements TextWatcher {
    public final /* synthetic */ ad1 a;

    public zc1(ad1 ad1Var) {
        this.a = ad1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ad1 ad1Var = this.a;
        if (ad1Var.H) {
            return;
        }
        if (ad1Var.a.length() <= 0) {
            ad1Var.d.setText(ad1Var.G);
            return;
        }
        String str = "https://" + ad1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ad1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ad1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        ad1Var.d.setText(TextUtils.concat(ad1Var.G, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ad1 ad1Var = this.a;
        if (ad1Var.F) {
            return;
        }
        ad1Var.a0(ad1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
