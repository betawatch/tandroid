package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv b;
    public final /* synthetic */ View c;

    public /* synthetic */ sv(tv tvVar, View view, int i7) {
        this.a = i7;
        this.b = tvVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof fi.p) {
                    this.b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.me(22), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof fi.p) {
                    this.b.P0.F0.i((fi.p) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.me(22), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
