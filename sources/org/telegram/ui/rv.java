package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof fi.p) {
                    this.b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ne(22), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof fi.p) {
                    this.b.P0.F0.i((fi.p) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ne(22), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
