// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm7 b;

    public /* synthetic */ vl7(lm7 lm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        r3 = null;
        fj6 fj6Var = null;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                lm7Var.j0();
                break;
            case 1:
                lm7Var.R = null;
                lm7Var.y0(2, true);
                break;
            case 2:
                LaunchActivity launchActivity = LaunchActivity.H1;
                j1d j1dVar = launchActivity != null ? launchActivity.g1 : null;
                if ((j1dVar == null || j1dVar.c <= 0) && lm7Var.O != (i = lm7Var.P)) {
                    lm7Var.O = i;
                    lm7Var.M0(false);
                    break;
                }
                break;
            case 3:
                na4 na4Var = lm7Var.a0;
                da4[] da4VarArr = lm7Var.Y;
                if (lm7Var.getParentLayout() != null) {
                    for (e eVar : lm7Var.getParentLayout().getFragmentStack()) {
                        if (eVar instanceof fj6) {
                            fj6Var = (fj6) eVar;
                        }
                    }
                }
                boolean z = fj6Var != null && fj6Var.b0() == lm7Var;
                boolean z2 = ea4.e(fj6Var) && !ea4.b(lm7Var);
                boolean z3 = z && z2;
                na4Var.c(z2, z3, PhotoViewer.C0() && PhotoViewer.q0().V0(), ea4.l(lm7Var));
                if (!z && lm7Var.c0) {
                    na4Var.b();
                }
                lm7Var.c0 = z;
                boolean z4 = false;
                for (int i2 = 0; i2 < da4VarArr.length; i2++) {
                    boolean z5 = z2 && ea4.d(lm7Var.b[i2].f);
                    z4 |= z5;
                    lm7Var.O0(i2);
                    da4VarArr[i2].a.b(z5);
                    da4VarArr[i2].a.c();
                }
                hl.d3(lm7Var.Z, (z4 || z3) ? 100L : 400L);
                break;
            default:
                lm7Var.H.setVisibility(8);
                break;
        }
    }
}
