// default package

import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ah6 b;

    public /* synthetic */ vg6(ah6 ah6Var, byte b) {
        this.a = b;
        this.b = ah6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lx4 lx4Var;
        ox4[] ox4VarArr;
        byte b = this.a;
        ah6 ah6Var = this.b;
        switch (b) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (lx4Var = ah6Var.T) != null) {
                    lx4Var.c.d = 0L;
                    ah6Var.U.c.d = 0L;
                    ah6Var.c0();
                    break;
                }
                break;
            case 1:
                ah6Var.l0();
                break;
            case 2:
                z81.j0(ah6Var);
                break;
            case 3:
                ah6Var.m0();
                break;
            case 4:
                ah6Var.n0();
                break;
            case 5:
                new jj7(ah6Var, ah6Var.getParentActivity()).show();
                break;
            case 6:
                ah6Var.presentFragment(new z81(ir2.l("needFinishFragment", false)));
                break;
            case 7:
                if (ah6Var.getParentActivity() != null && (ox4VarArr = ah6Var.L) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (ah6Var.b.getWidth() - ((ox4VarArr[4].getX() + ah6Var.G.getX()) + r0.getWidth()))) / gl.p;
                    je5 je5Var = new je5(ah6Var.getParentActivity(), 3);
                    ah6Var.Q = je5Var;
                    je5Var.setTranslationY(gl.L(4.0f) + (-ah6Var.M));
                    ah6Var.Q.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
                    ah6Var.Q.p(false);
                    ah6Var.Q.j(true);
                    ah6Var.Q.t(k96.M0(2131744060, null));
                    ah6Var.Q.n(1.0f, (-width) + 7.33f);
                    ah6Var.b.addView(ah6Var.Q, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    je5 je5Var2 = ah6Var.Q;
                    je5Var2.r0 = new vg6(ah6Var, (byte) 8);
                    je5Var2.d = 8000L;
                    je5Var2.v();
                    le5.r.b();
                    break;
                }
                break;
            default:
                gl.B2(ah6Var.Q);
                break;
        }
    }
}
