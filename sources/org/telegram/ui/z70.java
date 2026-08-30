package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z70 implements TextWatcher {
    public final /* synthetic */ a80 a;

    public z70(a80 a80Var) {
        this.a = a80Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        c80 c80Var = this.a.f;
        if (c80Var.d.d.length() != 0) {
            c80Var.B = true;
            c80Var.y = true;
            y70 y70Var = c80Var.s;
            if (!y70Var.h) {
                y70Var.h = true;
                y70Var.l();
            }
            c80Var.s.E(c80Var.d.d.toString());
            c80Var.h.setFastScrollVisible(false);
            c80Var.h.setVerticalScrollBarEnabled(true);
            c80Var.r.e(true, true);
            c80Var.r.setStickerType(1);
            c80Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            c80Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        c80Var.B = false;
        c80Var.y = false;
        y70 y70Var2 = c80Var.s;
        if (y70Var2.h) {
            y70Var2.h = false;
            y70Var2.l();
        }
        c80Var.s.E(null);
        c80Var.h.setFastScrollVisible(true);
        c80Var.h.setVerticalScrollBarEnabled(false);
        c80Var.r.e(false, true);
        c80Var.r.setStickerType(0);
        c80Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        c80Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
