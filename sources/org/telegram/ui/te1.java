package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class te1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f = false;
    public final /* synthetic */ ze1 h;

    public te1(ze1 ze1Var) {
        this.h = ze1Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        ze1 ze1Var = this.h;
        if (ze1Var.a.getVisibility() != 0) {
            ze1Var.a.setVisibility(0);
            ze1Var.a.setAlpha(0.0f);
        }
        ze1Var.r.setVisibility(8);
        ze1Var.d.l();
        ze1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ze1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new se1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ye1 ye1Var = this.h.e;
        if (ye1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ye1Var.e);
            ye1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ye1Var.c.clear();
            ye1Var.d.clear();
            ye1Var.l();
            ye1Var.h.r.setVisibility(8);
        } else {
            int i10 = ye1Var.f + 1;
            ye1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xe1 xe1Var = new xe1(ye1Var, obj, i10, 0);
            ye1Var.e = xe1Var;
            dispatchQueue.postRunnable(xe1Var, 300L);
        }
        if (this.f || TextUtils.isEmpty(obj)) {
            if (this.f && TextUtils.isEmpty(obj)) {
                m();
                return;
            }
            return;
        }
        if (this.h.s.getVisibility() != 0) {
            this.h.s.setVisibility(0);
            this.h.s.setAlpha(0.0f);
        }
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new se1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
