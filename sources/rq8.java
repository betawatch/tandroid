// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rq8 extends d1a {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq8(ProfileActivity profileActivity, qq8 qq8Var) {
        super(qq8Var);
        this.e = profileActivity;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.T5 = null;
    }
}
