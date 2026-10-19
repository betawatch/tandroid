package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw b;
    public final /* synthetic */ View c;

    public /* synthetic */ sw(tw twVar, View view, int i10) {
        this.a = i10;
        this.b = twVar;
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
