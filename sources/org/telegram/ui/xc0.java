package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;

    public /* synthetic */ xc0(nd0 nd0Var, int i10) {
        this.a = i10;
        this.b = nd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd0 nd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = nd0Var.J;
                if (iCameraUpdate != null) {
                    nd0Var.I.moveCamera(iCameraUpdate);
                    nd0Var.J = null;
                    break;
                }
                break;
            case 1:
                nd0 nd0Var2 = this.b;
                nd0Var2.getLocationController().setProximityLocation(nd0Var2.e0, 0, true);
                nd0Var2.G = false;
                break;
            case 2:
                nd0 nd0Var3 = this.b;
                IMapsProvider.IMap iMap = nd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!nd0Var3.R.getRadiusSet()) {
                    double d = nd0Var3.P;
                    if (d > 0.0d) {
                        nd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = nd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            nd0Var3.O = null;
                        }
                    }
                }
                nd0Var3.R = null;
                break;
            case 3:
                kd0 kd0Var = this.b.x;
                if (kd0Var != null) {
                    kd0Var.a();
                    break;
                }
                break;
            case 4:
                nd0.V(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new xc0(this.b, 0));
                break;
        }
    }
}
