package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
