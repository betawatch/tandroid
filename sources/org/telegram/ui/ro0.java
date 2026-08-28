package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ro0 extends s51 {
    public final /* synthetic */ uo0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro0(uo0 uo0Var, qo0 qo0Var) {
        super(qo0Var);
        this.e = uo0Var;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.e0 = null;
    }
}
