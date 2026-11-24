// default package

import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yn8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ko8 b;

    public /* synthetic */ yn8(ko8 ko8Var, byte b) {
        this.a = b;
        this.b = ko8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ko8 ko8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = ko8Var.e;
                profileActivity.getMessagesController().z3(profileActivity, profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = ko8Var.e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.i3();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i = profileActivity2.r6;
                if (i >= 0) {
                    profileActivity2.c.g1(i, profileActivity2.s6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
