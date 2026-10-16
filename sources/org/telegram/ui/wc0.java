package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ wc0(ld0 ld0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = ld0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ld0 ld0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (ld0Var.K != null && ld0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        ld0Var.K.getMapAsync(new xc0(ld0Var, 0));
                        ld0Var.u0 = true;
                        if (ld0Var.v0) {
                            ld0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                ld0 ld0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wc0(ld0Var2, iMapView2, 0));
                break;
        }
    }
}
