package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tv0 implements hi.ja {
    public final /* synthetic */ ProfileActivity a;

    public tv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // hi.ja
    public final hi.na a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.r4(), 0.0f, profileActivity.l2));
        xu0 xu0Var = profileActivity.f0;
        boolean c02 = org.telegram.messenger.t3.c0(profileActivity.F2);
        if (xu0Var == null || xu0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) xu0Var.getParent()).getScaleX();
        float f10 = xu0Var.getImageReceiver().N0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        hi.la laVar = new hi.la(xu0Var, 0);
        float[] fArr = new float[2];
        xu0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(xu0Var, (ViewGroup) xu0Var.getRootView(), fArr);
        float f12 = (xu0Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f13 = (xu0Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        laVar.c.set(f12, f13, f12 + f10, f10 + f13);
        laVar.e = xu0Var.getImageReceiver();
        laVar.b = f11;
        return laVar;
    }

    @Override // hi.ja
    public final void e(long j3, di.x2 x2Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.z4());
        if (j3 == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.i4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new k90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(x2Var, 30L);
    }
}
