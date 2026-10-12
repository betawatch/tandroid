package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ue1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f = false;
    public final /* synthetic */ af1 h;

    public ue1(af1 af1Var) {
        this.h = af1Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        af1 af1Var = this.h;
        if (af1Var.a.getVisibility() != 0) {
            af1Var.a.setVisibility(0);
            af1Var.a.setAlpha(0.0f);
        }
        af1Var.r.setVisibility(8);
        af1Var.d.l();
        af1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        af1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new te1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ze1 ze1Var = this.h.e;
        if (ze1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ze1Var.e);
            ze1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ze1Var.c.clear();
            ze1Var.d.clear();
            ze1Var.l();
            ze1Var.h.r.setVisibility(8);
        } else {
            int i10 = ze1Var.f + 1;
            ze1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ye1 ye1Var = new ye1(ze1Var, obj, i10, 0);
            ze1Var.e = ye1Var;
            dispatchQueue.postRunnable(ye1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new te1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
