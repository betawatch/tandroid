package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class uv0 implements fi.ma {
    public final /* synthetic */ ProfileActivity a;

    public uv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // fi.ma
    public final fi.qa d(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.q4(), 0.0f, profileActivity.j2));
        zu0 zu0Var = profileActivity.e0;
        boolean c02 = org.telegram.messenger.t3.c0(profileActivity.D2);
        if (zu0Var == null || zu0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) zu0Var.getParent()).getScaleX();
        float f10 = zu0Var.getImageReceiver().M0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        fi.oa oaVar = new fi.oa(zu0Var, 0);
        float[] fArr = new float[2];
        zu0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(zu0Var, (ViewGroup) zu0Var.getRootView(), fArr);
        float f12 = (zu0Var.getImageReceiver().K0 * scaleX) + r4[0] + fArr[0];
        float f13 = (zu0Var.getImageReceiver().L0 * scaleX) + r4[1] + fArr[1];
        oaVar.c.set(f12, f13, f12 + f10, f10 + f13);
        oaVar.e = zu0Var.getImageReceiver();
        oaVar.b = f11;
        return oaVar;
    }

    @Override // fi.ma
    public final void g(long j3, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.x4());
        if (j3 == profileActivity.a() && profileActivity.n2 && profileActivity.j2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new j90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(r3Var, 30L);
    }
}
