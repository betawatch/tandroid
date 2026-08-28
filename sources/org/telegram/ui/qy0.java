package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qy0 extends nu0 {
    public final /* synthetic */ ProfileActivity T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override // org.telegram.ui.nu0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.j0.getMeasuredWidth(), AndroidUtilities.dp(30.0f) + profileActivity.j0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
            profileActivity.V.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            float x10 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            canvas.translate(x10, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.pi0 pi0Var = profileActivity.v;
            if (pi0Var != null && pi0Var.getVisibility() == 0 && profileActivity.v.getAlpha() > 0.0f) {
                canvas.save();
                float f15 = (f10 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (profileActivity.v.getMeasuredWidth() / 2.0f) + profileActivity.v.getX(), (profileActivity.v.getMeasuredHeight() / 2.0f) + profileActivity.v.getY());
                canvas.translate(profileActivity.v.getX(), profileActivity.v.getY());
                profileActivity.v.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.nu0
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i9 = 0; i9 < profileActivity.j0.getChildCount(); i9++) {
            profileActivity.j0.getChildAt(i9).invalidate();
        }
        org.telegram.ui.Components.pi0 pi0Var = profileActivity.v;
        if (pi0Var != null) {
            pi0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.nu0
    public final boolean j(View view, ImageReceiver imageReceiver) {
        return super.j(view, imageReceiver) && this.T.a.getScrollState() != 1;
    }
}
