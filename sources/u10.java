// default package

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u10 implements m7, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ u10(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        if (!(view instanceof j30)) {
            return false;
        }
        i30 i30Var = this.b;
        if (i30Var.I0()) {
            return false;
        }
        j30 j30Var = (j30) view;
        i30Var.R0(j30Var, j30Var.getMessageObject());
        return true;
    }

    @Override // m7
    public final void h(int i) {
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                if (i >= 0) {
                    float[] fArr = i30.T2;
                    if (i < 6) {
                        MediaController.w().l0(true, fArr[i]);
                        i30Var.V0(true);
                        break;
                    }
                }
                break;
            case 1:
                if (i == 1 || i == 2) {
                    boolean z = gda.K0;
                    if ((z && i == 1) || (gda.J0 && i == 2)) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(i);
                    }
                    i30Var.t1.f();
                    if (z != gda.K0) {
                        i30Var.r1.D0();
                        i30Var.M0(false);
                    }
                } else if (i == 4) {
                    if (gda.O0 == 1) {
                        gda.D(0);
                    } else {
                        gda.D(1);
                    }
                } else if (gda.O0 == 2) {
                    gda.D(0);
                } else {
                    gda.D(2);
                }
                i30Var.X0();
                break;
            default:
                i30Var.J0(i);
                break;
        }
    }
}
