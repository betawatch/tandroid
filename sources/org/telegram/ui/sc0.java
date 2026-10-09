package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ sc0(hd0 hd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = hd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd0 hd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (hd0Var.K != null && hd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        hd0Var.K.getMapAsync(new tc0(hd0Var, 0));
                        hd0Var.u0 = true;
                        if (hd0Var.v0) {
                            hd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            default:
                hd0 hd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new sc0(hd0Var2, iMapView2, 0));
                break;
        }
    }
}
