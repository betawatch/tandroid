package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z10 extends View {
    public final /* synthetic */ x30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = x30Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.U0();
        }
    }
}
