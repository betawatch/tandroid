package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw b;
    public final /* synthetic */ View c;

    public /* synthetic */ uw(vw vwVar, View view, int i10) {
        this.a = i10;
        this.b = vwVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof ci.q) {
                    this.b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof ci.q) {
                    this.b.O0.E0.i((ci.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
