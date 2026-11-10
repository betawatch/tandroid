package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv b;
    public final /* synthetic */ View c;

    public /* synthetic */ rv(sv svVar, View view, int i7) {
        this.a = i7;
        this.b = svVar;
        this.c = view;
    }

    public final void a(boolean z9) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof di.p) {
                    this.b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.us(16), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof di.p) {
                    this.b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.us(16), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
