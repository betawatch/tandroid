// default package

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class us1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ us1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r02 r02Var;
        FrameLayout frameLayout;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = yv1Var.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    yv1Var.sa.start();
                    break;
                }
                break;
            default:
                if (yv1Var.d3 == this && (r02Var = yv1Var.b1) != null && (frameLayout = yv1Var.c3) != null) {
                    r02Var.j(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
