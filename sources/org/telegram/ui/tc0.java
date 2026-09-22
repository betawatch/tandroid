package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ tc0(id0 id0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = id0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                id0 id0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (id0Var.K != null && id0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        id0Var.K.getMapAsync(new uc0(id0Var, 0));
                        id0Var.u0 = true;
                        if (id0Var.v0) {
                            id0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                id0 id0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new tc0(id0Var2, iMapView2, 0));
                break;
        }
    }
}
