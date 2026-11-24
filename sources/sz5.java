// default package

import android.animation.ValueAnimator;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sz5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ sz5(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.v0.invalidate();
                break;
            default:
                String str2 = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
