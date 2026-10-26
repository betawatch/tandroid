package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t9 extends y9 {
    public final /* synthetic */ u9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(u9 u9Var, int i10) {
        super(i10);
        this.g0 = u9Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void finishFragment() {
        setFinishing(true);
        this.g0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void removeSelfFromStack() {
        this.g0.dismiss();
    }
}
