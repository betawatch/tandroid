package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x00 implements TextWatcher {
    public final /* synthetic */ z00 a;

    public x00(z00 z00Var) {
        this.a = z00Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        c10 c10Var = this.a.e;
        if (!TextUtils.equals(editable, c10Var.w)) {
            c10Var.n = !TextUtils.isEmpty(editable);
            c10Var.w = org.telegram.ui.Components.z5.onlyEmojiSpans(editable);
            q00 q00Var = c10Var.I;
            if (q00Var != null) {
                q00Var.e(org.telegram.ui.Components.z5.cloneSpans(c10Var.w, -1, q00Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            r00 r00Var = c10Var.J;
            if (r00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = r00Var.r;
                if (c10.k0(c10Var.w)) {
                    str = LocaleController.getString(c10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.n2) c10Var).actionBar;
            CharSequence charSequence = c10Var.w;
            kVar2 = ((org.telegram.ui.ActionBar.n2) c10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.z5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        c10Var.i0(true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
