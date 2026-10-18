package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s9 extends y9 {
    public final /* synthetic */ t9 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(t9 t9Var, int i10) {
        super(i10);
        this.i0 = t9Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        setFinishing(true);
        this.i0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void removeSelfFromStack() {
        this.i0.dismiss();
    }
}
