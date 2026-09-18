package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class zd1 implements TextWatcher {
    public final /* synthetic */ ae1 a;

    public zd1(ae1 ae1Var) {
        this.a = ae1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ae1 ae1Var = this.a;
        if (ae1Var.I) {
            return;
        }
        if (ae1Var.a.length() <= 0) {
            ae1Var.d.setText(ae1Var.H);
            return;
        }
        String str = "https://" + ae1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ae1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ae1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        ae1Var.d.setText(TextUtils.concat(ae1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ae1 ae1Var = this.a;
        if (ae1Var.G) {
            return;
        }
        ae1Var.Z(ae1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
