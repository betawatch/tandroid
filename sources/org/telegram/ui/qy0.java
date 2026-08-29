package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qy0 extends lu0 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // org.telegram.ui.lu0
    public final void c(Canvas canvas, float f9, float f10, float f11, float f12, float f13) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        if (f9 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.j0.getMeasuredWidth(), AndroidUtilities.dp(30.0f) + profileActivity.j0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f9), 31);
            profileActivity.V.draw(canvas);
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            float x4 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            canvas.translate(x4, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            lVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.aj0 aj0Var = profileActivity.v;
            if (aj0Var != null && aj0Var.getVisibility() == 0 && profileActivity.v.getAlpha() > 0.0f) {
                canvas.save();
                float f14 = (f9 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (profileActivity.v.getMeasuredWidth() / 2.0f) + profileActivity.v.getX(), (profileActivity.v.getMeasuredHeight() / 2.0f) + profileActivity.v.getY());
                canvas.translate(profileActivity.v.getX(), profileActivity.v.getY());
                profileActivity.v.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.lu0
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i10 = 0; i10 < profileActivity.j0.getChildCount(); i10++) {
            profileActivity.j0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.aj0 aj0Var = profileActivity.v;
        if (aj0Var != null) {
            aj0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.lu0
    public final boolean j(View view, ImageReceiver imageReceiver) {
        return super.j(view, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
