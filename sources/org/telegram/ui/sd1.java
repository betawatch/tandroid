package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sd1 implements TextWatcher {
    public final /* synthetic */ td1 a;

    public sd1(td1 td1Var) {
        this.a = td1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        td1 td1Var = this.a;
        if (td1Var.I) {
            return;
        }
        if (td1Var.a.length() <= 0) {
            td1Var.d.setText(td1Var.H);
            return;
        }
        String str = "https://" + td1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) td1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, td1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        td1Var.d.setText(TextUtils.concat(td1Var.H, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        td1 td1Var = this.a;
        if (td1Var.G) {
            return;
        }
        td1Var.Z(td1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
