package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z20 extends org.telegram.ui.Components.vg0 {
    public final /* synthetic */ a50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(a50 a50Var, LaunchActivity launchActivity, x30 x30Var, h40 h40Var, y20 y20Var) {
        super(launchActivity, x30Var, h40Var, y20Var);
        this.s1 = a50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.s1.b.invalidate();
    }
}
