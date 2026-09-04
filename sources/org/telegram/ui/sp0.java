package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class sp0 extends a71 {
    public final /* synthetic */ vp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(vp0 vp0Var, rp0 rp0Var) {
        super(rp0Var);
        this.e = vp0Var;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
