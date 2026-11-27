// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xq8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ xq8(ProfileActivity profileActivity, boolean z, byte b) {
        this.a = b;
        this.c = profileActivity;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.g0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        vb5 vb5Var;
        byte b = this.a;
        boolean z = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.g4(z);
                profileActivity.Y.setClickable(true);
                if (z) {
                    sla slaVar = profileActivity.U0;
                    if (slaVar.G.getWidth() != 0 && !slaVar.e.isFocused()) {
                        slaVar.e.requestFocus();
                        hl.E3(slaVar.e);
                    }
                }
                profileActivity.O2(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z) {
                    profileActivity.Y4 = true;
                    profileActivity.j3();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i = ((e) profileActivity).classGuid;
                    hl.V2(parentActivity, i);
                    profileActivity.P.setPreventMoving(false);
                    break;
                }
                break;
            default:
                if (profileActivity.g0 != null && (vb5Var = profileActivity.h0) != null) {
                    if (!z) {
                        vb5Var.setVisibility(4);
                    }
                    profileActivity.g0 = null;
                    break;
                }
                break;
        }
    }
}
