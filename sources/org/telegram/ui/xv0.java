package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xv0 implements fi.ma {
    public final /* synthetic */ ProfileActivity a;

    public xv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // fi.ma
    public final fi.qa d(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.j2));
        cv0 cv0Var = profileActivity.e0;
        boolean c02 = org.telegram.messenger.t3.c0(profileActivity.D2);
        if (cv0Var == null || cv0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) cv0Var.getParent()).getScaleX();
        float f10 = cv0Var.getImageReceiver().M0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        fi.oa oaVar = new fi.oa(cv0Var, 0);
        float[] fArr = new float[2];
        cv0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(cv0Var, (ViewGroup) cv0Var.getRootView(), fArr);
        float f12 = (cv0Var.getImageReceiver().K0 * scaleX) + r4[0] + fArr[0];
        float f13 = (cv0Var.getImageReceiver().L0 * scaleX) + r4[1] + fArr[1];
        oaVar.c.set(f12, f13, f12 + f10, f10 + f13);
        oaVar.e = cv0Var.getImageReceiver();
        oaVar.b = f11;
        return oaVar;
    }

    @Override // fi.ma
    public final void g(long j3, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.n2 && profileActivity.j2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new m90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(r3Var, 30L);
    }
}
