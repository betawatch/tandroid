package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                IMapsProvider.ICameraUpdate iCameraUpdate = rc0Var.F;
                if (iCameraUpdate != null) {
                    rc0Var.E.moveCamera(iCameraUpdate);
                    rc0Var.F = null;
                    break;
                }
                break;
            case 1:
                rc0 rc0Var2 = this.b;
                rc0Var2.getLocationController().setProximityLocation(rc0Var2.a0, 0, true);
                rc0Var2.C = false;
                break;
            case 2:
                rc0 rc0Var3 = this.b;
                IMapsProvider.IMap iMap = rc0Var3.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!rc0Var3.N.getRadiusSet()) {
                    double d = rc0Var3.L;
                    if (d > 0.0d) {
                        rc0Var3.K.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = rc0Var3.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            rc0Var3.K = null;
                        }
                    }
                }
                rc0Var3.N = null;
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
