package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class zv extends j11 {
    public final /* synthetic */ cx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(cx cxVar, yv yvVar) {
        super(yvVar);
        this.e = cxVar;
    }

    @Override // org.telegram.ui.j11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
