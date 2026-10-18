package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ xb0(pc0 pc0Var, int i10) {
        this.a = i10;
        this.b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = pc0Var.J;
                if (iCameraUpdate != null) {
                    pc0Var.I.moveCamera(iCameraUpdate);
                    pc0Var.J = null;
                    break;
                }
                break;
            case 1:
                pc0 pc0Var2 = this.b;
                pc0Var2.getLocationController().setProximityLocation(pc0Var2.e0, 0, true);
                pc0Var2.G = false;
                break;
            case 2:
                pc0 pc0Var3 = this.b;
                IMapsProvider.IMap iMap = pc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!pc0Var3.R.getRadiusSet()) {
                    double d = pc0Var3.P;
                    if (d > 0.0d) {
                        pc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = pc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            pc0Var3.O = null;
                        }
                    }
                }
                pc0Var3.R = null;
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
