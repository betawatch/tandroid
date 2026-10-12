package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ yc0(nd0 nd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = nd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd0 nd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (nd0Var.K != null && nd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        nd0Var.K.getMapAsync(new zc0(nd0Var, 0));
                        nd0Var.u0 = true;
                        if (nd0Var.v0) {
                            nd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                nd0 nd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yc0(nd0Var2, iMapView2, 0));
                break;
        }
    }
}
