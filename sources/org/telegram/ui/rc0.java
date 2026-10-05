package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ rc0(gd0 gd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = gd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (gd0Var.K != null && gd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        gd0Var.K.getMapAsync(new sc0(gd0Var, 0));
                        gd0Var.u0 = true;
                        if (gd0Var.v0) {
                            gd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            default:
                gd0 gd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new rc0(gd0Var2, iMapView2, 0));
                break;
        }
    }
}
