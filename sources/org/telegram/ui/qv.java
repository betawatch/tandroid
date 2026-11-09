package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv b;
    public final /* synthetic */ View c;

    public /* synthetic */ qv(rv rvVar, View view, int i7) {
        this.a = i7;
        this.b = rvVar;
        this.c = view;
    }

    public final void a(boolean z9) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof di.p) {
                    this.b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vs(16), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof di.p) {
                    this.b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vs(16), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
