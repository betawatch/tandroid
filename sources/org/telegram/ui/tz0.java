package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tz0 implements qh.s9 {
    public final /* synthetic */ ProfileActivity a;

    public tz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // qh.s9
    public final qh.x9 a(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.h2));
        yy0 yy0Var = profileActivity.b0;
        boolean isForum = ChatObject.isForum(profileActivity.B2);
        if (yy0Var == null || yy0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) yy0Var.getParent()).getScaleX();
        float imageWidth = yy0Var.getImageReceiver().getImageWidth() * scaleX;
        float f10 = isForum ? 0.32f * imageWidth : imageWidth;
        qh.u9 u9Var = new qh.u9(yy0Var, 0);
        float[] fArr = new float[2];
        yy0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(yy0Var, (ViewGroup) yy0Var.getRootView(), fArr);
        float imageX = (yy0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (yy0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        u9Var.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        u9Var.e = yy0Var.getImageReceiver();
        u9Var.b = f10;
        return u9Var;
    }

    @Override // qh.s9
    public final void b(long j10, hg.y1 y1Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.b0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.l2 && profileActivity.h2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.T3() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new pb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(y1Var, 30L);
    }
}
