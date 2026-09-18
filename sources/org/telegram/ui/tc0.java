package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;

    public /* synthetic */ tc0(jd0 jd0Var, int i10) {
        this.a = i10;
        this.b = jd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jd0 jd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = jd0Var.J;
                if (iCameraUpdate != null) {
                    jd0Var.I.moveCamera(iCameraUpdate);
                    jd0Var.J = null;
                    break;
                }
                break;
            case 1:
                jd0 jd0Var2 = this.b;
                jd0Var2.getLocationController().setProximityLocation(jd0Var2.e0, 0, true);
                jd0Var2.G = false;
                break;
            case 2:
                jd0 jd0Var3 = this.b;
                IMapsProvider.IMap iMap = jd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!jd0Var3.R.getRadiusSet()) {
                    double d = jd0Var3.P;
                    if (d > 0.0d) {
                        jd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = jd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            jd0Var3.O = null;
                        }
                    }
                }
                jd0Var3.R = null;
                break;
            case 3:
                gd0 gd0Var = this.b.x;
                if (gd0Var != null) {
                    gd0Var.a();
                    break;
                }
                break;
            case 4:
                jd0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new tc0(this.b, 0));
                break;
        }
    }
}
