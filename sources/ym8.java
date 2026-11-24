// default package

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ym8 extends sp8 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym8(ProfileActivity profileActivity, Context context, long j, a aVar, om8 om8Var, xm8 xm8Var, op8 op8Var, kp8 kp8Var) {
        super(context, j, aVar, om8Var, xm8Var, op8Var, kp8Var);
        this.t1 = profileActivity;
    }

    @Override // sp8
    public final void setCustomAvatarProgress(float f) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f;
        profileActivity.H1();
    }
}
