package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i9) {
        this.a = i9;
        this.b = pc0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (pc0Var.G != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.G.getMapAsync(new zb0(pc0Var, 0));
                        pc0Var.q0 = true;
                        if (pc0Var.r0) {
                            pc0Var.G.onResume();
                            break;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            default:
                pc0 pc0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yb0(pc0Var2, iMapView2, 0));
                break;
        }
    }
}
