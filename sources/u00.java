// default package

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u00 implements m7, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;

    public /* synthetic */ u00(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        if (!(view instanceof j20)) {
            return false;
        }
        i20 i20Var = this.b;
        if (i20Var.I0()) {
            return false;
        }
        j20 j20Var = (j20) view;
        i20Var.R0(j20Var, j20Var.getMessageObject());
        return true;
    }

    @Override // m7
    public final void h(int i) {
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                if (i >= 0) {
                    float[] fArr = i20.T2;
                    if (i < 6) {
                        MediaController.w().l0(true, fArr[i]);
                        i20Var.V0(true);
                        break;
                    }
                }
                break;
            case 1:
                if (i == 1 || i == 2) {
                    boolean z = gba.L0;
                    if ((z && i == 1) || (gba.K0 && i == 2)) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(i);
                    }
                    i20Var.t1.f();
                    if (z != gba.L0) {
                        i20Var.r1.D0();
                        i20Var.M0(false);
                    }
                } else if (i == 4) {
                    if (gba.P0 == 1) {
                        gba.D(0);
                    } else {
                        gba.D(1);
                    }
                } else if (gba.P0 == 2) {
                    gba.D(0);
                } else {
                    gba.D(2);
                }
                i20Var.X0();
                break;
            default:
                i20Var.J0(i);
                break;
        }
    }
}
