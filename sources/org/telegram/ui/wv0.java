package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wv0 implements fi.ma {
    public final /* synthetic */ ProfileActivity a;

    public wv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // fi.ma
    public final fi.qa d(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.j2));
        bv0 bv0Var = profileActivity.e0;
        boolean c02 = org.telegram.messenger.t3.c0(profileActivity.D2);
        if (bv0Var == null || bv0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) bv0Var.getParent()).getScaleX();
        float f10 = bv0Var.getImageReceiver().M0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        fi.oa oaVar = new fi.oa(bv0Var, 0);
        float[] fArr = new float[2];
        bv0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(bv0Var, (ViewGroup) bv0Var.getRootView(), fArr);
        float f12 = (bv0Var.getImageReceiver().K0 * scaleX) + r4[0] + fArr[0];
        float f13 = (bv0Var.getImageReceiver().L0 * scaleX) + r4[1] + fArr[1];
        oaVar.c.set(f12, f13, f12 + f10, f10 + f13);
        oaVar.e = bv0Var.getImageReceiver();
        oaVar.b = f11;
        return oaVar;
    }

    @Override // fi.ma
    public final void g(long j3, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.n2 && profileActivity.j2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new l90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(r3Var, 30L);
    }
}
