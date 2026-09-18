package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;
    public final /* synthetic */ IMapsProvider.IMapView c;

    public /* synthetic */ uc0(jd0 jd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.a = i10;
        this.b = jd0Var;
        this.c = iMapView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jd0 jd0Var = this.b;
                IMapsProvider.IMapView iMapView = this.c;
                if (jd0Var.K != null && jd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        jd0Var.K.getMapAsync(new vc0(jd0Var, 0));
                        jd0Var.u0 = true;
                        if (jd0Var.v0) {
                            jd0Var.K.onResume();
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                jd0 jd0Var2 = this.b;
                IMapsProvider.IMapView iMapView2 = this.c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new uc0(jd0Var2, iMapView2, 0));
                break;
        }
    }
}
