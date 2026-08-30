package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w00 implements TextWatcher {
    public final /* synthetic */ y00 a;

    public w00(y00 y00Var) {
        this.a = y00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        b10 b10Var = this.a.e;
        if (!TextUtils.equals(editable, b10Var.w)) {
            b10Var.n = !TextUtils.isEmpty(editable);
            b10Var.w = org.telegram.ui.Components.u5.onlyEmojiSpans(editable);
            p00 p00Var = b10Var.F;
            if (p00Var != null) {
                p00Var.e(org.telegram.ui.Components.u5.cloneSpans(b10Var.w, -1, p00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            q00 q00Var = b10Var.G;
            if (q00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = q00Var.r;
                if (b10.k0(b10Var.w)) {
                    str = LocaleController.getString(b10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.p2) b10Var).actionBar;
            CharSequence charSequence = b10Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.p2) b10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.u5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        b10Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
