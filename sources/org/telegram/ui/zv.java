package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
