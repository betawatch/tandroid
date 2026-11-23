package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yv extends h11 {
    public final /* synthetic */ bx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(bx bxVar, xv xvVar) {
        super(xvVar);
        this.e = bxVar;
    }

    @Override // org.telegram.ui.h11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
