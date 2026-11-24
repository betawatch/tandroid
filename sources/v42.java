// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v42 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c52 b;

    public /* synthetic */ v42(c52 c52Var, byte b) {
        this.a = b;
        this.b = c52Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 4;
        c52 c52Var = this.b;
        switch (b) {
            case 0:
                c52Var.Z();
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = c52Var.T;
                if (!c52Var.L && !c52Var.O0 && !c52Var.b.J && c52Var.M0 && c52Var.U0 == null && editTextBoldCursor.hasFocus() && c52Var.isShown()) {
                    gm.E3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                if (!c52Var.L && c52Var.M0 && c52Var.isShown()) {
                    c52Var.c0();
                    break;
                }
                break;
            case 3:
                if (!c52Var.L) {
                    float f = c52Var.n0;
                    if (f < 1.0f && c52Var.m0 == null) {
                        zna znaVar = new zna(new xk4(f));
                        c52Var.m0 = znaVar;
                        aoa aoaVar = new aoa(1.0f);
                        aoaVar.a(0.55f);
                        aoaVar.b(65.0f);
                        znaVar.m = aoaVar;
                        c52Var.m0.f(0.001f);
                        c52Var.m0.b(new h20(c52Var, b2));
                        c52Var.m0.a(new hx0(c52Var, b2));
                        c52Var.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                if (c52Var.M0 && !c52Var.L) {
                    c52Var.b0();
                    if (c52Var.N0) {
                        c52Var.c0();
                        break;
                    }
                }
                break;
            default:
                if (!c52Var.q0) {
                    c52Var.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
