package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xp0 extends i71 {
    public final /* synthetic */ aq0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(aq0 aq0Var, wp0 wp0Var) {
        super(wp0Var);
        this.e = aq0Var;
    }

    @Override // org.telegram.ui.i71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
