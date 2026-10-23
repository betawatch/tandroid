package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ wb0(nc0 nc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = nc0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nc0 nc0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (nc0Var.K != null && nc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        nc0Var.K.getMapAsync(new xb0(nc0Var, 0));
                        nc0Var.u0 = true;
                        if (nc0Var.v0) {
                            nc0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                nc0 nc0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wb0(nc0Var2, iMapView2, 0));
                break;
        }
    }
}
