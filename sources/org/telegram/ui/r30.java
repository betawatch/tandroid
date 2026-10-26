package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r30 extends View {
    public final /* synthetic */ v50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = v50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
