package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wz0 implements fi.jb {
    public final /* synthetic */ ProfileActivity a;

    public wz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // fi.jb
    public final fi.nb b(long j10) {
        ProfileActivity profileActivity = this.a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.i4(), 0.0f, profileActivity.k2));
        az0 az0Var = profileActivity.e0;
        boolean isForum = ChatObject.isForum(profileActivity.E2);
        if (az0Var == null || az0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) az0Var.getParent()).getScaleX();
        float imageWidth = az0Var.getImageReceiver().getImageWidth() * scaleX;
        float f7 = isForum ? 0.32f * imageWidth : imageWidth;
        fi.lb lbVar = new fi.lb(az0Var, 0);
        float[] fArr = new float[2];
        az0Var.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(az0Var, (ViewGroup) az0Var.getRootView(), fArr);
        float imageX = (az0Var.getImageReceiver().getImageX() * scaleX) + r4[0] + fArr[0];
        float imageY = (az0Var.getImageReceiver().getImageY() * scaleX) + r4[1] + fArr[1];
        lbVar.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        lbVar.e = az0Var.getImageReceiver();
        lbVar.b = f7;
        return lbVar;
    }

    @Override // fi.jb
    public final void c(long j10, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.a;
        profileActivity.e0.setHasStories(profileActivity.q4());
        if (j10 == profileActivity.a() && profileActivity.o2 && profileActivity.k2 > 0.0f) {
            profileActivity.c.h1(0, profileActivity.c4() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new hb0(profileActivity, 15));
        }
        AndroidUtilities.runOnUIThread(r3Var, 30L);
    }
}
