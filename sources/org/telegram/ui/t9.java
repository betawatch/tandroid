package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
