package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ zp0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        mq0 mq0Var = this.b;
        if (mq0Var.Y) {
            mq0Var.a0(view, mq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.om0 om0Var = mq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
        mq0Var.X = z10;
        om0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        mq0 mq0Var = this.b;
        qq0 qq0Var = mq0Var.t0;
        if (qq0Var == null) {
            mq0Var.Z();
            return;
        }
        switch (qq0Var.a) {
            case 0:
                rq0 rq0Var = qq0Var.b;
                rq0Var.a.Z();
                rq0Var.b.Z();
                break;
            default:
                rq0 rq0Var2 = qq0Var.b;
                rq0Var2.a.Z();
                rq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        mq0 mq0Var = this.b;
        mq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = mq0Var.m0) != null && m1Var.isShowing()) {
            mq0Var.m0.d(true);
        }
    }
}
