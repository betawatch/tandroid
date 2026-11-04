package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yu0 extends x01 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(ProfileActivity profileActivity, xu0 xu0Var) {
        super(xu0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.x01, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.O5 = null;
    }
}
