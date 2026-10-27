package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t30 extends View {
    public final /* synthetic */ x50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = x50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
