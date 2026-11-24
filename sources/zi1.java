// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zi1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fj1 b;

    public /* synthetic */ zi1(fj1 fj1Var, byte b) {
        this.a = b;
        this.b = fj1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        fj1 fj1Var = this.b;
        switch (b) {
            case 0:
                fj1Var.h0(view);
                break;
            case 1:
                fj1Var.x.n(fj1Var.E != null, new wi1(fj1Var, (byte) 2), new n1(fj1Var, (byte) 11), 0);
                fj1Var.L.H(0);
                fj1Var.L.K(43);
                fj1Var.n.d();
                break;
            case 2:
                if (!fj1Var.l0) {
                    fj1Var.l0();
                    break;
                } else if (fj1Var.c0) {
                    fj1Var.c0 = false;
                    fj1Var.n0();
                    break;
                }
                break;
            default:
                if (!fj1Var.c0) {
                    fj1Var.c0 = true;
                    fj1Var.n0();
                    break;
                }
                break;
        }
    }
}
