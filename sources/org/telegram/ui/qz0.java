package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class qz0 implements ei.mb {
    public final /* synthetic */ ProfileActivity a;

    public qz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ei.mb
    public final ei.qb a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.e4(), 0.0f, profileActivity.l2));
        vy0 vy0Var = profileActivity.f0;
        boolean isForum = ChatObject.isForum(profileActivity.F2);
        if (vy0Var == null || vy0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) vy0Var.getParent()).getScaleX();
        float imageWidth = vy0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        ei.ob obVar = new ei.ob(vy0Var, 0);
        float[] fArr = new float[2];
        vy0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(vy0Var, (ViewGroup) vy0Var.getRootView(), fArr);
        float imageX = (vy0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (vy0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        obVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        obVar.e = vy0Var.getImageReceiver();
        obVar.b = f7;
        return obVar;
    }

    @Override // ei.mb
    public final void b(long j10, ai.v3 v3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.l4());
        if (j10 == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.V3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new ib0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(v3Var, 30L);
    }
}
