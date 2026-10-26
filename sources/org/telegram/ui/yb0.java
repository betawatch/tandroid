package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = pc0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (pc0Var.K != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.K.getMapAsync(new ac0(pc0Var, 0));
                        pc0Var.t0 = true;
                        if (pc0Var.u0) {
                            pc0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
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
