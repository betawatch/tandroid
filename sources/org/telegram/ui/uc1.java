package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uc1 implements TextWatcher {
    public final /* synthetic */ vc1 a;

    public uc1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vc1 vc1Var = this.a;
        if (vc1Var.E) {
            return;
        }
        if (vc1Var.a.length() <= 0) {
            vc1Var.d.setText(vc1Var.D);
            return;
        }
        String str = "https://" + vc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) vc1Var.a.getText());
        String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int indexOf = formatString.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, vc1Var, 8), indexOf, str.length() + indexOf, 33);
        }
        vc1Var.d.setText(TextUtils.concat(vc1Var.D, "\n\n", spannableStringBuilder));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        vc1 vc1Var = this.a;
        if (vc1Var.C) {
            return;
        }
        vc1Var.Z(vc1Var.a.getText().toString(), false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
