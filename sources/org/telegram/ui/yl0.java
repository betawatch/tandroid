package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yl0 extends h11 {
    public final /* synthetic */ bm0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(bm0 bm0Var, xl0 xl0Var) {
        super(xl0Var);
        this.e = bm0Var;
    }

    @Override // org.telegram.ui.h11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
