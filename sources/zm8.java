// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zm8 extends jl {
    public final /* synthetic */ ProfileActivity V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        RectF rectF = ProfileActivity.Z6;
        this.V0.H1();
    }

    @Override // jia
    public final void setTextColor(int i) {
        int p1;
        ProfileActivity profileActivity = this.V0;
        profileActivity.K5 = i;
        int f = bm2.f(profileActivity.G5, i, bkb.v0(bkb.x6, profileActivity.A0));
        super.setTextColor(f);
        uo8 uo8Var = profileActivity.F6;
        if (uo8Var == null || uo8Var.c == (p1 = bkb.p1(1.4f, bkb.a(-0.02f, 0.15f, f)))) {
            return;
        }
        uo8Var.c = p1;
        uo8Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        profileActivity.k2();
        hra hraVar = profileActivity.T;
        if (hraVar != null) {
            hraVar.setTranslationX(f - profileActivity.k2());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            gl.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        hra hraVar = profileActivity.T;
        if (hraVar != null) {
            hraVar.setTranslationY(f - gl.L(5.0f));
        }
    }
}
