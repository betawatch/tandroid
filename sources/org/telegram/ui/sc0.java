package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ sc0(id0 id0Var, int i10) {
        this.a = i10;
        this.b = id0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                id0 id0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = id0Var.J;
                if (iCameraUpdate != null) {
                    id0Var.I.moveCamera(iCameraUpdate);
                    id0Var.J = null;
                    break;
                }
                break;
            case 1:
                id0 id0Var2 = this.b;
                id0Var2.getLocationController().setProximityLocation(id0Var2.e0, 0, true);
                id0Var2.G = false;
                break;
            case 2:
                id0 id0Var3 = this.b;
                IMapsProvider.IMap iMap = id0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!id0Var3.R.getRadiusSet()) {
                    double d = id0Var3.P;
                    if (d > 0.0d) {
                        id0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = id0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            id0Var3.O = null;
                        }
                    }
                }
                id0Var3.R = null;
                break;
            case 3:
                fd0 fd0Var = this.b.x;
                if (fd0Var != null) {
                    fd0Var.a();
                    break;
                }
                break;
            case 4:
                id0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new sc0(this.b, 0));
                break;
        }
    }
}
