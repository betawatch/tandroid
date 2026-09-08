package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class uh1 implements TextWatcher {
    public final /* synthetic */ UsersSelectActivity a;

    public uh1(UsersSelectActivity usersSelectActivity) {
        this.a = usersSelectActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.a;
        if (usersSelectActivity.c.length() == 0) {
            usersSelectActivity.M = false;
            usersSelectActivity.L = false;
            xh1 xh1Var = usersSelectActivity.h;
            if (xh1Var.n) {
                xh1Var.n = false;
                xh1Var.l();
            }
            usersSelectActivity.h.L(null);
            usersSelectActivity.d.setFastScrollVisible(true);
            usersSelectActivity.d.setVerticalScrollBarEnabled(false);
            usersSelectActivity.f.d.setText(LocaleController.getString(R.string.NoContacts));
            return;
        }
        xh1 xh1Var2 = usersSelectActivity.h;
        boolean z10 = xh1Var2.n;
        if (!z10) {
            usersSelectActivity.M = true;
            usersSelectActivity.L = true;
            if (!z10) {
                xh1Var2.n = true;
                xh1Var2.l();
            }
            usersSelectActivity.d.setFastScrollVisible(false);
            usersSelectActivity.d.setVerticalScrollBarEnabled(true);
            usersSelectActivity.f.d.setText(LocaleController.getString(R.string.NoResult));
        }
        usersSelectActivity.f.e(true, true);
        usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
