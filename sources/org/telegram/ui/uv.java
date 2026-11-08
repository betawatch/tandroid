package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class uv extends h11 {
    public final /* synthetic */ ww e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(ww wwVar, tv tvVar) {
        super(tvVar);
        this.e = wwVar;
    }

    @Override // org.telegram.ui.h11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
