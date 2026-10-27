package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw b;
    public final /* synthetic */ View c;

    public /* synthetic */ rw(sw swVar, View view, int i10) {
        this.a = i10;
        this.b = swVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof di.q) {
                    this.b.O0.E0.i((di.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof di.q) {
                    this.b.O0.E0.i((di.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
