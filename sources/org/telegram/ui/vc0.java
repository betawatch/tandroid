package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ vc0(kd0 kd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = kd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kd0 kd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (kd0Var.K != null && kd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        kd0Var.K.getMapAsync(new wc0(kd0Var, 0));
                        kd0Var.u0 = true;
                        if (kd0Var.v0) {
                            kd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                kd0 kd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vc0(kd0Var2, iMapView2, 0));
                break;
        }
    }
}
