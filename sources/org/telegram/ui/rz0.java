package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rz0 implements ph.u9 {
    public final /* synthetic */ ProfileActivity a;

    public rz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ph.u9
    public final ph.y9 a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.h2));
        wy0 wy0Var = profileActivity.b0;
        boolean isForum = ChatObject.isForum(profileActivity.B2);
        if (wy0Var == null || wy0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) wy0Var.getParent()).getScaleX();
        float imageWidth = wy0Var.getImageReceiver().getImageWidth() * scaleX;
        float f10 = isForum ? 0.32f * imageWidth : imageWidth;
        ph.w9 w9Var = new ph.w9(wy0Var, 0);
        float[] fArr = new float[2];
        wy0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(wy0Var, (ViewGroup) wy0Var.getRootView(), fArr);
        float imageX = (wy0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (wy0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        w9Var.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        w9Var.e = wy0Var.getImageReceiver();
        w9Var.b = f10;
        return w9Var;
    }

    @Override // ph.u9
    public final void b(long j10, gg.y1 y1Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.b0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.l2 && profileActivity.h2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new ob0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(y1Var, 30L);
    }
}
