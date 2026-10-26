package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uz0 implements fi.jb {
    public final /* synthetic */ ProfileActivity a;

    public uz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // fi.jb
    public final fi.nb b(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.i4(), 0.0f, profileActivity.k2));
        yy0 yy0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (yy0Var == null || yy0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) yy0Var.getParent()).getScaleX();
        float imageWidth = yy0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        fi.lb lbVar = new fi.lb(yy0Var, 0);
        float[] fArr = new float[2];
        yy0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(yy0Var, (ViewGroup) yy0Var.getRootView(), fArr);
        float imageX = (yy0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (yy0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        lbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        lbVar.e = yy0Var.getImageReceiver();
        lbVar.b = f7;
        return lbVar;
    }

    @Override // fi.jb
    public final void c(long j10, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.q4());
        if (j10 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.c4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new fb0(profileActivity, 15));
        }
        AndroidUtilities.runOnUIThread(r3Var, 30L);
    }
}
