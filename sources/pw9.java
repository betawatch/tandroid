// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pw9 implements qq7, ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw9 b;

    public /* synthetic */ pw9(tw9 tw9Var, byte b) {
        this.a = b;
        this.b = tw9Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        iq5 H0 = gm.H0(wzcVar, false);
        tw9 tw9Var = this.b;
        tw9Var.e = H0;
        tw9Var.c.setPadding(H0.a, H0.b, H0.c, H0.d);
        tw9Var.b.requestLayout();
        return wzc.b;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        tw9 tw9Var = this.b;
        switch (b) {
            case 1:
                he heVar2 = tw9Var.d0;
                if (heVar2 != null) {
                    heVar2.dismiss();
                    break;
                }
                break;
            default:
                he heVar3 = tw9Var.d0;
                if (heVar3 != null) {
                    heVar3.dismiss();
                    tw9Var.d0 = null;
                }
                tw9Var.dismiss();
                break;
        }
    }
}
