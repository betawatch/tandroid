package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w10 extends org.telegram.ui.Components.vf0 {
    public final /* synthetic */ x30 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(x30 x30Var, LaunchActivity launchActivity, u20 u20Var, f30 f30Var, v10 v10Var) {
        super(launchActivity, u20Var, f30Var, v10Var);
        this.t1 = x30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
