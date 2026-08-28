package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sy0 extends s51 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ProfileActivity profileActivity, ry0 ry0Var) {
        super(ry0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.x5 = null;
    }
}
