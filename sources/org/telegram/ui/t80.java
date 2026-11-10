package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t80 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9 = i12 - i10 > i11 - i7;
        if (z9 != this.a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(this, 22));
            this.a = z9;
        }
    }
}
