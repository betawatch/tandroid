// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class un8 implements k7b {
    public final /* synthetic */ ProfileActivity a;

    public un8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // k7b
    public final o7b b(long j) {
        ProfileActivity profileActivity = this.a;
        if (j != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) gl.R1(profileActivity.l2(), 0.0f, profileActivity.l2));
        xm8 xm8Var = profileActivity.f0;
        boolean c0 = hc2.c0(profileActivity.F2);
        if (xm8Var == null || xm8Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) xm8Var.getParent()).getScaleX();
        float f = xm8Var.getImageReceiver().N0 * scaleX;
        float f2 = c0 ? 0.32f * f : f;
        m7b m7bVar = new m7b(xm8Var, (byte) 0);
        float[] fArr = new float[2];
        xm8Var.getRootView().getLocationOnScreen(new int[2]);
        gl.p1(xm8Var, (ViewGroup) xm8Var.getRootView(), fArr);
        float f3 = (xm8Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f4 = (xm8Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        m7bVar.c.set(f3, f4, f3 + f, f + f4);
        m7bVar.e = xm8Var.getImageReceiver();
        m7bVar.b = f2;
        return m7bVar;
    }

    @Override // k7b
    public final void c(long j, sma smaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.M2());
        if (j == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.g1(0, profileActivity.c2() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new v36(profileActivity, (byte) 16));
        }
        gl.e3(smaVar, 30L);
    }
}
