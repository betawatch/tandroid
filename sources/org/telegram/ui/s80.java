package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s80 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10 = i12 - i10 > i11 - i7;
        if (z10 != this.a) {
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(this, 28));
            this.a = z10;
        }
    }
}
