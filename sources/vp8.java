// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vp8 implements m9b {
    public final /* synthetic */ ProfileActivity a;

    public vp8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // m9b
    public final q9b b(long j) {
        ProfileActivity profileActivity = this.a;
        if (j != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) gm.R1(profileActivity.n2(), 0.0f, profileActivity.l2));
        yo8 yo8Var = profileActivity.f0;
        boolean c0 = sd2.c0(profileActivity.F2);
        if (yo8Var == null || yo8Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) yo8Var.getParent()).getScaleX();
        float f = yo8Var.getImageReceiver().N0 * scaleX;
        float f2 = c0 ? 0.32f * f : f;
        o9b o9bVar = new o9b(yo8Var, (byte) 0);
        float[] fArr = new float[2];
        yo8Var.getRootView().getLocationOnScreen(new int[2]);
        gm.p1(yo8Var, (ViewGroup) yo8Var.getRootView(), fArr);
        float f3 = (yo8Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f4 = (yo8Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        o9bVar.c.set(f3, f4, f3 + f, f + f4);
        o9bVar.e = yo8Var.getImageReceiver();
        o9bVar.b = f2;
        return o9bVar;
    }

    @Override // m9b
    public final void c(long j, toa toaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.P2());
        if (j == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.g1(0, profileActivity.e2() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new v56(profileActivity, (byte) 17));
        }
        gm.d3(toaVar, 30L);
    }
}
