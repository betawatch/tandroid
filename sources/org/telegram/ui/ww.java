package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww {
    public final /* synthetic */ int a;
    public final /* synthetic */ xw b;
    public final /* synthetic */ View c;

    public /* synthetic */ ww(xw xwVar, View view, int i10) {
        this.a = i10;
        this.b = xwVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof lh.o) {
                    this.b.K0.A0.i((lh.o) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(22), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof lh.o) {
                    this.b.K0.A0.i((lh.o) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(22), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
