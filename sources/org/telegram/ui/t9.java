package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t9 extends z9 {
    public final /* synthetic */ u9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(u9 u9Var, int i10) {
        super(i10);
        this.h0 = u9Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
