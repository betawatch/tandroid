package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;

    public /* synthetic */ rc0(hd0 hd0Var, int i10) {
        this.a = i10;
        this.b = hd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd0 hd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = hd0Var.J;
                if (iCameraUpdate != null) {
                    hd0Var.I.moveCamera(iCameraUpdate);
                    hd0Var.J = null;
                    break;
                }
                break;
            case 1:
                hd0 hd0Var2 = this.b;
                hd0Var2.getLocationController().setProximityLocation(hd0Var2.e0, 0, true);
                hd0Var2.G = false;
                break;
            case 2:
                hd0 hd0Var3 = this.b;
                IMapsProvider.IMap iMap = hd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!hd0Var3.R.getRadiusSet()) {
                    double d = hd0Var3.P;
                    if (d > 0.0d) {
                        hd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = hd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            hd0Var3.O = null;
                        }
                    }
                }
                hd0Var3.R = null;
                break;
            case 3:
                ed0 ed0Var = this.b.x;
                if (ed0Var != null) {
                    ed0Var.a();
                    break;
                }
                break;
            case 4:
                hd0.V(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new rc0(this.b, 0));
                break;
        }
    }
}
