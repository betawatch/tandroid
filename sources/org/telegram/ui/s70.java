package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s70 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ y70 a;

    public s70(y70 y70Var) {
        this.a = y70Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        y70.Z(this.a);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        int length = editText.length();
        y70 y70Var = this.a;
        if (length == 0) {
            y70.Z(y70Var);
            return;
        }
        y70Var.x = true;
        v70 v70Var = y70Var.s;
        if (!v70Var.h) {
            v70Var.h = true;
            v70Var.l();
        }
        y70Var.s.E(editText.getText().toString());
        y70Var.h.setFastScrollVisible(false);
        y70Var.h.setVerticalScrollBarEnabled(true);
        y70Var.r.e(true, true);
        y70Var.r.setStickerType(1);
        y70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
        y70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
    }
}
