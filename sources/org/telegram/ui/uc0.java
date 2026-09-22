package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;

    public /* synthetic */ uc0(kd0 kd0Var, int i10) {
        this.a = i10;
        this.b = kd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kd0 kd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = kd0Var.J;
                if (iCameraUpdate != null) {
                    kd0Var.I.moveCamera(iCameraUpdate);
                    kd0Var.J = null;
                    break;
                }
                break;
            case 1:
                kd0 kd0Var2 = this.b;
                kd0Var2.getLocationController().setProximityLocation(kd0Var2.e0, 0, true);
                kd0Var2.G = false;
                break;
            case 2:
                kd0 kd0Var3 = this.b;
                IMapsProvider.IMap iMap = kd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!kd0Var3.R.getRadiusSet()) {
                    double d = kd0Var3.P;
                    if (d > 0.0d) {
                        kd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = kd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            kd0Var3.O = null;
                        }
                    }
                }
                kd0Var3.R = null;
                break;
            case 3:
                hd0 hd0Var = this.b.x;
                if (hd0Var != null) {
                    hd0Var.a();
                    break;
                }
                break;
            case 4:
                kd0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new uc0(this.b, 0));
                break;
        }
    }
}
