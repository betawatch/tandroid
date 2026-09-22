package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wz0 extends y61 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(ProfileActivity profileActivity, vz0 vz0Var) {
        super(vz0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.y61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
