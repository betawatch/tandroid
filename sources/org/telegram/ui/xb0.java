package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ xb0(pc0 pc0Var, int i9) {
        this.a = i9;
        this.b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = pc0Var.F;
                if (iCameraUpdate != null) {
                    pc0Var.E.moveCamera(iCameraUpdate);
                    pc0Var.F = null;
                    break;
                }
                break;
            case 1:
                pc0 pc0Var2 = this.b;
                pc0Var2.getLocationController().setProximityLocation(pc0Var2.a0, 0, true);
                pc0Var2.C = false;
                break;
            case 2:
                pc0 pc0Var3 = this.b;
                IMapsProvider.IMap iMap = pc0Var3.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!pc0Var3.N.getRadiusSet()) {
                    double d = pc0Var3.L;
                    if (d > 0.0d) {
                        pc0Var3.K.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = pc0Var3.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            pc0Var3.K = null;
                        }
                    }
                }
                pc0Var3.N = null;
                break;
            case 3:
                mc0 mc0Var = this.b.x;
                if (mc0Var != null) {
                    mc0Var.a();
                    break;
                }
                break;
            case 4:
                pc0.V(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new xb0(this.b, 0));
                break;
        }
    }
}
