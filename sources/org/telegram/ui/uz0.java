package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class uz0 extends ov0 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // org.telegram.ui.ov0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f7 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.n0.getMeasuredWidth(), AndroidUtilities.dp(30.0f) + profileActivity.n0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f7), 31);
            profileActivity.Z.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            float x10 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            canvas.translate(x10, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.aj0 aj0Var = profileActivity.v;
            if (aj0Var != null && aj0Var.getVisibility() == 0 && profileActivity.v.getAlpha() > 0.0f) {
                canvas.save();
                float f14 = (f7 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (profileActivity.v.getMeasuredWidth() / 2.0f) + profileActivity.v.getX(), (profileActivity.v.getMeasuredHeight() / 2.0f) + profileActivity.v.getY());
                canvas.translate(profileActivity.v.getX(), profileActivity.v.getY());
                profileActivity.v.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ov0
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i10 = 0; i10 < profileActivity.n0.getChildCount(); i10++) {
            profileActivity.n0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.aj0 aj0Var = profileActivity.v;
        if (aj0Var != null) {
            aj0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ov0
    public final boolean j(View view, ImageReceiver imageReceiver) {
        return super.j(view, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
