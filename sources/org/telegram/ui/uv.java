package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
