package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class uv0 implements hi.ja {
    public final /* synthetic */ ProfileActivity a;

    public uv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // hi.ja
    public final hi.na a(long j3) {
        ProfileActivity profileActivity = this.a;
        if (j3 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.l2));
        zu0 zu0Var = profileActivity.f0;
        boolean c02 = org.telegram.messenger.v3.c0(profileActivity.F2);
        if (zu0Var == null || zu0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) zu0Var.getParent()).getScaleX();
        float f10 = zu0Var.getImageReceiver().N0 * scaleX;
        float f11 = c02 ? 0.32f * f10 : f10;
        hi.la laVar = new hi.la(zu0Var, 0);
        float[] fArr = new float[2];
        zu0Var.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.g0.r1(zu0Var, (ViewGroup) zu0Var.getRootView(), fArr);
        float f12 = (zu0Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f13 = (zu0Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        laVar.c.set(f12, f13, f12 + f10, f10 + f13);
        laVar.e = zu0Var.getImageReceiver();
        laVar.b = f11;
        return laVar;
    }

    @Override // hi.ja
    public final void b(long j3, bi.c4 c4Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.j4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new n90(profileActivity, 16));
        }
        org.telegram.messenger.g0.h3(c4Var, 30L);
    }
}
