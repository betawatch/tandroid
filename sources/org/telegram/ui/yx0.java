package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class yx0 extends h11 {
    public final /* synthetic */ ay0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(ay0 ay0Var, xx0 xx0Var) {
        super(xx0Var);
        this.e = ay0Var;
    }

    @Override // org.telegram.ui.h11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
