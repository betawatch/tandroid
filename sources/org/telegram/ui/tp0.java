package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class tp0 extends x61 {
    public final /* synthetic */ wp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(wp0 wp0Var, sp0 sp0Var) {
        super(sp0Var);
        this.e = wp0Var;
    }

    @Override // org.telegram.ui.x61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
