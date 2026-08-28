package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw b;
    public final /* synthetic */ View c;

    public /* synthetic */ uw(vw vwVar, View view, int i9) {
        this.a = i9;
        this.b = vwVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof ih.q) {
                    this.b.K0.A0.i((ih.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(20), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof ih.q) {
                    this.b.K0.A0.i((ih.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(20), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
