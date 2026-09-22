package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class tp0 extends a71 {
    public final /* synthetic */ wp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(wp0 wp0Var, sp0 sp0Var) {
        super(sp0Var);
        this.e = wp0Var;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
