package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uj0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;

    public uj0(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationX((this.a + this.b) - i10);
    }
}
