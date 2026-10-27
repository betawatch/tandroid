package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ zb0(rc0 rc0Var, int i10) {
        this.a = i10;
        this.b = rc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rc0 rc0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = rc0Var.J;
                if (iCameraUpdate != null) {
                    rc0Var.I.moveCamera(iCameraUpdate);
                    rc0Var.J = null;
                    break;
                }
                break;
            case 1:
                rc0 rc0Var2 = this.b;
                rc0Var2.getLocationController().setProximityLocation(rc0Var2.e0, 0, true);
                rc0Var2.G = false;
                break;
            case 2:
                rc0 rc0Var3 = this.b;
                IMapsProvider.IMap iMap = rc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!rc0Var3.R.getRadiusSet()) {
                    double d = rc0Var3.P;
                    if (d > 0.0d) {
                        rc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = rc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            rc0Var3.O = null;
                        }
                    }
                }
                rc0Var3.R = null;
                break;
            case 3:
                oc0 oc0Var = this.b.x;
                if (oc0Var != null) {
                    oc0Var.a();
                    break;
                }
                break;
            case 4:
                rc0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new zb0(this.b, 0));
                break;
        }
    }
}
