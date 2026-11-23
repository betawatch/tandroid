package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Activity activity = photoViewer.E;
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
                ((tb1) this.b).run();
                break;
        }
    }
}
