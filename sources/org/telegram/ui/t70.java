package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t70 implements TextWatcher {
    public final /* synthetic */ u70 a;

    public t70(u70 u70Var) {
        this.a = u70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        x70 x70Var = this.a.f;
        if (x70Var.d.d.length() != 0) {
            x70Var.E = true;
            x70Var.y = true;
            s70 s70Var = x70Var.s;
            if (!s70Var.h) {
                s70Var.h = true;
                s70Var.l();
            }
            x70Var.s.E(x70Var.d.d.toString());
            x70Var.h.setFastScrollVisible(false);
            x70Var.h.setVerticalScrollBarEnabled(true);
            x70Var.r.e(true, true);
            x70Var.r.setStickerType(1);
            x70Var.r.d.setText(LocaleController.getString(R.string.NoResult));
            x70Var.r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        x70Var.E = false;
        x70Var.y = false;
        s70 s70Var2 = x70Var.s;
        if (s70Var2.h) {
            s70Var2.h = false;
            s70Var2.l();
        }
        x70Var.s.E(null);
        x70Var.h.setFastScrollVisible(true);
        x70Var.h.setVerticalScrollBarEnabled(false);
        x70Var.r.e(false, true);
        x70Var.r.setStickerType(0);
        x70Var.r.d.setText(LocaleController.getString(R.string.NoContacts));
        x70Var.r.e.setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
