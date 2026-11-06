package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sn0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Activity activity = photoViewer.D;
                if (!(activity instanceof LaunchActivity)) {
                    if (photoViewer.P1()) {
                        photoViewer.z0(true, false);
                        break;
                    }
                } else {
                    ((LaunchActivity) activity).onBackPressed();
                    break;
                }
                break;
            default:
                ((qb1) this.b).run();
                break;
        }
    }
}
