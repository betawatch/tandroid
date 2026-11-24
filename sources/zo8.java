// default package

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zo8 extends tr8 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo8(ProfileActivity profileActivity, Context context, long j, a aVar, po8 po8Var, yo8 yo8Var, pr8 pr8Var, lr8 lr8Var) {
        super(context, j, aVar, po8Var, yo8Var, pr8Var, lr8Var);
        this.t1 = profileActivity;
    }

    @Override // tr8
    public final void setCustomAvatarProgress(float f) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.y5 = f;
        profileActivity.J1();
    }
}
