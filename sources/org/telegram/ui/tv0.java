package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tv0 implements hi.eb {
    public final /* synthetic */ ProfileActivity a;

    public tv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // hi.eb
    public final hi.ib a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.l2));
        yu0 yu0Var = profileActivity.f0;
        boolean c02 = org.telegram.messenger.v3.c0(profileActivity.F2);
        if (yu0Var == null || yu0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) yu0Var.getParent()).getScaleX();
        float f10 = yu0Var.getImageReceiver().N0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        hi.gb gbVar = new hi.gb(yu0Var, 0);
        float[] fArr = new float[2];
        yu0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(yu0Var, (ViewGroup) yu0Var.getRootView(), fArr);
        float f12 = (yu0Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f13 = (yu0Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        gbVar.c.set(f12, f13, f12 + f10, f10 + f13);
        gbVar.e = yu0Var.getImageReceiver();
        gbVar.b = f11;
        return gbVar;
    }

    @Override // hi.eb
    public final void c(long j3, bi.e4 e4Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new m90(profileActivity, 16));
        }
        org.telegram.messenger.g0.h3(e4Var, 30L);
    }
}
