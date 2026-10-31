package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;
    public final /* synthetic */ View c;

    public /* synthetic */ tw(uw uwVar, View view, int i10) {
        this.a = i10;
        this.b = uwVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof th.l) {
                    this.b.O0.E0.i((th.l) view, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(2), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof th.l) {
                    this.b.O0.E0.i((th.l) view2, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(2), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
