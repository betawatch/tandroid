package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sj0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;

    public sj0(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationX((this.a + this.b) - i10);
    }
}
