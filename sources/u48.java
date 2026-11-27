// default package

import android.app.Activity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class u48 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ u48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = false;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.h0(true);
                break;
            case 1:
                o68Var.X0(false);
                uc7.e1().edit().putInt("taptostorysoundhint", uc7.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            case 2:
                o68Var.T1.setVisibility(8);
                break;
            case 3:
                if (!o68Var.t0.H0) {
                    o68Var.j3 = null;
                    if (o68Var.r0 == null) {
                        kg5 kg5Var = new kg5(o68Var.getContext(), 3);
                        kg5Var.n(1.0f, -22.0f);
                        o68Var.r0 = kg5Var;
                        kg5Var.i(vm2.o(vm2.f(0.13f, -16777216, -1), jn7.O3));
                        kg5 kg5Var2 = o68Var.r0;
                        kg5Var2.V = false;
                        kg5Var2.t(ob6.M0(2131746126, null));
                        o68Var.r0.setPadding(hl.L(8.0f), 0, hl.L(8.0f), hl.L(1.0f));
                        o68Var.M0.addView(o68Var.r0, tre.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, o68Var.h2 ? 0.0f : 56.0f));
                    }
                    o68Var.r0.v();
                    xea.G(true);
                    break;
                }
                break;
            case 4:
                o68Var.K0();
                break;
            case 5:
                ((ccb) o68Var.A1).b(true);
                break;
            case 6:
                o68Var.H0();
                break;
            case 7:
                o68Var.u3 = 0L;
                g58 g58Var = o68Var.L1;
                if (g58Var != null) {
                    g58Var.P(true);
                    o68Var.L1.K2();
                    o68Var.h0(true);
                    break;
                }
                break;
            case 8:
                Activity W = hl.W(o68Var.getContext());
                if (W != null) {
                    pl7 pl7Var = new pl7(o68Var, W, (byte) 29);
                    lcb lcbVar = ((ccb) o68Var.A1).d;
                    kcb kcbVar = lcbVar.A0;
                    if (kcbVar != null) {
                        z = kcbVar.release(pl7Var);
                        lcbVar.A0 = null;
                    }
                    if (!z) {
                        hl.d3(pl7Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                lcb lcbVar2 = ((ccb) o68Var.A1).d;
                lcbVar2.i1 = false;
                lcbVar2.U();
                break;
            case 10:
                o68Var.E0(null);
                break;
            case 11:
                lcb lcbVar3 = o68Var.t0;
                if (lcbVar3 != null) {
                    lcbVar3.L(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            default:
                o68Var.D3 = true;
                o68Var.setActive(false);
                break;
        }
    }
}
