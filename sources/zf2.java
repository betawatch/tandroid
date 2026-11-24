// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf2 implements xe7, ee, g59, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wg2 b;

    public /* synthetic */ zf2(wg2 wg2Var, byte b) {
        this.a = b;
        this.b = wg2Var;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        this.b.s0(i, view);
    }

    @Override // h59
    public final boolean g(int i, View view) {
        wg2 wg2Var = this.b;
        if (wg2Var.getParentActivity() != null) {
            y59 adapter = wg2Var.c.getAdapter();
            sg2 sg2Var = wg2Var.a;
            if (adapter == sg2Var) {
                return wg2Var.i0(sg2Var.E(i), false, view);
            }
        }
        return false;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        wg2 wg2Var = this.b;
        switch (b) {
            case 1:
                wg2Var.y0();
                break;
            default:
                wg2Var.finishFragment();
                break;
        }
    }

    @Override // xe7
    public final void run(long j) {
        this.b.t0(j);
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
