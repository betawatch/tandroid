package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                if (view instanceof th.l) {
                    this.b.O0.E0.i((th.l) view, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(2), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof th.l) {
                    this.b.O0.E0.i((th.l) view2, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(2), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
