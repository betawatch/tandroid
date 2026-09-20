package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
