// default package

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class s32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;

    public /* synthetic */ s32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
            case 2:
                c42Var.P();
                break;
            case 1:
                c42Var.c0();
                break;
            case 3:
                double[] dArr = c42Var.b.x4;
                c42Var.g0(dArr[0], dArr[1]);
                break;
            case 4:
                c42Var.getClass();
                gl.c3(new s32(c42Var, (byte) 7));
                break;
            case 5:
                ra6 ra6Var = c42Var.L;
                if (!c42Var.l0) {
                    ty4 ty4Var = c42Var.E;
                    if (ty4Var != null && (location = c42Var.j0) != null) {
                        location.setLatitude(((yh5) ty4Var.d().b).a);
                        c42Var.j0.setLongitude(((yh5) c42Var.E.d().b).b);
                    }
                    ra6Var.L(c42Var.j0);
                    ra6Var.H();
                    break;
                } else {
                    c42Var.l0 = false;
                    break;
                }
            case 6:
                View view = c42Var.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            case 7:
                View view2 = c42Var.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                break;
            default:
                c42Var.g0(0.0d, 0.0d);
                break;
        }
    }
}
